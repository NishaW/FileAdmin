
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
object test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

    """),_display_(/*5.6*/play20/*5.12*/.welcome(message, style = "Java")),format.raw/*5.45*/("""

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 05 20:22:49 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdministration/FileAdmin/app/views/test.scala.html
                  HASH: f21084cbc2467b2ccdd9c60e629a7d1d73c08f2d
                  MATRIX: 722->1|827->18|857->23|892->50|931->52|965->61|979->67|1032->100
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5
                  -- GENERATED --
              */
          