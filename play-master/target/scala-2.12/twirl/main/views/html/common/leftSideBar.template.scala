
package views.html.common

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object leftSideBar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
            <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.versioned("/images/icon.jpg")),format.raw/*8.71*/("""" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
                <p>play student</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
            <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li """),_display_(/*17.18*/if(title == "user")/*17.37*/ {_display_(Seq[Any](format.raw/*17.39*/(""" """),format.raw/*17.40*/("""class="active"""")))}),format.raw/*17.55*/(""" """),format.raw/*17.56*/(""">
                <a href="/user">
                    <i class="fa fa-user"></i> <span>User</span>
                </a>
            </li>
            <li """),_display_(/*22.18*/if(title == "template")/*22.41*/ {_display_(Seq[Any](format.raw/*22.43*/(""" """),format.raw/*22.44*/("""class="active"""")))}),format.raw/*22.59*/(""" """),format.raw/*22.60*/(""">
                <a href="/template">
                    <i class="fa fa-files-o"></i> <span>Template</span>
                </a>
            </li>
             <li """),_display_(/*27.19*/if(title == "test")/*27.38*/ {_display_(Seq[Any](format.raw/*27.40*/(""" """),format.raw/*27.41*/("""class="active"""")))}),format.raw/*27.56*/(""" """),format.raw/*27.57*/(""">
                <a href="/test">
                    <i class="fa fa-files-o"></i> <span>Test</span>
                </a>
            </li>
        </ul>
    </section>
        <!-- /.sidebar -->
</aside>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 16:15:35 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/common/leftSideBar.scala.html
                  HASH: 5015b32eb23322938c44ac17e56677fc33ff3805
                  MATRIX: 961->1|1070->15|1098->17|1392->285|1406->291|1463->328|1874->712|1902->731|1942->733|1971->734|2017->749|2046->750|2234->911|2266->934|2306->936|2335->937|2381->952|2410->953|2610->1126|2638->1145|2678->1147|2707->1148|2753->1163|2782->1164
                  LINES: 28->1|33->1|34->2|40->8|40->8|40->8|49->17|49->17|49->17|49->17|49->17|49->17|54->22|54->22|54->22|54->22|54->22|54->22|59->27|59->27|59->27|59->27|59->27|59->27
                  -- GENERATED --
              */
          