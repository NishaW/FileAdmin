package controllers;

import models.Customer;
import models.FileAdminUser;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.customerList;
import views.html.homepage;
import se.c2.util.Environments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nisha on 2015-05-04.
 */
public class CustomerApplication extends Controller {

    final static Form<Customer> custForm = Form.form(Customer.class);


    public static List<Customer> getCustomerList() {

        List<Customer> cusList = new ArrayList<Customer>();

        for (Environments mount : Environments.values()) {

            cusList.add(new Customer(mount.name()));

        }

        return cusList;

    }



    public static Result getcust() {

        return ok(customerList.render(getCustomerList(),custForm));
    }


}

