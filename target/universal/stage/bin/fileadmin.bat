@REM fileadmin launcher script
@REM
@REM Environment:
@REM JAVA_HOME - location of a JDK home dir (optional if java on path)
@REM CFG_OPTS  - JVM options (optional)
@REM Configuration:
@REM FILEADMIN_config.txt found in the FILEADMIN_HOME.
@setlocal enabledelayedexpansion

@echo off
if "%FILEADMIN_HOME%"=="" set "FILEADMIN_HOME=%~dp0\\.."
set ERROR_CODE=0

set "APP_LIB_DIR=%FILEADMIN_HOME%\lib\"

rem Detect if we were double clicked, although theoretically A user could
rem manually run cmd /c
for %%x in (%cmdcmdline%) do if %%~x==/c set DOUBLECLICKED=1

rem FIRST we load the config file of extra options.
set "CFG_FILE=%FILEADMIN_HOME%\FILEADMIN_config.txt"
set CFG_OPTS=
if exist %CFG_FILE% (
  FOR /F "tokens=* eol=# usebackq delims=" %%i IN ("%CFG_FILE%") DO (
    set DO_NOT_REUSE_ME=%%i
    rem ZOMG (Part #2) WE use !! here to delay the expansion of
    rem CFG_OPTS, otherwise it remains "" for this loop.
    set CFG_OPTS=!CFG_OPTS! !DO_NOT_REUSE_ME!
  )
)

rem We use the value of the JAVACMD environment variable if defined
set _JAVACMD=%JAVACMD%

if "%_JAVACMD%"=="" (
  if not "%JAVA_HOME%"=="" (
    if exist "%JAVA_HOME%\bin\java.exe" set "_JAVACMD=%JAVA_HOME%\bin\java.exe"
  )
)

if "%_JAVACMD%"=="" set _JAVACMD=java

rem Detect if this java is ok to use.
for /F %%j in ('"%_JAVACMD%" -version  2^>^&1') do (
  if %%~j==Java set JAVAINSTALLED=1
)

rem BAT has no logical or, so we do it OLD SCHOOL! Oppan Redmond Style
set JAVAOK=true
if not defined JAVAINSTALLED set JAVAOK=false

if "%JAVAOK%"=="false" (
  echo.
  echo A Java JDK is not installed or can't be found.
  if not "%JAVA_HOME%"=="" (
    echo JAVA_HOME = "%JAVA_HOME%"
  )
  echo.
  echo Please go to
  echo   http://www.oracle.com/technetwork/java/javase/downloads/index.html
  echo and download a valid Java JDK and install before running fileadmin.
  echo.
  echo If you think this message is in error, please check
  echo your environment variables to see if "java.exe" and "javac.exe" are
  echo available via JAVA_HOME or PATH.
  echo.
  if defined DOUBLECLICKED pause
  exit /B 1
)


rem We use the value of the JAVA_OPTS environment variable if defined, rather than the config.
set _JAVA_OPTS=%JAVA_OPTS%
if "%_JAVA_OPTS%"=="" set _JAVA_OPTS=%CFG_OPTS%

rem We keep in _JAVA_PARAMS all -J-prefixed and -D-prefixed arguments
rem "-J" is stripped, "-D" is left as is, and everything is appended to JAVA_OPTS
set _JAVA_PARAMS=

:param_beforeloop
if [%1]==[] goto param_afterloop
set _TEST_PARAM=%~1

rem ignore arguments that do not start with '-'
if not "%_TEST_PARAM:~0,1%"=="-" (
  shift
  goto param_beforeloop
)

set _TEST_PARAM=%~1
if "%_TEST_PARAM:~0,2%"=="-J" (
  rem strip -J prefix
  set _TEST_PARAM=%_TEST_PARAM:~2%
)

if "%_TEST_PARAM:~0,2%"=="-D" (
  rem test if this was double-quoted property "-Dprop=42"
  for /F "delims== tokens=1-2" %%G in ("%_TEST_PARAM%") DO (
    if not "%%G" == "%_TEST_PARAM%" (
      rem double quoted: "-Dprop=42" -> -Dprop="42"
      set _JAVA_PARAMS=%%G="%%H"
    ) else if [%2] neq [] (
      rem it was a normal property: -Dprop=42 or -Drop="42"
      set _JAVA_PARAMS=%_TEST_PARAM%=%2
      shift
    )
  )
) else (
  rem a JVM property, we just append it
  set _JAVA_PARAMS=%_TEST_PARAM%
)

:param_loop
shift

if [%1]==[] goto param_afterloop
set _TEST_PARAM=%~1

rem ignore arguments that do not start with '-'
if not "%_TEST_PARAM:~0,1%"=="-" goto param_loop

set _TEST_PARAM=%~1
if "%_TEST_PARAM:~0,2%"=="-J" (
  rem strip -J prefix
  set _TEST_PARAM=%_TEST_PARAM:~2%
)

if "%_TEST_PARAM:~0,2%"=="-D" (
  rem test if this was double-quoted property "-Dprop=42"
  for /F "delims== tokens=1-2" %%G in ("%_TEST_PARAM%") DO (
    if not "%%G" == "%_TEST_PARAM%" (
      rem double quoted: "-Dprop=42" -> -Dprop="42"
      set _JAVA_PARAMS=%_JAVA_PARAMS% %%G="%%H"
    ) else if [%2] neq [] (
      rem it was a normal property: -Dprop=42 or -Drop="42"
      set _JAVA_PARAMS=%_JAVA_PARAMS% %_TEST_PARAM%=%2
      shift
    )
  )
) else (
  rem a JVM property, we just append it
  set _JAVA_PARAMS=%_JAVA_PARAMS% %_TEST_PARAM%
)
goto param_loop
:param_afterloop

set _JAVA_OPTS=%_JAVA_OPTS% %_JAVA_PARAMS%
:run
 
set "APP_CLASSPATH=%APP_LIB_DIR%\fileadmin.fileadmin-1.0.jar;%APP_LIB_DIR%\core-3.4-SNAPSHOT.jar;%APP_LIB_DIR%\HikariCP-java6-2.3.5.jar;%APP_LIB_DIR%\play-java-jdbc_2.11.jar;%APP_LIB_DIR%\sqljdbc4.jar;%APP_LIB_DIR%\org.scala-lang.scala-library-2.11.1.jar;%APP_LIB_DIR%\com.typesafe.play.twirl-api_2.11-1.0.2.jar;%APP_LIB_DIR%\org.apache.commons.commons-lang3-3.1.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-xml_2.11-1.0.1.jar;%APP_LIB_DIR%\com.typesafe.play.play_2.11-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.build-link-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.play-exceptions-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.play-iteratees_2.11-2.3.6.jar;%APP_LIB_DIR%\org.scala-stm.scala-stm_2.11-0.7.jar;%APP_LIB_DIR%\com.typesafe.config-1.2.1.jar;%APP_LIB_DIR%\com.typesafe.play.play-json_2.11-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.play-functional_2.11-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.play-datacommons_2.11-2.3.6.jar;%APP_LIB_DIR%\joda-time.joda-time-2.3.jar;%APP_LIB_DIR%\org.joda.joda-convert-1.6.jar;%APP_LIB_DIR%\com.fasterxml.jackson.core.jackson-annotations-2.3.2.jar;%APP_LIB_DIR%\com.fasterxml.jackson.core.jackson-core-2.3.2.jar;%APP_LIB_DIR%\com.fasterxml.jackson.core.jackson-databind-2.3.2.jar;%APP_LIB_DIR%\org.scala-lang.scala-reflect-2.11.1.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-parser-combinators_2.11-1.0.1.jar;%APP_LIB_DIR%\io.netty.netty-3.9.3.Final.jar;%APP_LIB_DIR%\com.typesafe.netty.netty-http-pipelining-1.1.2.jar;%APP_LIB_DIR%\org.slf4j.jul-to-slf4j-1.7.6.jar;%APP_LIB_DIR%\com.typesafe.akka.akka-actor_2.11-2.3.4.jar;%APP_LIB_DIR%\com.typesafe.akka.akka-slf4j_2.11-2.3.4.jar;%APP_LIB_DIR%\commons-codec.commons-codec-1.9.jar;%APP_LIB_DIR%\xerces.xercesImpl-2.11.0.jar;%APP_LIB_DIR%\xml-apis.xml-apis-1.4.01.jar;%APP_LIB_DIR%\javax.transaction.jta-1.1.jar;%APP_LIB_DIR%\com.typesafe.play.play-java_2.11-2.3.6.jar;%APP_LIB_DIR%\org.yaml.snakeyaml-1.13.jar;%APP_LIB_DIR%\org.hibernate.hibernate-validator-5.0.3.Final.jar;%APP_LIB_DIR%\javax.validation.validation-api-1.1.0.Final.jar;%APP_LIB_DIR%\org.jboss.logging.jboss-logging-3.1.1.GA.jar;%APP_LIB_DIR%\com.fasterxml.classmate-1.0.0.jar;%APP_LIB_DIR%\org.springframework.spring-context-4.0.3.RELEASE.jar;%APP_LIB_DIR%\org.springframework.spring-core-4.0.3.RELEASE.jar;%APP_LIB_DIR%\org.springframework.spring-beans-4.0.3.RELEASE.jar;%APP_LIB_DIR%\org.reflections.reflections-0.9.8.jar;%APP_LIB_DIR%\dom4j.dom4j-1.6.1.jar;%APP_LIB_DIR%\org.apache.tomcat.tomcat-servlet-api-8.0.5.jar;%APP_LIB_DIR%\com.typesafe.play.play-java-jdbc_2.11-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.play-jdbc_2.11-2.3.6.jar;%APP_LIB_DIR%\com.jolbox.bonecp-0.8.0.RELEASE.jar;%APP_LIB_DIR%\com.h2database.h2-1.3.175.jar;%APP_LIB_DIR%\tyrex.tyrex-1.0.1.jar;%APP_LIB_DIR%\com.typesafe.play.play-java-ebean_2.11-2.3.6.jar;%APP_LIB_DIR%\org.avaje.ebeanorm.avaje-ebeanorm-3.3.4.jar;%APP_LIB_DIR%\org.avaje.ebeanorm.avaje-ebeanorm-agent-3.2.2.jar;%APP_LIB_DIR%\org.hibernate.javax.persistence.hibernate-jpa-2.0-api-1.0.1.Final.jar;%APP_LIB_DIR%\com.typesafe.play.play-cache_2.11-2.3.6.jar;%APP_LIB_DIR%\net.sf.ehcache.ehcache-core-2.6.8.jar;%APP_LIB_DIR%\com.typesafe.play.play-java-ws_2.11-2.3.6.jar;%APP_LIB_DIR%\com.typesafe.play.play-ws_2.11-2.3.6.jar;%APP_LIB_DIR%\com.ning.async-http-client-1.8.14.jar;%APP_LIB_DIR%\oauth.signpost.signpost-core-1.2.1.2.jar;%APP_LIB_DIR%\oauth.signpost.signpost-commonshttp4-1.2.1.2.jar;%APP_LIB_DIR%\org.apache.httpcomponents.httpcore-4.0.1.jar;%APP_LIB_DIR%\org.apache.httpcomponents.httpclient-4.0.1.jar;%APP_LIB_DIR%\commons-logging.commons-logging-1.1.1.jar;%APP_LIB_DIR%\se.c2.core-3.4-SNAPSHOT.jar;%APP_LIB_DIR%\se.brandairport.imageconverter-1.6.5.jar;%APP_LIB_DIR%\com.google.guava.guava-18.0.jar;%APP_LIB_DIR%\ch.qos.logback.logback-classic-1.1.3.jar;%APP_LIB_DIR%\ch.qos.logback.logback-core-1.1.3.jar;%APP_LIB_DIR%\org.slf4j.slf4j-api-1.7.12.jar;%APP_LIB_DIR%\se.c2.inzoom-unversioned.jar;%APP_LIB_DIR%\se.c2.chart-unversioned.jar;%APP_LIB_DIR%\quicktime.quicktime-unversioned.jar;%APP_LIB_DIR%\net.sourceforge.jtds.jtds-1.3.1.jar;%APP_LIB_DIR%\org.apache.pdfbox.pdfbox-1.8.9.jar;%APP_LIB_DIR%\org.apache.pdfbox.fontbox-1.8.9.jar;%APP_LIB_DIR%\org.apache.pdfbox.jempbox-1.8.9.jar;%APP_LIB_DIR%\org.slf4j.jcl-over-slf4j-1.7.12.jar;%APP_LIB_DIR%\org.apache.poi.poi-3.10-FINAL.jar;%APP_LIB_DIR%\xuggle.xuggle-xuggler-5.4.jar;%APP_LIB_DIR%\commons-cli.commons-cli-1.1.jar;%APP_LIB_DIR%\org.apache.tika.tika-core-1.7.jar;%APP_LIB_DIR%\org.apache.tika.tika-parsers-1.7.jar;%APP_LIB_DIR%\org.gagravarr.vorbis-java-tika-0.6.jar;%APP_LIB_DIR%\edu.ucar.netcdf-4.2.20.jar;%APP_LIB_DIR%\edu.ucar.unidataCommon-4.2.20.jar;%APP_LIB_DIR%\net.jcip.jcip-annotations-1.0.jar;%APP_LIB_DIR%\commons-httpclient.commons-httpclient-3.1.jar;%APP_LIB_DIR%\net.sourceforge.jmatio.jmatio-1.0.jar;%APP_LIB_DIR%\org.apache.james.apache-mime4j-core-0.7.2.jar;%APP_LIB_DIR%\org.apache.james.apache-mime4j-dom-0.7.2.jar;%APP_LIB_DIR%\org.apache.commons.commons-compress-1.9.jar;%APP_LIB_DIR%\org.tukaani.xz-1.5.jar;%APP_LIB_DIR%\org.bouncycastle.bcmail-jdk15-1.45.jar;%APP_LIB_DIR%\org.bouncycastle.bcprov-jdk15-1.45.jar;%APP_LIB_DIR%\org.apache.poi.poi-scratchpad-3.11.jar;%APP_LIB_DIR%\org.apache.poi.poi-ooxml-3.11.jar;%APP_LIB_DIR%\org.apache.poi.poi-ooxml-schemas-3.11.jar;%APP_LIB_DIR%\org.apache.xmlbeans.xmlbeans-2.6.0.jar;%APP_LIB_DIR%\org.ccil.cowan.tagsoup.tagsoup-1.2.1.jar;%APP_LIB_DIR%\org.ow2.asm.asm-debug-all-4.1.jar;%APP_LIB_DIR%\com.googlecode.mp4parser.isoparser-1.0.2.jar;%APP_LIB_DIR%\org.aspectj.aspectjrt-1.8.0.jar;%APP_LIB_DIR%\com.drewnoakes.metadata-extractor-2.6.2.jar;%APP_LIB_DIR%\com.adobe.xmp.xmpcore-5.1.2.jar;%APP_LIB_DIR%\de.l3s.boilerpipe.boilerpipe-1.1.0.jar;%APP_LIB_DIR%\rome.rome-1.0.jar;%APP_LIB_DIR%\jdom.jdom-1.0.jar;%APP_LIB_DIR%\org.gagravarr.vorbis-java-core-0.6.jar;%APP_LIB_DIR%\com.googlecode.juniversalchardet.juniversalchardet-1.0.3.jar;%APP_LIB_DIR%\com.uwyn.jhighlight-1.0.jar;%APP_LIB_DIR%\com.pff.java-libpst-0.8.1.jar;%APP_LIB_DIR%\cewolf.cewolf-unversioned.jar;%APP_LIB_DIR%\org.apache.geronimo.specs.geronimo-jms_1.1_spec-1.1.1.jar;%APP_LIB_DIR%\se.c2.photoshop-unversioned.jar;%APP_LIB_DIR%\commons-fileupload.commons-fileupload-1.3.1.jar;%APP_LIB_DIR%\commons-io.commons-io-2.4.jar;%APP_LIB_DIR%\org.apache.ant.ant-1.9.4.jar;%APP_LIB_DIR%\org.apache.ant.ant-launcher-1.9.4.jar;%APP_LIB_DIR%\javax.xml.javaxrpc.axis-unversioned.jar;%APP_LIB_DIR%\org.apache.axis.axis-1.4.jar;%APP_LIB_DIR%\org.apache.axis.axis-ant-1.4.jar;%APP_LIB_DIR%\javax.xml.jaxrpc-api-1.1.jar;%APP_LIB_DIR%\com.cete.dynamicpdf-4.0.0.jar;%APP_LIB_DIR%\velocity.velocity-1.5.jar;%APP_LIB_DIR%\commons-lang.commons-lang-2.6.jar;%APP_LIB_DIR%\oro.oro-2.0.8.jar;%APP_LIB_DIR%\javax.mail.mail-1.5.0-b01.jar;%APP_LIB_DIR%\javax.activation.activation-1.1.jar;%APP_LIB_DIR%\javax.media.jmf-2.1.1e.jar;%APP_LIB_DIR%\de.ueberdosis.id3-1.6.0d9.jar;%APP_LIB_DIR%\commons-discovery.commons-discovery-0.5.jar;%APP_LIB_DIR%\com.google.inject.guice-3.0.jar;%APP_LIB_DIR%\javax.inject.javax.inject-1.jar;%APP_LIB_DIR%\aopalliance.aopalliance-1.0.jar;%APP_LIB_DIR%\org.sonatype.sisu.inject.cglib-2.2.1-v20090111.jar;%APP_LIB_DIR%\asm.asm-3.1.jar;%APP_LIB_DIR%\com.google.inject.extensions.guice-servlet-3.0.jar;%APP_LIB_DIR%\org.apache.activemq.activemq-core-5.7.0.jar;%APP_LIB_DIR%\org.fusesource.mqtt-client.mqtt-client-1.3.jar;%APP_LIB_DIR%\org.fusesource.hawtdispatch.hawtdispatch-transport-1.11.jar;%APP_LIB_DIR%\org.fusesource.hawtdispatch.hawtdispatch-1.11.jar;%APP_LIB_DIR%\org.fusesource.hawtbuf.hawtbuf-1.9.jar;%APP_LIB_DIR%\org.apache.geronimo.specs.geronimo-j2ee-management_1.1_spec-1.0.1.jar;%APP_LIB_DIR%\com.zaxxer.HikariCP-java6-2.3.5.jar;%APP_LIB_DIR%\org.javassist.javassist-3.19.0-GA.jar;%APP_LIB_DIR%\com.google.code.findbugs.jsr305-3.0.0.jar;%APP_LIB_DIR%\org.apache.maven.maven-artifact-3.3.1.jar;%APP_LIB_DIR%\org.codehaus.plexus.plexus-utils-3.0.20.jar;%APP_LIB_DIR%\fileadmin.fileadmin-1.0-assets.jar"
set "APP_MAIN_CLASS=play.core.server.NettyServer"

rem Call the application and pass all arguments unchanged.
"%_JAVACMD%" %_JAVA_OPTS% %FILEADMIN_OPTS% -cp "%APP_CLASSPATH%" %APP_MAIN_CLASS% %*
if ERRORLEVEL 1 goto error
goto end

:error
set ERROR_CODE=1

:end

@endlocal

exit /B %ERROR_CODE%
