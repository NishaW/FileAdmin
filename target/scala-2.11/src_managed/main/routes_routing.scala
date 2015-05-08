// @SOURCE:C:/Users/Nisha/Documents/GitHub/FileAdministration/FileAdmin/conf/routes
// @HASH:1757e2bd30442443c44862557071c094b34c61f2
// @DATE:Thu May 07 13:46:12 CEST 2015


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
private[this] lazy val controllers_CustomerApplication_home1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/"))))
private[this] lazy val controllers_CustomerApplication_home1_invoker = createInvoker(
controllers.CustomerApplication.home(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "home", Nil,"POST", """""", Routes.prefix + """home/"""))
        

// @LINE:8
private[this] lazy val controllers_CustomerApplication_home2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/"))))
private[this] lazy val controllers_CustomerApplication_home2_invoker = createInvoker(
controllers.CustomerApplication.home(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "home", Nil,"GET", """""", Routes.prefix + """home/"""))
        

// @LINE:9
private[this] lazy val controllers_CustomerApplication_getIframe3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/iframe"))))
private[this] lazy val controllers_CustomerApplication_getIframe3_invoker = createInvoker(
controllers.CustomerApplication.getIframe(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getIframe", Nil,"GET", """""", Routes.prefix + """home/iframe"""))
        

// @LINE:10
private[this] lazy val controllers_CustomerApplication_getcust4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/getcust"))))
private[this] lazy val controllers_CustomerApplication_getcust4_invoker = createInvoker(
controllers.CustomerApplication.getcust(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerApplication", "getcust", Nil,"GET", """""", Routes.prefix + """home/getcust"""))
        

// @LINE:11
private[this] lazy val controllers_UserApplication_test5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/test"))))
private[this] lazy val controllers_UserApplication_test5_invoker = createInvoker(
controllers.UserApplication.test(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserApplication", "test", Nil,"GET", """""", Routes.prefix + """home/test"""))
        

// @LINE:12
private[this] lazy val controllers_FileApplication_getassetlist6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/asset"))))
private[this] lazy val controllers_FileApplication_getassetlist6_invoker = createInvoker(
controllers.FileApplication.getassetlist(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FileApplication", "getassetlist", Nil,"GET", """""", Routes.prefix + """home/asset"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.UserApplication.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/""","""controllers.CustomerApplication.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/""","""controllers.CustomerApplication.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/iframe""","""controllers.CustomerApplication.getIframe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/getcust""","""controllers.CustomerApplication.getcust()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/test""","""controllers.UserApplication.test()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/asset""","""controllers.FileApplication.getassetlist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_CustomerApplication_home1_route(params) => {
   call { 
        controllers_CustomerApplication_home1_invoker.call(controllers.CustomerApplication.home())
   }
}
        

// @LINE:8
case controllers_CustomerApplication_home2_route(params) => {
   call { 
        controllers_CustomerApplication_home2_invoker.call(controllers.CustomerApplication.home())
   }
}
        

// @LINE:9
case controllers_CustomerApplication_getIframe3_route(params) => {
   call { 
        controllers_CustomerApplication_getIframe3_invoker.call(controllers.CustomerApplication.getIframe())
   }
}
        

// @LINE:10
case controllers_CustomerApplication_getcust4_route(params) => {
   call { 
        controllers_CustomerApplication_getcust4_invoker.call(controllers.CustomerApplication.getcust())
   }
}
        

// @LINE:11
case controllers_UserApplication_test5_route(params) => {
   call { 
        controllers_UserApplication_test5_invoker.call(controllers.UserApplication.test())
   }
}
        

// @LINE:12
case controllers_FileApplication_getassetlist6_route(params) => {
   call { 
        controllers_FileApplication_getassetlist6_invoker.call(controllers.FileApplication.getassetlist())
   }
}
        

// @LINE:16
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     