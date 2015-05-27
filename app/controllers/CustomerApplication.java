package controllers;

import models.Customer;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.customerList;
import se.c2.util.Environments;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nisha on 2015-05-04.
 */
public class CustomerApplication extends Controller {

    final static Form<Customer> custForm = Form.form(Customer.class);


    public static List<Customer> getCustomerList() {
// Retrieve all the Customers from Environments class.
        List<Customer> cusList = new ArrayList<Customer>();
        try {
            for (Environments env : Environments.values()) {

                cusList.add(new Customer(env.name()));

            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return cusList;

    }


    public static Result getCust() {

        return ok(customerList.render(getCustomerList(), custForm));
    }


}

