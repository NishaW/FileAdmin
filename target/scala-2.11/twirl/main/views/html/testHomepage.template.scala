
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
object testHomepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Frame Navigation Example</title>
</head>
<body>

<frameset COLS="*,*">
    <frame NAME="left" SRC="left.html">
    <frame NAME="right" SRC="about:blank">
</frameset>

</body>
</html>
"""))}
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 10 20:38:06 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/testHomepage.scala.html
                  HASH: 9c62731f7c79094c107c02327c76e603da28fc17
                  MATRIX: 738->1|853->28|883->32
                  LINES: 26->1|29->1|31->3
                  -- GENERATED --
              */
          