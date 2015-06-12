// @SOURCE:C:/Users/Nisha/Documents/GitHub/FileAdmin/conf/routes
// @HASH:eec66952393e9a50c4275041f2b1671a95406b64
// @DATE:Wed Jun 10 21:37:38 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:19
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseFileApplication {


// @LINE:10
def getAssetList(page:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/asset/" + implicitly[PathBindable[Integer]].unbind("page", page))
}
                        

// @LINE:11
def getFirstAssestList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/firstasset")
}
                        

// @LINE:12
def generateThumbNails(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/thumb")
}
                        

}
                          

// @LINE:9
class ReverseCustomerApplication {


// @LINE:9
def getCust(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "home/getCust")
}
                        

}
                          

// @LINE:19
class ReverseAssets {


// @LINE:19
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:13
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
                  


// @LINE:19
// @LINE:13
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
// @LINE:11
// @LINE:10
class ReverseFileApplication {


// @LINE:10
def getAssetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FileApplication.getAssetList",
   """
      function(page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/asset/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page)})
      }
   """
)
                        

// @LINE:11
def getFirstAssestList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FileApplication.getFirstAssestList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/firstasset"})
      }
   """
)
                        

// @LINE:12
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
def getCust : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerApplication.getCust",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/getCust"})
      }
   """
)
                        

}
              

// @LINE:19
class ReverseAssets {


// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:13
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
        


// @LINE:19
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:12
// @LINE:11
// @LINE:10
class ReverseFileApplication {


// @LINE:10
def getAssetList(page:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FileApplication.getAssetList(page), HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "getAssetList", Seq(classOf[Integer]), "GET", """""", _prefix + """home/asset/$page<[^/]+>""")
)
                      

// @LINE:11
def getFirstAssestList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FileApplication.getFirstAssestList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "getFirstAssestList", Seq(), "GET", """""", _prefix + """home/firstasset""")
)
                      

// @LINE:12
def generateThumbNails(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FileApplication.generateThumbNails(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "generateThumbNails", Seq(), "GET", """""", _prefix + """home/thumb""")
)
                      

}
                          

// @LINE:9
class ReverseCustomerApplication {


// @LINE:9
def getCust(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerApplication.getCust(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getCust", Seq(), "GET", """""", _prefix + """home/getCust""")
)
                      

}
                          

// @LINE:19
class ReverseAssets {


// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseUserApplication {


// @LINE:13
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
        
    