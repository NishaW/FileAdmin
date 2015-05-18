
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
  def apply/*1.2*/(assets: List[Asset],assetForm:Form[Asset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var i=0;

Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Result page")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.FileApplication.generateThumbNails(), 'id -> "assestform")/*5.92*/ {_display_(Seq[Any](format.raw/*5.94*/("""


    """),format.raw/*8.5*/("""<table border=0 width=30% height=30% align=left cellpadding=1 cellspacing=1>
        <thead>
            <tr>
                <th align="left" >Asset ID</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*15.10*/for(asset <- assets) yield /*15.30*/ {_display_(Seq[Any](format.raw/*15.32*/("""

            """),format.raw/*17.13*/("""<tr>
                <td><input type="checkbox" name="selectedAssets["""),_display_(/*18.66*/i),format.raw/*18.67*/("""]" value=""""),_display_(/*18.78*/asset/*18.83*/.assetName),format.raw/*18.93*/(""""> """),_display_(/*18.97*/asset/*18.102*/.assetName),format.raw/*18.112*/("""<br></td>
            </tr>

            """),_display_(/*21.14*/{i += 1}),format.raw/*21.22*/("""
        """)))}),format.raw/*22.10*/("""

        """),format.raw/*24.9*/("""</tbody>
    </table>
        <input type="submit" class="btn btn-primary" value="Generate ThumbNails">
    """)))}),format.raw/*27.6*/("""
""")))}))}
  }

  def render(assets:List[Asset],assetForm:Form[Asset]): play.twirl.api.HtmlFormat.Appendable = apply(assets,assetForm)

  def f:((List[Asset],Form[Asset]) => play.twirl.api.HtmlFormat.Appendable) = (assets,assetForm) => apply(assets,assetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 17 22:29:32 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/assetList.scala.html
                  HASH: 209aa0dfb4300319f3f4985425a91c1613a76746
                  MATRIX: 744->1|912->44|940->86|968->89|995->108|1034->110|1066->117|1080->123|1168->203|1207->205|1243->215|1495->440|1531->460|1571->462|1615->478|1713->549|1735->550|1773->561|1787->566|1818->576|1849->580|1864->585|1896->595|1968->640|1997->648|2039->659|2078->671|2220->783
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|32->5|32->5|32->5|35->8|42->15|42->15|42->15|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|48->21|48->21|49->22|51->24|54->27
                  -- GENERATED --
              */
          