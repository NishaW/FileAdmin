package controllers;

import models.Asset;
import models.Customer;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.File;
import java.io.IOException;
import java.util.*;

import scala.Console;
import se.c2.business.asynchronicservices.task.UpdateAssets;
import se.c2.data.access.DatabaseContext;
import se.c2.data.implementation.ConnectionManager;
import se.c2.engine.Engine;
import se.c2.util.Environments;
import se.c2.util.resources.RM;
import se.c2.data.implementation.ServiceConnectionManager;

import static se.c2.data.implementation.ServiceConnectionManager.getConnectionPool;


/**
 * Created by Nisha on 2015-05-05.
 */
public class FileApplication extends Controller {

    private static final Properties properties = loadProperties();
    final static Form<Customer> custForm = Form.form(Customer.class);
    final static Form<Asset> assetForm = Form.form(Asset.class);


    public static Properties loadProperties() {
        // Load properties (path) from "filepaths.properties" file.
        Properties properties = new Properties();
        try {
            properties.load(FileApplication.class.getResourceAsStream("/public/files/filepaths.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Couldn't read the file." + e);

        }
        return properties;
    }

    public static String[] getFilePaths(String client) {
        // Retrieve and return paths according to selected client(Customer)
        if (properties.containsKey(client)) {
            String[] filePaths = properties.getProperty(client).split(",");
            return filePaths;
        }
        return null;
    }


    public static List<Asset> getMissingThumbFiles(String client) {
        /* Fetch original assets from the storage folder and thumb assets from the smallth folder,
         * Breaks them into substring to get only the assetId,
         * Checks the difference of two arrays and delete the matching assetId to filter out assets
         * which doesn't have a thumbnail file */
        List<String> originalAssetList = new ArrayList<String>();
        List<String> thumbAssetList = new ArrayList<>();

        File fOriginal = new File(getFilePaths(client)[0]);
        File fThumb = new File(getFilePaths(client)[1]);


        ArrayList<String> orgFileNames = new ArrayList<String>(Arrays.asList(fOriginal.list()));
        Collections.sort(orgFileNames, Collections.reverseOrder());

        try {
            for (String fn : orgFileNames) {
                //Console.println(fn);
                if (fn.contains(".")){
                    originalAssetList.add(fn.substring(2, fn.indexOf(".")));
                }
            }

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        ArrayList<String> thumbFileNames = new ArrayList<String>(Arrays.asList(fThumb.list()));
        try {
            for (String fn : thumbFileNames) {

                    thumbAssetList.add(fn.substring(2, fn.indexOf(".")));
                }


        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        boolean haveMatch = originalAssetList.removeAll(thumbAssetList);

        List<Asset> assetListWithoutThumb = new ArrayList<Asset>();

        try {
            for (String fn : orgFileNames) {
                Console.println(fn);
                if (fn.contains(".")) {
                    if (originalAssetList.contains(fn.substring(2, fn.indexOf(".")))) {
                        assetListWithoutThumb.add(new Asset(fn));
                    }
                }
            }

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        //Collections.sort(assetListWithoutThumb, Collections.reverseOrder());

        return assetListWithoutThumb;

    }

    public static Result getAssetList() {
        // Retrieve selected assets
        Form<Customer> filledForm = custForm.bindFromRequest();
        Customer selected = filledForm.get();
        session("clientname", selected.name);
        return ok(views.html.assetList.render(getMissingThumbFiles(selected.name), assetForm));
    }

    public static Result generateThumbNails() {
        // Send the selected assets to xmengine of regenerating process.
        Form<Asset> filledForm = assetForm.bindFromRequest();
        Asset selected = filledForm.get();
        List<Asset> selectedAssets = new ArrayList<Asset>();
        Environments environments = Environments.valueOf(session().get("clientname"));

        String assetList = "";
        try {

            for (String s : selected.selectedAssets) {
                if (s != null) {
                    assetList = assetList + s.substring(2, s.indexOf(".")) + ",";
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
                environments.register();
                ConnectionManager.setDataSource(getConnectionPool(environments.getClient(), DatabaseContext.getApplicationDatabaseContext()));
                Engine.login(environments.getClient(), "david_c2", "c2pass12");
                UpdateAssets updateAssets = new UpdateAssets(assetList, environments.getClient(), "", "", "", "0");
                updateAssets.update();

        } catch (Exception e) {
            e.printStackTrace();
        }
        // return ok(selected.selectedAssets.get(0));
        return ok(assetList + session().get("clientname"));
    }

    private static DatabaseContext getDatabaseContext() {
        DatabaseContext databaseContext = new DatabaseContext(
                "c2-db01",
                "bong_ap",
                "sa",
                "fireworks",
                "");
        return databaseContext;
    }
}
