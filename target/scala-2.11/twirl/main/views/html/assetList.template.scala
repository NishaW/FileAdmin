
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
object assetList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Asset],Form[Asset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(assets: List[Asset], assetForm: Form[Asset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var i = 0;

Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Result page")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.FileApplication.generateThumbNails(), 'id -> "assestform")/*5.92*/ {_display_(Seq[Any](format.raw/*5.94*/("""


        """),format.raw/*8.9*/("""<table border=0 width=30% height=30% align=left cellpadding=1 cellspacing=1>
            <thead>
                <tr>
                    <th align="left" >Asset ID</th>
                </tr>
            </thead>
            <tbody style="height: 900px">
            """),_display_(/*15.14*/for(asset <- assets) yield /*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""

                """),format.raw/*17.17*/("""<tr>
                    <td><input type="checkbox" name="selectedAssets["""),_display_(/*18.70*/i),format.raw/*18.71*/("""]" value=""""),_display_(/*18.82*/asset/*18.87*/.assetName),format.raw/*18.97*/(""""> """),_display_(/*18.101*/asset/*18.106*/.assetName),format.raw/*18.116*/(""" """),format.raw/*18.117*/("""<br></td>
                </tr>

                """),_display_(/*21.18*/{
                    i += 1
                }),format.raw/*23.18*/("""
            """)))}),format.raw/*24.14*/("""

            """),format.raw/*26.13*/("""</tbody>
        </table>
        <input type="submit" class="btn btn-primary" value="Generate ThumbNails">
    """)))}),format.raw/*29.6*/("""
""")))}))}
  }

  def render(assets:List[Asset],assetForm:Form[Asset]): play.twirl.api.HtmlFormat.Appendable = apply(assets,assetForm)

  def f:((List[Asset],Form[Asset]) => play.twirl.api.HtmlFormat.Appendable) = (assets,assetForm) => apply(assets,assetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 26 21:25:15 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/assetList.scala.html
                  HASH: 42d394059c13ed3aeea74b302b4e50e1915a490c
                  MATRIX: 744->1|916->46|944->90|972->93|999->112|1038->114|1070->121|1084->127|1172->207|1211->209|1251->223|1553->498|1589->518|1629->520|1677->540|1779->615|1801->616|1839->627|1853->632|1884->642|1916->646|1931->651|1963->661|1993->662|2073->715|2142->763|2188->778|2232->794|2378->910
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|32->5|32->5|32->5|35->8|42->15|42->15|42->15|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|48->21|50->23|51->24|53->26|56->29
                  -- GENERATED --
              */
          