
package views.html.user

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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[controllers.forms.UserForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:play.data.Form[controllers.forms.UserForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Home</title>
        """),_display_(/*7.10*/common/*7.16*/.head()),format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""</head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
                <!-- Header -->
            """),_display_(/*12.14*/common/*12.20*/.header()),format.raw/*12.29*/("""
                """),format.raw/*13.17*/("""<!-- Left Side bar -->
            """),_display_(/*14.14*/common/*14.20*/.leftSideBar("user")),format.raw/*14.40*/("""
                """),format.raw/*15.17*/("""<!-- Right Side bar -->
            """),_display_(/*16.14*/common/*16.20*/.rightSideBar()),format.raw/*16.35*/("""




                            """),format.raw/*21.29*/("""<!-- User profile -->
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="box box-solid">
                                    <div class="box-header">
                                        <i class="fa fa-user"></i>
                                        <h3 class="box-title">Profile</h3>
                                        <div class="box-tools pull-right">
                                            <button type="button" class="btn btn-box-tool btn-sm white-collapse"
                                            data-widget="collapse"><i class="fa fa-minus"></i></button>
                                        </div>
                                    </div>
                                    <div class="box-body border-radius-none" style="display: block;">
                                            <!-- FirstName -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group """),_display_(/*37.73*/if(!userForm.errors("firstName").isEmpty())/*37.116*/ {_display_(Seq[Any](format.raw/*37.118*/(""" """),format.raw/*37.119*/("""has-error""")))}),format.raw/*37.129*/("""">
                                                    <label for="firstName" class="col-sm-2 control-label">FirstName</label>
                                                    <div class="col-sm-10">
                                                        <input id="firstName" type="text" class="form-control rounded" name="firstName" value=""""),_display_(/*40.145*/if(userForm.value().get().firstName != null)/*40.189*/ {_display_(_display_(/*40.192*/userForm/*40.200*/.value().get().firstName))}),format.raw/*40.225*/(""""/>

                                                        """),_display_(/*42.58*/if(!userForm.errors("firstName").isEmpty())/*42.101*/ {_display_(Seq[Any](format.raw/*42.103*/("""
                                                            """),format.raw/*43.61*/("""<ul>
                                                            """),_display_(/*44.62*/for(error <- userForm.errors("firstName")) yield /*44.104*/ {_display_(Seq[Any](format.raw/*44.106*/("""
                                                                """),format.raw/*45.65*/("""<li class="help-block">"""),_display_(/*45.89*/error/*45.94*/.message),format.raw/*45.102*/("""</li>
                                                            """)))}),format.raw/*46.62*/("""
                                                            """),format.raw/*47.61*/("""</ul>
                                                        """)))}),format.raw/*48.58*/("""
                                                    """),format.raw/*49.53*/("""</div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- LastName -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group """),_display_(/*56.73*/if(!userForm.errors("lastName").isEmpty())/*56.115*/ {_display_(Seq[Any](format.raw/*56.117*/(""" """),format.raw/*56.118*/("""has-error""")))}),format.raw/*56.128*/("""">
                                                    <label for="lastName" class="col-sm-2 control-label">LastName</label>
                                                    <div class="col-sm-10">
                                                        <input id="lastName" type="text" class="form-control rounded" name="lastName" value=""""),_display_(/*59.143*/if(userForm.value().get().lastName != null)/*59.186*/ {_display_(_display_(/*59.189*/userForm/*59.197*/.value().get().lastName))}),format.raw/*59.221*/(""""/>
                                                        """),_display_(/*60.58*/if(!userForm.errors("lastName").isEmpty())/*60.100*/ {_display_(Seq[Any](format.raw/*60.102*/("""
                                                            """),format.raw/*61.61*/("""<ul>
                                                            """),_display_(/*62.62*/for(error <- userForm.errors("lastName")) yield /*62.103*/ {_display_(Seq[Any](format.raw/*62.105*/("""
                                                                """),format.raw/*63.65*/("""<li class="help-block">"""),_display_(/*63.89*/error/*63.94*/.message),format.raw/*63.102*/("""</li>
                                                            """)))}),format.raw/*64.62*/("""
                                                            """),format.raw/*65.61*/("""</ul>
                                                        """)))}),format.raw/*66.58*/("""
                                                    """),format.raw/*67.53*/("""</div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- LastName -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group """),_display_(/*74.73*/if(!userForm.errors("middleName").isEmpty())/*74.117*/ {_display_(Seq[Any](format.raw/*74.119*/(""" """),format.raw/*74.120*/("""has-error""")))}),format.raw/*74.130*/("""">
                                                    <label for="lastName" class="col-sm-2 control-label">LastName</label>
                                                    <div class="col-sm-10">
                                                        <input id="middleName" type="text" class="form-control rounded" name="lastName" value=""""),_display_(/*77.145*/if(userForm.value().get().lastName != null)/*77.188*/ {_display_(_display_(/*77.191*/userForm/*77.199*/.value().get().lastName))}),format.raw/*77.223*/(""""/>
                                                        """),_display_(/*78.58*/if(!userForm.errors("middleName").isEmpty())/*78.102*/ {_display_(Seq[Any](format.raw/*78.104*/("""
                                                            """),format.raw/*79.61*/("""<ul>
                                                            """),_display_(/*80.62*/for(error <- userForm.errors("middleName")) yield /*80.105*/ {_display_(Seq[Any](format.raw/*80.107*/("""
                                                                """),format.raw/*81.65*/("""<li class="help-block">"""),_display_(/*81.89*/error/*81.94*/.message),format.raw/*81.102*/("""</li>
                                                            """)))}),format.raw/*82.62*/("""
                                                            """),format.raw/*83.61*/("""</ul>
                                                        """)))}),format.raw/*84.58*/("""
                                                        """),format.raw/*85.57*/("""</div>
                                    </div>
                                </div>
                            </div>
                        </div>

                            <!-- Buttons -->
                        <div class="row">
                            <div class="col-sm-12" >
                                <button id="fix-workingHour" type="submit" class="btn btn-primary pull-right">FIX</button>
                            </div>
                        </div>
                    </form>

                </section>
            </div>

                <!-- Footer -->
            """),_display_(/*103.14*/common/*103.20*/.footer()),format.raw/*103.29*/("""
        """),format.raw/*104.9*/("""</div>

            <!-- Include scripts -->
        """),_display_(/*107.10*/common/*107.16*/.script()),format.raw/*107.25*/("""

    """),format.raw/*109.5*/("""</body>
</html>

"""))
      }
    }
  }

  def render(userForm:play.data.Form[controllers.forms.UserForm]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[controllers.forms.UserForm]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 16:38:43 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/user/detail.scala.html
                  HASH: 014ae6c948c7ce8b4a14efa9848c180df13ffd12
                  MATRIX: 990->1|1138->54|1165->55|1263->127|1277->133|1304->140|1335->145|1503->286|1518->292|1548->301|1593->318|1656->354|1671->360|1712->380|1757->397|1821->434|1836->440|1872->455|1933->488|3084->1612|3137->1655|3178->1657|3208->1658|3250->1668|3625->2015|3679->2059|3711->2062|3729->2070|3778->2095|3867->2157|3920->2200|3961->2202|4050->2263|4143->2329|4202->2371|4243->2373|4336->2438|4387->2462|4401->2467|4431->2475|4529->2542|4618->2603|4712->2666|4793->2719|5240->3139|5292->3181|5333->3183|5363->3184|5405->3194|5776->3537|5829->3580|5861->3583|5879->3591|5927->3615|6015->3676|6067->3718|6108->3720|6197->3781|6290->3847|6348->3888|6389->3890|6482->3955|6533->3979|6547->3984|6577->3992|6675->4059|6764->4120|6858->4183|6939->4236|7382->4652|7436->4696|7477->4698|7507->4699|7549->4709|7922->5054|7975->5097|8007->5100|8025->5108|8073->5132|8161->5193|8215->5237|8256->5239|8345->5300|8438->5366|8498->5409|8539->5411|8632->5476|8683->5500|8697->5505|8727->5513|8825->5580|8914->5641|9008->5704|9093->5761|9727->6367|9743->6373|9774->6382|9811->6391|9893->6445|9909->6451|9940->6460|9974->6466
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|40->8|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|53->21|69->37|69->37|69->37|69->37|69->37|72->40|72->40|72->40|72->40|72->40|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|80->48|81->49|88->56|88->56|88->56|88->56|88->56|91->59|91->59|91->59|91->59|91->59|92->60|92->60|92->60|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|97->65|98->66|99->67|106->74|106->74|106->74|106->74|106->74|109->77|109->77|109->77|109->77|109->77|110->78|110->78|110->78|111->79|112->80|112->80|112->80|113->81|113->81|113->81|113->81|114->82|115->83|116->84|117->85|135->103|135->103|135->103|136->104|139->107|139->107|139->107|141->109
                  -- GENERATED --
              */
          