package controllers;

import models.SystemUser;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import se.c2.business.entity.user.UserManager;
import se.c2.migration.AssetExportProcessor;
import se.c2.util.Environments;
import se.c2.util.resources.RM;
import views.html.homepage;
import views.html.index;
import se.c2.business.entity.user.User;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;
import se.c2.migration.AssetExport;
import views.html.test;
import se.c2.migration.*;

/**
 * Created by Nisha
 */
public class UserApplication extends Controller {

    final static Form<SystemUser> userForm = Form.form(SystemUser.class);

    public static Result index() {
        return ok(index.render(userForm));
    }

    public static Result logout() {
        session().clear();
        return ok(index.render(userForm));
    }


    public static Result login() {

        final String client = "bong";
        final String language = "en";
        RM.register(client, language);

        return ok();
    }
   /* public static Result login() {
        Form<SystemUser> filledForm = userForm.bindFromRequest();
        SystemUser created = filledForm.get();
        return ok(homepage.render(created));

        if(session().get("userId")!= null ) {
            return ok(homepage.render(created));
        } else {
            Authentication autName = authenticate(created.username, created.password);

            switch (autName) {

                case INVALID_PASSWORD: // Invalid password
                    filledForm.reject("password", "Invalid Password");
                    return badRequest(index.render(filledForm));

                case INVALID_USERNAME: // Invalid username
                    filledForm.reject("username", "Invalid username");
                    return badRequest(index.render(filledForm));

                case SUCCESS: // valid user
                    return ok(homepage.render(created));

                }

        }

    }*/

    public static Authentication authenticate(String username, String password) {
        //List <SystemUser> user= models.SystemUser.find().where().icontains("username", username).findList();
        List<SystemUser> user = SystemUser.findviacore();


        if (user.size() != 0) {
            if (user.get(0).password.equals(password) && user.get(0).username.equals(username)) {
                //session("userId", Integer.toString(user.get(0).userId));
                //session("username",user.get(0).username);
                // session("userType",user.get(0).userType);
                return Authentication.SUCCESS; // valid user
            }
            if (!user.get(0).password.equals(password)) {
                return Authentication.INVALID_PASSWORD; //password is incorrect
            }
            if (!user.get(0).username.equals(username)) {
                return Authentication.INVALID_USERNAME; //username is incorrect
            }
        }
        return null; //Authentication.NEW; //user does not exist

    }

    public static enum Authentication {
        SUCCESS, INVALID_PASSWORD, INVALID_USERNAME
    }

    public static String testMethod()  {

        final Environments env = Environments.BongDemo;
        try {
            AssetExport ae = new AssetExport(env,"nisha_c2","c2pass12");

            return "ok";
        } catch (SQLException e) {
            return e.toString();
        }

       /* final Environments environment = Environments.BongDemo;
        final String username = "marcus_a";
        final String password = "testtest2";
        final Path outputPath = Paths.get("\\\\airportstorage1\\storage\\coop\\transparent\\");
        System.out.println("ShoppaAssetExportProcessor ");
        try {
        AssetExport assetExport = new AssetExport(environment, username, password);
        AssetExportProcessor assetExportProcessor = new ShoppaAssetExportProcessor(environment, outputPath);
            assetExport.process(assetExportProcessor);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


    }


    public static Result test() {

        return ok(test.render(testMethod()));
    }

}
