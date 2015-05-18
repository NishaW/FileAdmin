
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
object homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[FileAdminUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(created: FileAdminUser):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/main("Home page")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

""")))}))}
  }

  def render(created:FileAdminUser): play.twirl.api.HtmlFormat.Appendable = apply(created)

  def f:((FileAdminUser) => play.twirl.api.HtmlFormat.Appendable) = (created) => apply(created)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu May 14 15:53:05 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/homepage.scala.html
                  HASH: de5f83f1c90753f3c82ad7c78b9997fb808c5958
                  MATRIX: 733->1|845->25|875->30|900->47|939->49
                  LINES: 26->1|29->1|31->3|31->3|31->3
                  -- GENERATED --
              */
          