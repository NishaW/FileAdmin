
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
  def apply/*1.2*/(customers: List[Customer],userForm:Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.53*/("""


"""),_display_(/*4.2*/main("Customer page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.FileApplication.getassetlist(), 'id -> "customerselectform")/*5.94*/ {_display_(Seq[Any](format.raw/*5.96*/("""

    """),format.raw/*7.5*/("""<select name="name">
        """),_display_(/*8.10*/for(customers <- customers) yield /*8.37*/ {_display_(Seq[Any](format.raw/*8.39*/("""
            """),format.raw/*9.13*/("""<option name=""""),_display_(/*9.28*/customers/*9.37*/.name),format.raw/*9.42*/("""">"""),_display_(/*9.45*/customers/*9.54*/.name),format.raw/*9.59*/("""</option>
        """)))}),format.raw/*10.10*/("""

    """),format.raw/*12.5*/("""</select>
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
                  DATE: Fri May 15 11:51:43 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/customerList.scala.html
                  HASH: d288564732b2441b84c7ace70121e17cef326146
                  MATRIX: 753->1|892->52|924->59|953->80|992->82|1024->89|1038->95|1128->177|1167->179|1201->187|1258->218|1300->245|1339->247|1380->261|1421->276|1438->285|1463->290|1492->293|1509->302|1534->307|1585->327|1620->335|1732->417
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|33->5|35->7|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|37->9|38->10|40->12|42->14
                  -- GENERATED --
              */
          