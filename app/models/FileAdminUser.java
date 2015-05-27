package models;

import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.List;

import se.c2.business.entity.user.User;
import se.c2.business.entity.user.UserManager;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Nisha
 */
@Entity
public class FileAdminUser extends Model {
    @Id
    public String username;
    public String password;


    public static Model.Finder<Long, FileAdminUser> find() {

        return new Model.Finder<>(Long.class, FileAdminUser.class);

    }


}

