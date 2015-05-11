
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
        <body>

"""),_display_(/*15.2*/main("Login form")/*15.20*/ {_display_(Seq[Any](format.raw/*15.22*/("""
    """),_display_(/*16.6*/helper/*16.12*/.form(action = routes.UserApplication.login())/*16.58*/ {_display_(Seq[Any](format.raw/*16.60*/("""
        """),format.raw/*17.9*/("""<div class="container">
            <fieldset>
                <h3 class="form-signin-heading">Please sign in</h3>
                 <br>
                """),_display_(/*21.18*/helper/*21.24*/.inputText(userForm("username"), '_label -> "Username", '_placeholder -> "Enter username")),format.raw/*21.114*/("""
                """),_display_(/*22.18*/helper/*22.24*/.inputPassword(userForm("password"),'_label -> "Password", '_placeholder -> "Enter password")),format.raw/*22.117*/("""

            """),format.raw/*24.13*/("""</fieldset>



            <input type="submit" class="btn btn-primary" value="Sign in">

        </div> <!-- /container -->
        </body>

    </html>

    """)))}),format.raw/*35.6*/("""
""")))}),format.raw/*36.2*/("""

"""))}
  }

  def render(userForm:Form[FileAdminUser]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[FileAdminUser]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 11 10:55:20 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/index.scala.html
                  HASH: 4b48244b1b9e78cc37da3bfa496b52f8686fea80
                  MATRIX: 736->1|902->31|930->86|1074->204|1088->210|1152->253|1255->330|1269->336|1326->372|1382->402|1396->408|1458->450|1577->543|1604->561|1644->563|1677->570|1692->576|1747->622|1787->624|1824->634|2009->792|2024->798|2136->888|2182->907|2197->913|2312->1006|2356->1022|2557->1193|2590->1196
                  LINES: 26->1|30->1|31->4|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|42->15|42->15|42->15|43->16|43->16|43->16|43->16|44->17|48->21|48->21|48->21|49->22|49->22|49->22|51->24|62->35|63->36
                  -- GENERATED --
              */
          