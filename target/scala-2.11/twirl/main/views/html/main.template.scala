
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/hello.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.70*/routes/*11.76*/.Assets.at("stylesheets/signin.css")),format.raw/*11.112*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.70*/routes/*12.76*/.Assets.at("stylesheets/heading.css")),format.raw/*12.113*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.70*/routes/*13.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*13.119*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.at("stylesheets/imageGrid.css")),format.raw/*14.115*/("""">

    </head>

    <body style="background-color : #eee">
        <div class = "logout" >
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.UserApplication.logout()),format.raw/*20.54*/(""""><button class="btn btn-primary">Logout</button></a></div>

        <img src="/assets/logo.png" />
        <br>
        <br>
        <div class="menuBar">
            <ul>
                <li style="width : 150px"><a href=""""),_display_(/*27.53*/routes/*27.59*/.UserApplication.login()),format.raw/*27.83*/("""">Home</a></li>
                <li style="width : 190px"><a href=""""),_display_(/*28.53*/routes/*28.59*/.CustomerApplication.getCust()),format.raw/*28.89*/("""">Select Customer</a></li>
            </ul>
        </div>
        <br>
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""

    """),format.raw/*34.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 10 21:49:54 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/main.scala.html
                  HASH: d20cd554a1cdd27ccaf5837f698db97e7ff97d0c
                  MATRIX: 727->1|845->31|873->33|950->84|975->89|1063->151|1077->157|1131->191|1218->252|1232->258|1284->290|1336->315|1351->321|1406->355|1537->459|1552->465|1610->501|1709->573|1724->579|1783->616|1882->688|1897->694|1962->737|2061->809|2076->815|2137->854|2278->968|2293->974|2339->999|2591->1224|2606->1230|2651->1254|2746->1322|2761->1328|2812->1358|2921->1440|2949->1447|2982->1453
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|48->20|48->20|48->20|55->27|55->27|55->27|56->28|56->28|56->28|60->32|60->32|62->34
                  -- GENERATED --
              */
          