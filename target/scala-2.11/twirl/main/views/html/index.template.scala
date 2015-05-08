
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[SystemUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:Form[SystemUser]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
    <html>
        <head>
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.74*/routes/*7.80*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*7.123*/("""">
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*8.74*/routes/*8.80*/.Assets.at("stylesheets/signin.css")),format.raw/*8.116*/("""">
            <script src=""""),_display_(/*9.27*/routes/*9.33*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*9.75*/("""" type="text/javascript"></script>

        </head>
        <h1></h1>
        <body>

"""),_display_(/*15.2*/main("Login form")/*15.20*/ {_display_(Seq[Any](format.raw/*15.22*/("""
    """),_display_(/*16.6*/helper/*16.12*/.form(action = routes.CustomerApplication.home())/*16.61*/ {_display_(Seq[Any](format.raw/*16.63*/("""
        """),format.raw/*17.9*/("""<div class="container">
            <fieldset>
                <h3 class="form-signin-heading">Please sign in</h3>
                 <br>
                """),_display_(/*21.18*/helper/*21.24*/.inputText(userForm("username"), '_label -> "Username", '_placeholder -> "Enter username")),format.raw/*21.114*/("""
                    """),_display_(/*22.22*/helper/*22.28*/.inputPassword(userForm("password"),'_label -> "Password", '_placeholder -> "Enter password")),format.raw/*22.121*/("""

            """),format.raw/*24.13*/("""</fieldset>



            <input type="submit" class="btn btn-primary" value="Sign in">

        </div> <!-- /container -->
        </body>

    </html>

    """)))}),format.raw/*35.6*/("""
""")))}),format.raw/*36.2*/("""

"""))}
  }

  def render(userForm:Form[SystemUser]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[SystemUser]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 05 16:03:24 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdministration/FileAdmin/app/views/index.scala.html
                  HASH: 27faeecf6f63cd49256feacca73fe93958e8a4e0
                  MATRIX: 733->1|896->28|924->83|1068->201|1082->207|1146->250|1249->327|1263->333|1320->369|1376->399|1390->405|1452->447|1571->540|1598->558|1638->560|1671->567|1686->573|1744->622|1784->624|1821->634|2006->792|2021->798|2133->888|2183->911|2198->917|2313->1010|2357->1026|2558->1197|2591->1200
                  LINES: 26->1|30->1|31->4|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|42->15|42->15|42->15|43->16|43->16|43->16|43->16|44->17|48->21|48->21|48->21|49->22|49->22|49->22|51->24|62->35|63->36
                  -- GENERATED --
              */
          