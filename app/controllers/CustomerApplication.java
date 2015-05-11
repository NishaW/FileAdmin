package controllers;

import models.Customer;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.customerList;
import views.html.homepage;
import se.c2.util.Environments;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nisha on 2015-05-04.
 */
public class CustomerApplication extends Controller {


    public static List<Customer> getCustomerList() {

        List<Customer> cusList = new ArrayList<Customer>();

        for (Environments mount : Environments.values()) {

            cusList.add(new Customer(mount.getClient()));

        }

        return cusList;

    }

   // public static Result home() {
     //   return ok(homepage.render(getCustomerList()));
    //}

    public static Result getIframe() {
        return ok(views.html.iframe.render());
    }

    public static Result getcust() {
        return ok(customerList.render(getCustomerList()));
    }


}

