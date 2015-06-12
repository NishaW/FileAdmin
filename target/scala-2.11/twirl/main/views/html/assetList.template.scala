
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
            """),_display_(/*17.14*/for(asset <- assets) yield /*17.34*/ {_display_(Seq[Any](format.raw/*17.36*/("""

                """),format.raw/*19.17*/("""<tr>
                    <td><input type="checkbox" name="selectedAssets["""),_display_(/*20.70*/i),format.raw/*20.71*/("""]" value=""""),_display_(/*20.82*/asset/*20.87*/.assetName),format.raw/*20.97*/(""""> """),_display_(/*20.101*/asset/*20.106*/.assetName),format.raw/*20.116*/(""" """),format.raw/*20.117*/("""<br></td>
                </tr>

                """),_display_(/*23.18*/{
                    i += 1
                }),format.raw/*25.18*/("""
            """)))}),format.raw/*26.14*/("""

            """),format.raw/*28.13*/("""</tbody>
        </table>
        <table border=0 width=30% height=30% align=left cellpadding=1 cellspacing=1>
            <thead>
                <tr>
                    """),_display_(/*33.22*/{var j = 1;}),format.raw/*33.34*/("""
                    """),_display_(/*34.22*/for(j <- 1 to numberOfPages) yield /*34.50*/ {_display_(Seq[Any](format.raw/*34.52*/("""
                        """),format.raw/*35.25*/("""<td><a href=""""),_display_(/*35.39*/routes/*35.45*/.FileApplication.getAssetList(j)),format.raw/*35.77*/("""">&nbsp;"""),_display_(/*35.86*/j),format.raw/*35.87*/("""</a></td>
                    """)))}),format.raw/*36.22*/("""
                    """),format.raw/*37.21*/("""<td>pages</td>
                </tr>
        </table>
        <br>
        <br>
        <br>
        <input type="submit" class="btn btn-primary" value="Generate ThumbNails">
    """)))}),format.raw/*44.6*/("""
""")))}))}
  }

  def render(assets:List[Asset],numberOfPages:Integer,assetForm:Form[Asset]): play.twirl.api.HtmlFormat.Appendable = apply(assets,numberOfPages,assetForm)

  def f:((List[Asset],Integer,Form[Asset]) => play.twirl.api.HtmlFormat.Appendable) = (assets,numberOfPages,assetForm) => apply(assets,numberOfPages,assetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 10 22:21:17 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/assetList.scala.html
                  HASH: d9355d31a88312043ba8fa59b0357d2ac2952445
                  MATRIX: 752->1|948->70|976->114|1004->117|1031->136|1070->138|1102->145|1116->151|1204->231|1243->233|1283->247|1587->524|1623->544|1663->546|1711->566|1813->641|1835->642|1873->653|1887->658|1918->668|1950->672|1965->677|1997->687|2027->688|2107->741|2176->789|2222->804|2266->820|2471->998|2504->1010|2554->1033|2598->1061|2638->1063|2692->1089|2733->1103|2748->1109|2801->1141|2837->1150|2859->1151|2922->1183|2972->1205|3189->1392
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|32->5|32->5|32->5|35->8|44->17|44->17|44->17|46->19|47->20|47->20|47->20|47->20|47->20|47->20|47->20|47->20|47->20|50->23|52->25|53->26|55->28|60->33|60->33|61->34|61->34|61->34|62->35|62->35|62->35|62->35|62->35|62->35|63->36|64->37|71->44
                  -- GENERATED --
              */
          