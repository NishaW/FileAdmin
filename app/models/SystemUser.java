package models;

import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.List;

import se.c2.business.entity.user.User;
import se.c2.business.entity.user.UserManager;
import se.c2.engine.Engine;

/**
 * Created by Nisha
 */

public class SystemUser {

    public String username;
    public String password;


    public static Model.Finder<Long, SystemUser> find() {

        return new Model.Finder<>(Long.class, SystemUser.class);

    }
    public static List <SystemUser> findviacore() {
        List <SystemUser> systemUser = new ArrayList <SystemUser>();
        return systemUser;

        }

    public String getUser() {

        try {
            UserManager usm = new UserManager();
            User u =usm.validateUser("nisha_c2", "c2pass12");

           // Engine engine = Engine.login("MyAirport","nisha_c2","c2pass12");

            if (u.getName()!=null){

                return "SUCCESS";
            }
            else{

                return  "User Not Found";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "nothing found";

    }


}

