
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

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header class="main-header">
        <!-- Logo -->
    <a href="/" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>P</b><b>P</b></span>
            <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Play</b> Practice</span>
    </a>
        <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <li>
                    <a href="https://github.com/kawashimayu/play">
                        <i class="fa fa-github"></i>
                    </a>
                </li>
                    <!-- Control Sidebar Toggle Button -->
                <li>
                    <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                </li>
            </ul>
        </div>
    </nav>
</header>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jul 19 17:54:32 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/common/header.scala.html
                  HASH: 9ae3f3ac4d1324d8cb24fe73d60bf9d98ff5ee65
                  MATRIX: 1038->0
                  LINES: 33->1
                  -- GENERATED --
              */
          