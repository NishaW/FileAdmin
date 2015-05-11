// @SOURCE:C:/Users/Nisha/Documents/GitHub/FileAdmin/conf/routes
// @HASH:63ec1ee89a796fbe33ecde54a725eee90c2216c7
// @DATE:Mon May 11 10:01:39 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:12
class ReverseFileApplication {


// @LINE:12
def getassetlist(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/asset")
}
                        

}
                          

// @LINE:10
// @LINE:9
class ReverseCustomerApplication {


// @LINE:10
def getcust(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/getcust")
}
                        

// @LINE:9
def getIframe(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/iframe")
}
                        

}
                          

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:11
def test(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/test")
}
                        

// @LINE:8
// @LINE:7
def login(): Call = {
   () match {
// @LINE:7
case ()  =>
  import ReverseRouteContext.empty
  Call("POST", _prefix + { _defaultPrefix } + "home/")
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:12
class ReverseFileApplication {


// @LINE:12
def getassetlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FileApplication.getassetlist",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/asset"})
      }
   """
)
                        

}
              

// @LINE:10
// @LINE:9
class ReverseCustomerApplication {


// @LINE:10
def getcust : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerApplication.getcust",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/getcust"})
      }
   """
)
                        

// @LINE:9
def getIframe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerApplication.getIframe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/iframe"})
      }
   """
)
                        

}
              

// @LINE:16
class ReverseAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserApplication.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserApplication.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/test"})
      }
   """
)
                        

// @LINE:8
// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserApplication.login",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/"})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:12
class ReverseFileApplication {


// @LINE:12
def getassetlist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FileApplication.getassetlist(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "getassetlist", Seq(), "GET", """""", _prefix + """home/asset""")
)
                      

}
                          

// @LINE:10
// @LINE:9
class ReverseCustomerApplication {


// @LINE:10
def getcust(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerApplication.getcust(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getcust", Seq(), "GET", """""", _prefix + """home/getcust""")
)
                      

// @LINE:9
def getIframe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerApplication.getIframe(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getIframe", Seq(), "GET", """""", _prefix + """home/iframe""")
)
                      

}
                          

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserApplication.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserApplication.test(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "test", Seq(), "GET", """""", _prefix + """home/test""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserApplication.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "login", Seq(), "POST", """""", _prefix + """home/""")
)
                      

}
                          
}
        
    