
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
object userList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[FileAdminUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[FileAdminUser]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""

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
                <th align="left">User Name</th>

            </tr>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(users <- users) yield /*18.29*/ {_display_(Seq[Any](format.raw/*18.31*/("""

            """),format.raw/*20.13*/("""<tr>

                <td>"""),_display_(/*22.22*/users/*22.27*/.username),format.raw/*22.36*/("""</td>





            </tr>
        """)))}),format.raw/*29.10*/("""

        """),format.raw/*31.9*/("""</tbody>
    </table>

</body>
</html>"""))}
  }

  def render(users:List[FileAdminUser]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[FileAdminUser]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 10 23:07:42 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/userList.scala.html
                  HASH: e43218bcaff98e6df85a7c88b7074a447fff158e
                  MATRIX: 739->1|855->29|885->33|1248->369|1283->388|1323->390|1367->406|1423->435|1437->440|1467->449|1543->494|1582->506
                  LINES: 26->1|29->1|31->3|46->18|46->18|46->18|48->20|50->22|50->22|50->22|57->29|59->31
                  -- GENERATED --
              */
          