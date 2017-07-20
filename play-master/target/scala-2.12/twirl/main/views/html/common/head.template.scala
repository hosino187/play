
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

object head extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
    <!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href=""""),_display_(/*6.31*/routes/*6.37*/.Assets.versioned("lib/adminlte/bootstrap/css/bootstrap.min.css")),format.raw/*6.102*/(""""/>
    <!-- Font Awesome -->
<link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css" crossorigin="anonymous" />
    <!-- Ionicons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css" />
    <!-- Theme style -->
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.versioned("lib/adminlte/dist/css/AdminLTE.min.css")),format.raw/*12.96*/(""""/>
    <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.versioned("lib/adminlte/dist/css/skins/_all-skins.min.css")),format.raw/*14.104*/(""""/>
    <!-- iCheck -->
<link rel="stylesheet" href=""""),_display_(/*16.31*/routes/*16.37*/.Assets.versioned("lib/adminlte/plugins/iCheck/flat/blue.css")),format.raw/*16.99*/(""""/>
    <!-- Morris chart -->
<link rel="stylesheet" href=""""),_display_(/*18.31*/routes/*18.37*/.Assets.versioned("lib/adminlte/plugins/morris/morris.css")),format.raw/*18.96*/(""""/>
    <!-- jvectormap -->
<link rel="stylesheet" href=""""),_display_(/*20.31*/routes/*20.37*/.Assets.versioned("lib/adminlte/plugins/jvectormap/jquery-jvectormap-1.2.2.css")),format.raw/*20.117*/(""""/>
    <!-- Date Picker -->
<link rel="stylesheet" href=""""),_display_(/*22.31*/routes/*22.37*/.Assets.versioned("lib/adminlte/plugins/datepicker/datepicker3.css")),format.raw/*22.105*/(""""/>
    <!-- Daterange picker -->
<link rel="stylesheet" href=""""),_display_(/*24.31*/routes/*24.37*/.Assets.versioned("lib/adminlte/plugins/daterangepicker/daterangepicker.css")),format.raw/*24.114*/(""""/>
    <!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href=""""),_display_(/*26.31*/routes/*26.37*/.Assets.versioned("lib/adminlte/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css")),format.raw/*26.127*/(""""/>
    <!-- Original Css -->
<link rel="stylesheet" href=""""),_display_(/*28.31*/routes/*28.37*/.Assets.versioned("/stylesheets/common.css")),format.raw/*28.81*/("""" />
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
                  DATE: Wed Jul 19 17:52:43 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/common/head.scala.html
                  HASH: 71d19c7adf5d529a4511ca0834f835d63fc357fc
                  MATRIX: 1036->0|1371->309|1385->315|1471->380|1868->750|1883->756|1963->815|2148->973|2163->979|2252->1046|2333->1100|2348->1106|2431->1168|2518->1228|2533->1234|2613->1293|2698->1351|2713->1357|2815->1437|2901->1496|2916->1502|3006->1570|3097->1634|3112->1640|3211->1717|3319->1798|3334->1804|3446->1894|3533->1954|3548->1960|3613->2004
                  LINES: 33->1|38->6|38->6|38->6|44->12|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16|50->18|50->18|50->18|52->20|52->20|52->20|54->22|54->22|54->22|56->24|56->24|56->24|58->26|58->26|58->26|60->28|60->28|60->28
                  -- GENERATED --
              */
          