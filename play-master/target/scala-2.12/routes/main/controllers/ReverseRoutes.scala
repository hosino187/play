
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/takuro/Desktop/play-master/conf/routes
// @DATE:Thu Jul 20 14:58:56 JST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def template(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "template")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:10
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/create")
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:12
    def register(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/register")
    }
  
  }


}
