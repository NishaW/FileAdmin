package models;

import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nisha on 2015-05-04.
 */
public class Customer extends Model {

    public String name;

    public Customer(String name) {

        this.name = name;
    }

    public Customer() {


    }


}
