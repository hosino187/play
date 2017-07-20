
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[controllers.forms.UserSearchForm,List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userSearchForm:controllers.forms.UserSearchForm, users: List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Home</title>
        """),_display_(/*7.10*/common/*7.16*/.head()),format.raw/*7.23*/("""
        """),format.raw/*8.9*/("""</head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
                <!-- Header -->
            """),_display_(/*12.14*/common/*12.20*/.header()),format.raw/*12.29*/("""
                """),format.raw/*13.17*/("""<!-- Left Side bar -->
            """),_display_(/*14.14*/common/*14.20*/.leftSideBar("user")),format.raw/*14.40*/("""
                """),format.raw/*15.17*/("""<!-- Right Side bar -->
            """),_display_(/*16.14*/common/*16.20*/.rightSideBar()),format.raw/*16.35*/("""

                """),format.raw/*18.17*/("""<!-- Content Wrapper -->
            <div class="content-wrapper">
                    <!-- Page header -->
                <section class="content-header">
                    <h1>User<small>member list</small></h1>
                        <!-- Buttons -->
                    <div class="row">
                        <div class="col-sm-12">
                            <button id="add" type="submit" class="btn btn-primary pull-right">Add User!</button>
                        </div>
                    </div>
                </section>
                    <!-- Page content -->
                <section class="content">


                    <form action="/user" method="get" class="form-horizontal">

                            <!-- Search Condition -->
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="box box-solid">
                                    <div class="box-header">
                                        <i class="fa fa-search "></i>
                                        <h3 class="box-title">Search</h3>
                                        <div class="box-tools pull-right">
                                            <button type="button" class="btn btn-box-tool btn-sm white-collapse"
                                            data-widget="collapse"><i class="fa fa-minus"></i></button>
                                        </div>
                                    </div>
                                    <div class="box-body border-radius-none" style="display: block;">
                                            <!-- ID -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <div class="col-sm-12">
                                                        <input name="id" type="number" class="form-control rounded" placeholder="ID" value=""""),_display_(/*54.142*/if(userSearchForm.id != null)/*54.171*/ {_display_(_display_(/*54.174*/userSearchForm/*54.188*/.id))}),format.raw/*54.192*/(""""/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- FirstName -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <div class="col-sm-12">
                                                        <input name="firstName" type="text" class="form-control rounded" placeholder="FirstName" value=""""),_display_(/*64.154*/if(userSearchForm.firstName != null)/*64.190*/ {_display_(_display_(/*64.193*/userSearchForm/*64.207*/.firstName))}),format.raw/*64.218*/(""""/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- LastName -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <div class="col-sm-12">
                                                        <input name="lastName" type="text" class="form-control rounded" placeholder="LastName"  value=""""),_display_(/*74.153*/if(userSearchForm.lastName != null)/*74.188*/ {_display_(_display_(/*74.191*/userSearchForm/*74.205*/.lastName))}),format.raw/*74.215*/(""""/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        	<!-- LastName -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <div class="col-sm-12">
                                                        <input name="middleName" type="text" class="form-control rounded" placeholder="middleName"	value=""""),_display_(/*84.156*/if(userSearchForm.middleName != null)/*84.193*/ {_display_(_display_(/*84.196*/userSearchForm/*84.210*/.middleName))}),format.raw/*84.222*/(""""/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- Buttons -->
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <button type="submit" class="btn btn-primary pull-right">search!</button>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>


                    </form>


                        <!-- Member list -->
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="box box-solid">
                                <div class="box-body border-radius-none" style="display: block;">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <table class="table table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>#</th>
                                                        <th>First Name</th>
                                                        <th>Last Name</th>
                                                    </tr>
                                                </thead>
                                                <tbody>


                                                """),_display_(/*123.50*/for(user <- users) yield /*123.68*/ {_display_(Seq[Any](format.raw/*123.70*/("""
                                                    """),format.raw/*124.53*/("""<tr>
                                                        <th scope="row">
                                                            <a href="/user/"""),_display_(/*126.77*/user/*126.81*/.id),format.raw/*126.84*/(""""><span>"""),_display_(/*126.93*/user/*126.97*/.id),format.raw/*126.100*/("""</span></a>
                                                        </th>
                                                        <td><span>"""),_display_(/*128.68*/user/*128.72*/.firstName),format.raw/*128.82*/("""</span></td>
                                                        <td><span>"""),_display_(/*129.68*/user/*129.72*/.lastName),format.raw/*129.81*/("""</span></td>
                                                    </tr>
                                                """)))}),format.raw/*131.50*/("""


                                                """),format.raw/*134.49*/("""</tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                </section>
            </div>

                <!-- Footer -->
            """),_display_(/*148.14*/common/*148.20*/.footer()),format.raw/*148.29*/("""
        """),format.raw/*149.9*/("""</div>

            <!-- Include scripts -->
        """),_display_(/*152.10*/common/*152.16*/.script()),format.raw/*152.25*/("""
        """),format.raw/*153.9*/("""<script type="text/javascript">
                // Events
                $('#add').click(function () """),format.raw/*155.45*/("""{"""),format.raw/*155.46*/("""
                    """),format.raw/*156.21*/("""location.href = '/user/create';
                """),format.raw/*157.17*/("""}"""),format.raw/*157.18*/(""");
        </script>

    </body>
</html>

"""))
      }
    }
  }

  def render(userSearchForm:controllers.forms.UserSearchForm,users:List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(userSearchForm,users)

  def f:((controllers.forms.UserSearchForm,List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (userSearchForm,users) => apply(userSearchForm,users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 17:05:17 JST 2017
                  SOURCE: C:/Users/takuro/Desktop/play-master/app/views/user/index.scala.html
                  HASH: 1900a85f10a87e217025922703e5d3ce693c8ea9
                  MATRIX: 997->1|1167->76|1194->77|1292->149|1306->155|1333->162|1368->171|1536->312|1551->318|1581->327|1626->344|1689->380|1704->386|1745->406|1790->423|1854->460|1869->466|1905->481|1951->499|4056->2576|4095->2605|4127->2608|4151->2622|4179->2626|4914->3333|4960->3369|4992->3372|5016->3386|5051->3397|5784->4102|5829->4137|5861->4140|5885->4154|5919->4164|6652->4869|6699->4906|6731->4909|6755->4923|6791->4935|8657->6773|8692->6791|8733->6793|8815->6846|8997->7000|9011->7004|9036->7007|9073->7016|9087->7020|9113->7023|9282->7164|9296->7168|9328->7178|9436->7258|9450->7262|9481->7271|9633->7391|9713->7442|10119->7820|10135->7826|10166->7835|10203->7844|10285->7898|10301->7904|10332->7913|10369->7922|10500->8024|10530->8025|10580->8046|10657->8094|10687->8095
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|40->8|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|50->18|86->54|86->54|86->54|86->54|86->54|96->64|96->64|96->64|96->64|96->64|106->74|106->74|106->74|106->74|106->74|116->84|116->84|116->84|116->84|116->84|155->123|155->123|155->123|156->124|158->126|158->126|158->126|158->126|158->126|158->126|160->128|160->128|160->128|161->129|161->129|161->129|163->131|166->134|180->148|180->148|180->148|181->149|184->152|184->152|184->152|185->153|187->155|187->155|188->156|189->157|189->157
                  -- GENERATED --
              */
          