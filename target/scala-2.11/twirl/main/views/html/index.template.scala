
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[FileAdminUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:Form[FileAdminUser]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
    <html>
        <head>
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.74*/routes/*7.80*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*7.123*/("""">
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*8.74*/routes/*8.80*/.Assets.at("stylesheets/signin.css")),format.raw/*8.116*/("""">
            <script src=""""),_display_(/*9.27*/routes/*9.33*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*9.75*/("""" type="text/javascript"></script>

        </head>
        <h1></h1>
        <body style="background-color:#eee">

    """),_display_(/*15.6*/helper/*15.12*/.form(action = routes.UserApplication.login())/*15.58*/ {_display_(Seq[Any](format.raw/*15.60*/("""
        """),format.raw/*16.9*/("""<div class="container">
            <fieldset>
                <h3 class="form-signin-heading">File Admin Login</h3>
                 <br>
                """),_display_(/*20.18*/helper/*20.24*/.inputText(userForm("username"), '_label -> "Username", '_placeholder -> "Enter username")),format.raw/*20.114*/("""
                """),_display_(/*21.18*/helper/*21.24*/.inputPassword(userForm("password"),'_label -> "Password", '_placeholder -> "Enter password")),format.raw/*21.117*/("""

            """),format.raw/*23.13*/("""</fieldset>



            <input type="submit" class="btn btn-primary" value="Sign in">

        </div> <!-- /container -->
        </body>

    </html>

    """)))}),format.raw/*34.6*/("""


"""))}
  }

  def render(userForm:Form[FileAdminUser]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[FileAdminUser]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu May 14 19:10:57 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/index.scala.html
                  HASH: 61a34949c244f017b1c51dfdd83090016901dba2
                  MATRIX: 736->1|902->31|930->86|1074->204|1088->210|1152->253|1255->330|1269->336|1326->372|1382->402|1396->408|1458->450|1611->577|1626->583|1681->629|1721->631|1758->641|1945->801|1960->807|2072->897|2118->916|2133->922|2248->1015|2292->1031|2493->1202
                  LINES: 26->1|30->1|31->4|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|42->15|42->15|42->15|42->15|43->16|47->20|47->20|47->20|48->21|48->21|48->21|50->23|61->34
                  -- GENERATED --
              */
          