
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

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
</head>
<body>
    <table border=0 width=40% height=30% align=left cellpadding=1 cellspacing=1>
        <thead>
            <tr>
                <th align="left">Customer Name</th>

            </tr>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(customers <- customers) yield /*18.37*/ {_display_(Seq[Any](format.raw/*18.39*/("""

            """),format.raw/*20.13*/("""<tr>

                <td>"""),_display_(/*22.22*/customers/*22.31*/.name),format.raw/*22.36*/("""</td>
                <td>"""),_display_(/*23.22*/customers/*23.31*/.language),format.raw/*23.40*/("""</td>
                <td>"""),_display_(/*24.22*/customers/*24.31*/.path),format.raw/*24.36*/("""</td>



            </tr>
        """)))}),format.raw/*29.10*/("""

        """),format.raw/*31.9*/("""</tbody>
    </table>

</body>
</html>"""))}
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 10 20:38:06 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/customerList.scala.html
                  HASH: cd11691d8e29adce1935070e7a7d50d0f2be0aa8
                  MATRIX: 738->1|853->28|883->32|1250->372|1293->399|1333->401|1377->417|1433->446|1451->455|1477->460|1532->488|1550->497|1580->506|1635->534|1653->543|1679->548|1751->589|1790->601
                  LINES: 26->1|29->1|31->3|46->18|46->18|46->18|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|57->29|59->31
                  -- GENERATED --
              */
          