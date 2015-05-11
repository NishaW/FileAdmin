import play.PlayJava

name := "FileAdmin"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( javaJdbc , javaEbean , cache , javaWs, "se.c2"%"core_web"%"1.5-SNAPSHOT","javax.mail"%"mail"%"1.4.7", "com.zaxxer"%"HikariCP-java6"%"2.3.5" )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers +=("Local Maven Repository" at "file:///C:/Users/Nisha/.m2/repository")



