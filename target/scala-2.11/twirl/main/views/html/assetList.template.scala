
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

                <td><input type="checkbox" name="selectAsset" value="Bike">"""),_display_(/*22.77*/assets/*22.83*/.assetName),format.raw/*22.93*/("""<br></td>


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
                  DATE: Tue May 12 13:41:40 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/assetList.scala.html
                  HASH: 281f2651c8b54dbfff54defeadcb7d29ce255540
                  MATRIX: 732->1|841->22|871->26|1236->364|1273->385|1313->387|1357->403|1468->487|1483->493|1514->503|1588->546|1627->558
                  LINES: 26->1|29->1|31->3|46->18|46->18|46->18|48->20|50->22|50->22|50->22|54->26|56->28
                  -- GENERATED --
              */
          