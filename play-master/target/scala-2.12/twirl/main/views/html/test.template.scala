
package views.html

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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>test</title>
        """),_display_(/*6.10*/common/*6.16*/.head()),format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""</head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
                <!-- Header -->
            """),_display_(/*11.14*/common/*11.20*/.header()),format.raw/*11.29*/("""
                """),format.raw/*12.17*/("""<!-- Left Side bar -->
            """),_display_(/*13.14*/common/*13.20*/.leftSideBar("home")),format.raw/*13.40*/("""
                """),format.raw/*14.17*/("""<!-- Right Side bar -->
            """),_display_(/*15.14*/common/*15.20*/.rightSideBar()),format.raw/*15.35*/("""


                """),format.raw/*18.17*/("""<!-- Content Wrapper -->
            <div class="content-wrapper">
                    <!-- Page header -->
                <section class="content-header"><h1>Template<small>play Framework 2.6 practice!!</small></h1></section>
                    <!-- Page content -->
                <section class="content">
                </section>
                テスト
            </div>

                <!-- Footer -->
            """),_display_(/*29.14*/common/*29.20*/.footer()),format.raw/*29.29*/("""
        """),format.raw/*30.9*/("""</div>

        <!-- Include scripts -->
        """),_display_(/*33.10*/common/*33.16*/.script()),format.raw/*33.25*/("""

    """),format.raw/*35.5*/("""</body>
</html>
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
                  DATE: Thu Jul 20 14:58:56 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/test.scala.html
                  HASH: afe652b32f556ec15c34f4c0ca1360583455560f
                  MATRIX: 1029->0|1132->77|1146->83|1173->90|1205->96|1377->241|1392->247|1422->256|1468->274|1532->311|1547->317|1588->337|1634->355|1699->393|1714->399|1750->414|1800->436|2262->871|2277->877|2307->886|2344->896|2424->949|2439->955|2469->964|2504->972
                  LINES: 33->1|38->6|38->6|38->6|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|50->18|61->29|61->29|61->29|62->30|65->33|65->33|65->33|67->35
                  -- GENERATED --
              */
          