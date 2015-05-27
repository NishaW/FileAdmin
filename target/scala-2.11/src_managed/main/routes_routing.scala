// @SOURCE:C:/Users/Nisha/Documents/GitHub/FileAdmin/conf/routes
// @HASH:e37410c4fb6776215896625cb0615a87f97368d7
// @DATE:Sun May 24 20:18:15 CEST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_UserApplication_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_UserApplication_index0_invoker = createInvoker(
controllers.UserApplication.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_UserApplication_login1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/"))))
private[this] lazy val controllers_UserApplication_login1_invoker = createInvoker(
controllers.UserApplication.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "login", Nil,"POST", """""", Routes.prefix + """home/"""))
        

// @LINE:8
private[this] lazy val controllers_UserApplication_login2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/"))))
private[this] lazy val controllers_UserApplication_login2_invoker = createInvoker(
controllers.UserApplication.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "login", Nil,"GET", """""", Routes.prefix + """home/"""))
        

// @LINE:9
private[this] lazy val controllers_CustomerApplication_getCust3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/getCust"))))
private[this] lazy val controllers_CustomerApplication_getCust3_invoker = createInvoker(
controllers.CustomerApplication.getCust(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getCust", Nil,"GET", """""", Routes.prefix + """home/getCust"""))
        

// @LINE:10
private[this] lazy val controllers_FileApplication_getAssetList4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/asset"))))
private[this] lazy val controllers_FileApplication_getAssetList4_invoker = createInvoker(
controllers.FileApplication.getAssetList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "getAssetList", Nil,"GET", """""", Routes.prefix + """home/asset"""))
        

// @LINE:11
private[this] lazy val controllers_FileApplication_generateThumbNails5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/thumb"))))
private[this] lazy val controllers_FileApplication_generateThumbNails5_invoker = createInvoker(
controllers.FileApplication.generateThumbNails(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "generateThumbNails", Nil,"GET", """""", Routes.prefix + """home/thumb"""))
        

// @LINE:12
private[this] lazy val controllers_UserApplication_logout6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_UserApplication_logout6_invoker = createInvoker(
controllers.UserApplication.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:17
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.UserApplication.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/""","""controllers.UserApplication.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/""","""controllers.UserApplication.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/getCust""","""controllers.CustomerApplication.getCust()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/asset""","""controllers.FileApplication.getAssetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/thumb""","""controllers.FileApplication.generateThumbNails()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.UserApplication.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_UserApplication_index0_route(params) => {
   call { 
        controllers_UserApplication_index0_invoker.call(controllers.UserApplication.index())
   }
}
        

// @LINE:7
case controllers_UserApplication_login1_route(params) => {
   call { 
        controllers_UserApplication_login1_invoker.call(controllers.UserApplication.login())
   }
}
        

// @LINE:8
case controllers_UserApplication_login2_route(params) => {
   call { 
        controllers_UserApplication_login2_invoker.call(controllers.UserApplication.login())
   }
}
        

// @LINE:9
case controllers_CustomerApplication_getCust3_route(params) => {
   call { 
        controllers_CustomerApplication_getCust3_invoker.call(controllers.CustomerApplication.getCust())
   }
}
        

// @LINE:10
case controllers_FileApplication_getAssetList4_route(params) => {
   call { 
        controllers_FileApplication_getAssetList4_invoker.call(controllers.FileApplication.getAssetList())
   }
}
        

// @LINE:11
case controllers_FileApplication_generateThumbNails5_route(params) => {
   call { 
        controllers_FileApplication_generateThumbNails5_invoker.call(controllers.FileApplication.generateThumbNails())
   }
}
        

// @LINE:12
case controllers_UserApplication_logout6_route(params) => {
   call { 
        controllers_UserApplication_logout6_invoker.call(controllers.UserApplication.logout())
   }
}
        

// @LINE:17
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     