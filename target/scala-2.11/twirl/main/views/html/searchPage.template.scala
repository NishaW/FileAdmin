
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
object searchPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(custForm: Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
</head>
<body>
    <fieldset>

    """),_display_(/*13.6*/select(custForm("myDropdownId"),
       options = options(CustomerApplication.getCustomerList()),
        '_label -> "Select the Client",
        '_showConstraints -> false
    )),format.raw/*17.6*/("""
        """),format.raw/*18.9*/("""</fieldset>

</body>
</html>"""))}
  }

  def render(custForm:Form[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(custForm)

  def f:((Form[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (custForm) => apply(custForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 11 14:50:35 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/searchPage.scala.html
                  HASH: 7e1aefcc1f31217837436da0d1e0dbf056d90b2f
                  MATRIX: 736->1|865->27|893->47|921->49|1075->177|1277->359|1314->369
                  LINES: 26->1|29->1|30->3|31->4|40->13|44->17|45->18
                  -- GENERATED --
              */
          