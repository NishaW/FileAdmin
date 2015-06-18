
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
object customerList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Customer],Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer], userForm: Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""


"""),_display_(/*4.2*/main("Customer page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.FileApplication.getFirstAssetList, 'id -> "customerselectform")/*5.97*/ {_display_(Seq[Any](format.raw/*5.99*/("""

        """),format.raw/*7.9*/("""<select name="name">
        """),_display_(/*8.10*/for(customers <- customers) yield /*8.37*/ {_display_(Seq[Any](format.raw/*8.39*/("""
            """),format.raw/*9.13*/("""<option name=""""),_display_(/*9.28*/customers/*9.37*/.name),format.raw/*9.42*/("""">"""),_display_(/*9.45*/customers/*9.54*/.name),format.raw/*9.59*/("""</option>
        """)))}),format.raw/*10.10*/("""

        """),format.raw/*12.9*/("""</select>
        <input type="submit" class="btn btn-primary" value="Search">
    """)))}),format.raw/*14.6*/("""
""")))}))}
  }

  def render(customers:List[Customer],userForm:Form[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers,userForm)

  def f:((List[Customer],Form[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers,userForm) => apply(customers,userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 12 12:27:59 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/customerList.scala.html
                  HASH: 054b07c2ffb73c687dced3ed662b4f554a649986
                  MATRIX: 753->1|894->54|926->61|955->82|994->84|1026->91|1040->97|1133->182|1172->184|1210->196|1267->227|1309->254|1348->256|1389->270|1430->285|1447->294|1472->299|1501->302|1518->311|1543->316|1594->336|1633->348|1749->434
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|33->5|35->7|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|37->9|38->10|40->12|42->14
                  -- GENERATED --
              */
          