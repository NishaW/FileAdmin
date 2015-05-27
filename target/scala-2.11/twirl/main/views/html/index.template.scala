
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
  def apply/*1.2*/(userForm: Form[FileAdminUser]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.33*/("""
    """),format.raw/*3.1*/("""    """),format.raw/*4.1*/("""<!DOCTYPE html>
    <html>
        <head>
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.74*/routes/*7.80*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*7.123*/("""">
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*8.74*/routes/*8.80*/.Assets.at("stylesheets/signin.css")),format.raw/*8.116*/("""">
            <script src=""""),_display_(/*9.27*/routes/*9.33*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*9.75*/("""" type="text/javascript"></script>

        </head>
        <h1></h1>
        <body style="background-color : #eee">

        """),_display_(/*15.10*/helper/*15.16*/.form(action = routes.UserApplication.login())/*15.62*/ {_display_(Seq[Any](format.raw/*15.64*/("""
            """),format.raw/*16.13*/("""<div class="container">
                <fieldset>
                    <h3 class="form-signin-heading">File Admin Login</h3>
                    <br>
                        """),_display_(/*20.26*/helper/*20.32*/.inputText(userForm("username"), '_label -> "Username", '_placeholder -> "Enter username")),format.raw/*20.122*/("""
                        """),_display_(/*21.26*/helper/*21.32*/.inputPassword(userForm("password"), '_label -> "Password", '_placeholder -> "Enter password")),format.raw/*21.126*/("""

                """),format.raw/*23.17*/("""</fieldset>

                <input type="submit" class="btn btn-primary" value="Sign in">

            </div> <!-- /container -->
        </body>

    </html>

""")))}),format.raw/*32.2*/("""


"""))}
  }

  def render(userForm:Form[FileAdminUser]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[FileAdminUser]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 24 22:59:40 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/index.scala.html
                  HASH: a6126d95a216d9b6ae37f92a919c0b4e8a268fd8
                  MATRIX: 736->1|903->32|935->56|965->95|1109->213|1123->219|1187->262|1290->339|1304->345|1361->381|1417->411|1431->417|1493->459|1653->592|1668->598|1723->644|1763->646|1805->660|2011->839|2026->845|2138->935|2192->962|2207->968|2323->1062|2371->1082|2572->1253
                  LINES: 26->1|30->1|31->3|31->4|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|42->15|42->15|42->15|42->15|43->16|47->20|47->20|47->20|48->21|48->21|48->21|50->23|59->32
                  -- GENERATED --
              */
          