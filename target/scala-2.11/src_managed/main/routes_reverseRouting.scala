// @SOURCE:C:/Users/Nisha/Documents/GitHub/FileAdmin/conf/routes
// @HASH:4fbf41961eee660d61c5b11514b9f49a3fdeb2b5
// @DATE:Sun May 17 21:08:35 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:17
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:11
// @LINE:10
class ReverseFileApplication {


// @LINE:10
def getassetlist(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/asset")
}
                        

// @LINE:11
def generateThumbNails(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/thumb")
}
                        

}
                          

// @LINE:9
class ReverseCustomerApplication {


// @LINE:9
def getcust(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/getcust")
}
                        

}
                          

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:12
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
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
                  


// @LINE:17
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:11
// @LINE:10
class ReverseFileApplication {


// @LINE:10
def getassetlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FileApplication.getassetlist",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/asset"})
      }
   """
)
                        

// @LINE:11
def generateThumbNails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FileApplication.generateThumbNails",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/thumb"})
      }
   """
)
                        

}
              

// @LINE:9
class ReverseCustomerApplication {


// @LINE:9
def getcust : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerApplication.getcust",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/getcust"})
      }
   """
)
                        

}
              

// @LINE:17
class ReverseAssets {


// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserApplication.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserApplication.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
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
        


// @LINE:17
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:11
// @LINE:10
class ReverseFileApplication {


// @LINE:10
def getassetlist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FileApplication.getassetlist(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "getassetlist", Seq(), "GET", """""", _prefix + """home/asset""")
)
                      

// @LINE:11
def generateThumbNails(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FileApplication.generateThumbNails(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "generateThumbNails", Seq(), "GET", """""", _prefix + """home/thumb""")
)
                      

}
                          

// @LINE:9
class ReverseCustomerApplication {


// @LINE:9
def getcust(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerApplication.getcust(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getcust", Seq(), "GET", """""", _prefix + """home/getcust""")
)
                      

}
                          

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserApplication.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserApplication.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserApplication.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "login", Seq(), "POST", """""", _prefix + """home/""")
)
                      

}
                          
}
        
    