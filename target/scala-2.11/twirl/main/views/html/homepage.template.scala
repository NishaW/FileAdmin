
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

    """),_display_(/*3.6*/main("Home page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
        """),format.raw/*4.9*/("""<br>
        <br>

        <div class="table">
            <tr>
                <td>
                    <div class="img">
                        <img src="/assets/assa_abloy_logo.png" alt="assa">
                    </div>
                    <div class="img">
                        <img src="/assets/boxer_logo.png" alt="boxer">
                    </div>
                    <div class="img">
                        <img src="/assets/entrematic_logo.png" alt="entrematic">
                    </div>
                    <div class="img">
                        <img src="/assets/intrum_justicia_logo.png" alt="intrum">
                    </div>
                    <div class="img">
                        <img src="/assets/tiger_of_sweden_logo.png" alt="tiger">
                    </div>
                    <div class="img">
                        <img src="/assets/polarn_o_pyret_logo.png" alt="pop">
                    </div>
                    <div class="img">
                        <img src="/assets/samhall_logo.png" alt="samhall">
                    </div>
                    <div class="img">
                        <img src="/assets/wwl_logo.png" alt="wwl">
                    </div>
                </td>
            </tr>
        </div>


    """)))}))}
  }

  def render(created:FileAdminUser): play.twirl.api.HtmlFormat.Appendable = apply(created)

  def f:((FileAdminUser) => play.twirl.api.HtmlFormat.Appendable) = (created) => apply(created)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 24 22:59:39 CEST 2015
                  SOURCE: C:/Users/Nisha/Documents/GitHub/FileAdmin/app/views/homepage.scala.html
                  HASH: 0fba75ec0064834e0fb2409bf3f7391b07618201
                  MATRIX: 733->1|845->25|879->34|904->51|943->53|979->63
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4
                  -- GENERATED --
              */
          