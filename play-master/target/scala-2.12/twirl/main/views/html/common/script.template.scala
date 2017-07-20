
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

object script extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- jQuery 2.2.3 -->
<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("lib/adminlte/plugins/jQuery/jquery-2.2.3.min.js")),format.raw/*2.89*/(""""></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.6 -->
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.versioned("lib/adminlte/bootstrap/js/bootstrap.min.js")),format.raw/*10.84*/(""""></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.versioned("lib/adminlte/plugins/morris/morris.min.js")),format.raw/*13.83*/(""""></script>
<!-- Sparkline -->
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.versioned("lib/adminlte/plugins/sparkline/jquery.sparkline.min.js")),format.raw/*15.96*/(""""></script>
<!-- jvectormap -->
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.versioned("lib/adminlte/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js")),format.raw/*17.104*/(""""></script>
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("lib/adminlte/plugins/jvectormap/jquery-jvectormap-world-mill-en.js")),format.raw/*18.108*/(""""></script>
<!-- jQuery Knob Chart -->
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.versioned("lib/adminlte/plugins/knob/jquery.knob.js")),format.raw/*20.82*/(""""></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src=""""),_display_(/*23.15*/routes/*23.21*/.Assets.versioned("lib/adminlte/plugins/daterangepicker/daterangepicker.js")),format.raw/*23.97*/(""""></script>
<!-- datepicker -->
<script src=""""),_display_(/*25.15*/routes/*25.21*/.Assets.versioned("lib/adminlte/plugins/datepicker/bootstrap-datepicker.js")),format.raw/*25.97*/(""""></script>
<!-- Bootstrap WYSIHTML5 -->
<script src=""""),_display_(/*27.15*/routes/*27.21*/.Assets.versioned("lib/adminlte/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js")),format.raw/*27.114*/(""""></script>
<!-- Slimscroll -->
<script src=""""),_display_(/*29.15*/routes/*29.21*/.Assets.versioned("lib/adminlte/plugins/slimScroll/jquery.slimscroll.min.js")),format.raw/*29.98*/(""""></script>
<!-- FastClick -->
<script src=""""),_display_(/*31.15*/routes/*31.21*/.Assets.versioned("lib/adminlte/plugins/fastclick/fastclick.js")),format.raw/*31.85*/(""""></script>
<!-- AdminLTE App -->
<script src=""""),_display_(/*33.15*/routes/*33.21*/.Assets.versioned("lib/adminlte/dist/js/app.min.js")),format.raw/*33.73*/(""""></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src=""""),_display_(/*35.15*/routes/*35.21*/.Assets.versioned("lib/adminlte/dist/js/pages/dashboard.js")),format.raw/*35.81*/(""""></script>
<!-- AdminLTE for demo purposes -->
<script src=""""),_display_(/*37.15*/routes/*37.21*/.Assets.versioned("lib/adminlte/dist/js/demo.js")),format.raw/*37.70*/(""""></script>
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
                  DATE: Wed Jul 19 17:20:30 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/common/script.scala.html
                  HASH: 3efe6abb484903620767f5f8ef833f2204100058
                  MATRIX: 1038->0|1100->36|1114->42|1202->110|1516->397|1531->403|1615->466|1786->610|1801->616|1884->678|1956->723|1971->729|2067->804|2140->850|2155->856|2260->939|2313->965|2328->971|2437->1058|2517->1111|2532->1117|2614->1178|2786->1323|2801->1329|2898->1405|2971->1451|2986->1457|3083->1533|3165->1588|3180->1594|3295->1687|3368->1733|3383->1739|3481->1816|3553->1861|3568->1867|3653->1931|3728->1979|3743->1985|3816->2037|3935->2129|3950->2135|4031->2195|4120->2257|4135->2263|4205->2312
                  LINES: 33->1|34->2|34->2|34->2|42->10|42->10|42->10|45->13|45->13|45->13|47->15|47->15|47->15|49->17|49->17|49->17|50->18|50->18|50->18|52->20|52->20|52->20|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|61->29|61->29|61->29|63->31|63->31|63->31|65->33|65->33|65->33|67->35|67->35|67->35|69->37|69->37|69->37
                  -- GENERATED --
              */
          