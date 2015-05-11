
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
object homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[FileAdminUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(created: FileAdminUser):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""
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

  def render(created:FileAdminUser): play.twirl.api.HtmlFormat.Appendable = apply(created)

  def f:((FileAdminUser) => play.twirl.api.HtmlFormat.Appendable) = (created) => apply(created)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 11 10:01:41 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/homepage.scala.html
                  HASH: 45e3932f5ecb991287f11029c24965fd41f02e7e
                  MATRIX: 733->1|845->25|873->27|1047->174|1075->175|1111->185|1277->324|1306->325|1345->337|1385->349|1414->350|1451->360|1586->468|1615->469|1654->481|1694->493|1723->494|1760->504|1853->570|1882->571|1921->583|1960->594|1989->595|2026->605|2305->857|2334->858|2373->870|2429->898|2458->899|2495->909|2587->974|2616->975|2653->985|3453->1758|3484->1768
                  LINES: 26->1|29->1|30->2|36->8|36->8|37->9|43->15|43->15|45->17|45->17|45->17|46->18|50->22|50->22|52->24|52->24|52->24|53->25|56->28|56->28|58->30|58->30|58->30|59->31|67->39|67->39|69->41|69->41|69->41|70->42|72->44|72->44|73->45|93->65|93->65
                  -- GENERATED --
              */
          