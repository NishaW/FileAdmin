
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
object assetList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Asset],Integer,Form[Asset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(assets: List[Asset], numberOfPages: Integer, assetForm: Form[Asset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var i = 0;

Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Result page")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.FileApplication.generateThumbNails(), 'id -> "assestform")/*5.92*/ {_display_(Seq[Any](format.raw/*5.94*/("""


        """),format.raw/*8.9*/("""<table border=0 width=30% height=30% align=left cellpadding=1 cellspacing=1>
            <thead>
                <tr>
                <tr>
                    <th align="left" >Asset ID</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*16.14*/for(asset <- assets) yield /*16.34*/ {_display_(Seq[Any](format.raw/*16.36*/("""

                """),format.raw/*18.17*/("""<tr>
                    <td><input type="checkbox" name="selectedAssets["""),_display_(/*19.70*/i),format.raw/*19.71*/("""]" value=""""),_display_(/*19.82*/asset/*19.87*/.assetName),format.raw/*19.97*/(""""> """),_display_(/*19.101*/asset/*19.106*/.assetName),format.raw/*19.116*/(""" """),format.raw/*19.117*/("""<br></td>
                </tr>

                """),_display_(/*22.18*/{
                    i += 1
                }),format.raw/*24.18*/("""
            """)))}),format.raw/*25.14*/("""

            """),format.raw/*27.13*/("""</tbody>
        </table>
        <table border=0 width=30% height=30% align=left cellpadding=1 cellspacing=1>
            <thead>
                <tr>
                    """),_display_(/*32.22*/{var j = 1;}),format.raw/*32.34*/("""
                    """),_display_(/*33.22*/for(j <- 1 to numberOfPages) yield /*33.50*/ {_display_(Seq[Any](format.raw/*33.52*/("""
                        """),format.raw/*34.25*/("""<td><a href=""""),_display_(/*34.39*/routes/*34.45*/.FileApplication.getAssetList(j)),format.raw/*34.77*/("""">&nbsp;"""),_display_(/*34.86*/j),format.raw/*34.87*/("""</a></td>
                    """)))}),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""<td>&nbsp;pages</td>
                </tr>
        </table>
        <br>
        <br>
        <br>
        <input type="submit" class="btn btn-primary" value="Generate ThumbNails">
    """)))}),format.raw/*43.6*/("""
""")))}))}
  }

  def render(assets:List[Asset],numberOfPages:Integer,assetForm:Form[Asset]): play.twirl.api.HtmlFormat.Appendable = apply(assets,numberOfPages,assetForm)

  def f:((List[Asset],Integer,Form[Asset]) => play.twirl.api.HtmlFormat.Appendable) = (assets,numberOfPages,assetForm) => apply(assets,numberOfPages,assetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 18 10:29:01 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/assetList.scala.html
                  HASH: 09d09bc98d09638703cb9cfce8932c8798c94dab
                  MATRIX: 752->1|948->70|976->114|1004->117|1031->136|1070->138|1102->145|1116->151|1204->231|1243->233|1283->247|1585->522|1621->542|1661->544|1709->564|1811->639|1833->640|1871->651|1885->656|1916->666|1948->670|1963->675|1995->685|2025->686|2105->739|2174->787|2220->802|2264->818|2469->996|2502->1008|2552->1031|2596->1059|2636->1061|2690->1087|2731->1101|2746->1107|2799->1139|2835->1148|2857->1149|2920->1181|2970->1203|3193->1396
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|32->5|32->5|32->5|35->8|43->16|43->16|43->16|45->18|46->19|46->19|46->19|46->19|46->19|46->19|46->19|46->19|46->19|49->22|51->24|52->25|54->27|59->32|59->32|60->33|60->33|60->33|61->34|61->34|61->34|61->34|61->34|61->34|62->35|63->36|70->43
                  -- GENERATED --
              */
          