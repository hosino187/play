
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

object template extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Test</title>
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
                  DATE: Thu Jul 20 15:04:28 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/template.scala.html
                  HASH: 1e910a9d468928e1737910564362f48708b87b5c
                  MATRIX: 1033->0|1136->77|1150->83|1177->90|1209->96|1381->241|1396->247|1426->256|1472->274|1536->311|1551->317|1592->337|1638->355|1703->393|1718->399|1754->414|1804->436|2247->852|2262->858|2292->867|2329->877|2409->930|2424->936|2454->945|2489->953
                  LINES: 33->1|38->6|38->6|38->6|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|50->18|61->29|61->29|61->29|62->30|65->33|65->33|65->33|67->35
                  -- GENERATED --
              */
          