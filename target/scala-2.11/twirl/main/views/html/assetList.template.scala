
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
object assetList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Asset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(assets: List[Asset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
</head>
<body>
    <table border=0 width=30% height=30% align=left cellpadding=1 cellspacing=1>
        <thead>
            <tr>
                <th align="left" >Asset Name</th>

            </tr>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(assets <- assets) yield /*18.31*/ {_display_(Seq[Any](format.raw/*18.33*/("""

            """),format.raw/*20.13*/("""<tr>

                <td>"""),_display_(/*22.22*/assets/*22.28*/.assetName),format.raw/*22.38*/("""</td>


            </tr>
        """)))}),format.raw/*26.10*/("""

        """),format.raw/*28.9*/("""</tbody>
    </table>

</body>
</html>"""))}
  }

  def render(assets:List[Asset]): play.twirl.api.HtmlFormat.Appendable = apply(assets)

  def f:((List[Asset]) => play.twirl.api.HtmlFormat.Appendable) = (assets) => apply(assets)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed May 06 22:37:15 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdministration/FileAdmin/app/views/assetList.scala.html
                  HASH: ca8daef7e254da876bf4ab93d5699faeb8c70716
                  MATRIX: 732->1|841->22|871->26|1236->364|1273->385|1313->387|1357->403|1413->432|1428->438|1459->448|1529->487|1568->499
                  LINES: 26->1|29->1|31->3|46->18|46->18|46->18|48->20|50->22|50->22|50->22|54->26|56->28
                  -- GENERATED --
              */
          