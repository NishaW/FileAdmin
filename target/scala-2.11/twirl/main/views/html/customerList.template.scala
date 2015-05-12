
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
object customerList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
</head>
<body>

    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.FileApplication.getassetlist(), 'id -> "customerselectform")/*12.94*/ {_display_(Seq[Any](format.raw/*12.96*/("""

    """),format.raw/*14.5*/("""<select>
        """),_display_(/*15.10*/for(customers <- customers) yield /*15.37*/ {_display_(Seq[Any](format.raw/*15.39*/("""
            """),format.raw/*16.13*/("""<option>"""),_display_(/*16.22*/customers/*16.31*/.name),format.raw/*16.36*/("""</option>
        """)))}),format.raw/*17.10*/("""

    """),format.raw/*19.5*/("""</select>
    <input type="submit" class="btn btn-primary" value="Search">
    """)))}),format.raw/*21.6*/("""
"""),format.raw/*22.1*/("""</body>
</html>"""))}
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 11 21:56:45 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/customerList.scala.html
                  HASH: 5a4c18434e5229e85ca2fbd1370f91667e2b6d23
                  MATRIX: 738->1|853->28|885->34|1023->146|1038->152|1129->234|1169->236|1204->244|1250->263|1293->290|1333->292|1375->306|1411->315|1429->324|1455->329|1506->349|1541->357|1653->439|1682->441
                  LINES: 26->1|29->1|32->4|40->12|40->12|40->12|40->12|42->14|43->15|43->15|43->15|44->16|44->16|44->16|44->16|45->17|47->19|49->21|50->22
                  -- GENERATED --
              */
          