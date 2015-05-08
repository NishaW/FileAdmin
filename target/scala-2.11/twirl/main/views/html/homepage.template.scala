
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
object homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8">
        <title>Home page</title>
        <style>
        .menuBar """),format.raw/*8.18*/("""{"""),format.raw/*8.19*/("""
        """),format.raw/*9.9*/("""width: 100%;
        margin: 0 auto;
        overflow: hidden;
        height: 40px;
        background-color : lightblue ;

        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""

        """),format.raw/*17.9*/(""".menuBar ul """),format.raw/*17.21*/("""{"""),format.raw/*17.22*/("""
        """),format.raw/*18.9*/("""list-style-type : none ;
        margin : 0 ;
        padding : 0 ;
        overflow : hidden ;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        """),format.raw/*24.9*/(""".menuBar li """),format.raw/*24.21*/("""{"""),format.raw/*24.22*/("""
        """),format.raw/*25.9*/("""float : left ;
        background-color : lightblue ;

        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""

        """),format.raw/*30.9*/(""".menuBar a """),format.raw/*30.20*/("""{"""),format.raw/*30.21*/("""
        """),format.raw/*31.9*/("""display : block ;
        font-weight : bold ;
        color : #000000 ;
        background-color : lightblue ;
        text-align : center ;
        padding : 4px ;
        text-decoration : none ;
        text-transform : uppercase ;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""

        """),format.raw/*41.9*/(""".menuBar a:hover, a :active """),format.raw/*41.37*/("""{"""),format.raw/*41.38*/("""
        """),format.raw/*42.9*/("""background-color : deepskyblue ;
        height: 40px;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""
        """),format.raw/*45.9*/("""</style>

    </head>

    <body bgcolor ="#eee">
        <img src="/assets/logo.png" />
        <br>
        <br>
        <div class="menuBar">
        <ul>
            <li style="width: 150px"><a href="routes.CustomerApplication.home()">Home</a></li>
            <li style="width: 150px"><a href="getcust">Test customer list</a></li>
            <li style="width: 150px"><a href="test">Test Method</a></li>
            <li style="width: 150px"><a href="asset">Asset List</a></li>
            <li style="width: 150px"><a href="cusList" target="iframe_a">Customer</a></li>
            <li style="width: 150px"><a href="#contact"></a></li>

        </ul>
        </div>
        <br>
        <iframe width="90%" height="500px"  style="border: blue" src=""""),_display_(/*65.72*/{"iframe"}),format.raw/*65.82*/("""" name="iframe_a"></iframe>

    </body>
</html>"""))}
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 05 23:12:19 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdministration/FileAdmin/app/views/homepage.scala.html
                  HASH: 1ddcb5c06f018f9393cdbd2f63bdcea88cbfd9d1
                  MATRIX: 734->1|849->28|877->30|1051->177|1079->178|1115->188|1281->327|1310->328|1349->340|1389->352|1418->353|1455->363|1590->471|1619->472|1658->484|1698->496|1727->497|1764->507|1857->573|1886->574|1925->586|1964->597|1993->598|2030->608|2309->860|2338->861|2377->873|2433->901|2462->902|2499->912|2591->977|2620->978|2657->988|3457->1761|3488->1771
                  LINES: 26->1|29->1|30->2|36->8|36->8|37->9|43->15|43->15|45->17|45->17|45->17|46->18|50->22|50->22|52->24|52->24|52->24|53->25|56->28|56->28|58->30|58->30|58->30|59->31|67->39|67->39|69->41|69->41|69->41|70->42|72->44|72->44|73->45|93->65|93->65
                  -- GENERATED --
              */
          