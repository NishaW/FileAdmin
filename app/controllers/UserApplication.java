package controllers;

import models.FileAdminUser;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.homepage;

import java.util.List;


/**
 * Created by Nisha
 */
public class UserApplication extends Controller {

    final static Form<FileAdminUser> userForm = Form.form(FileAdminUser.class);

    public static Result index() {
        return ok(index.render(userForm));
    }

    public static Result logout() {
        session().clear();
        return ok(index.render(userForm));
    }

    public static Result login() {
        Form<FileAdminUser> filledForm = userForm.bindFromRequest();
        FileAdminUser created = filledForm.get();

        if (session().get("username") != null) {
            return ok(homepage.render(created));
        } else {
            Authentication autName = authenticate(created.username, created.password);

            switch (autName) {

                case INVALID_PASSWORD: // Invalid password
                    filledForm.reject("password", "Invalid username or password");
                    return badRequest(index.render(filledForm));

                case INVALID_USERNAME: // Invalid username
                    filledForm.reject("username", "Invalid username or password");
                    return badRequest(index.render(filledForm));

                case SUCCESS: // valid user
                    return ok(homepage.render(created));

            }
            return ok(homepage.render(created));
        }
    }

    public static Authentication authenticate(String username, String password) {
        List<FileAdminUser> user = models.FileAdminUser.find().where().icontains("username", username).findList();

        if (user.size() != 0) {
            if (user.get(0).password.equals(password) && user.get(0).username.equals(username)) {
                session("username", user.get(0).username);
                return Authentication.SUCCESS; // valid user
            }
            if (!user.get(0).password.equals(password)) {
                return Authentication.INVALID_PASSWORD; //password is incorrect
            }

        }
        return Authentication.INVALID_USERNAME; //user does not exist

    }

    public static enum Authentication {
        SUCCESS, INVALID_PASSWORD, INVALID_USERNAME,
    }


}
