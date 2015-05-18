package controllers;

import models.Asset;
import models.Customer;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import se.c2.business.asynchronicservices.task.UpdateAssets;

/**
 * Created by Nisha on 2015-05-05.
 */
public class FileApplication extends Controller {

    private static final Properties properties = loadProperties();
    final static Form<Customer> custForm = Form.form(Customer.class);
    final static Form<Asset> assetForm = Form.form(Asset.class);


    public static Properties loadProperties() {
        Properties properties = new Properties();
        try {
            properties.load(FileApplication.class.getResourceAsStream("/public/files/filepaths.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Couldn't read the file." + e);

        }
        return properties;
    }

    public static String[] getFilePaths(String client) {
        if (properties.containsKey(client)) {
            String[] filepaths = properties.getProperty(client).split(",");
            return filepaths;
        }
        return null;
    }


    public static List<Asset> getMissingThumbFiles(String client) {


        List<String> originalAssetList = new ArrayList<String>();
        List<String> thumbAssetList = new ArrayList<>();

        File fOriginal = new File(getFilePaths(client)[0]);
        File fThumb = new File(getFilePaths(client)[1]);

        ArrayList<String> orgFileNames = new ArrayList<String>(Arrays.asList(fOriginal.list()));

        try {
            for (String fn : orgFileNames) {

                originalAssetList.add(fn.substring(2, fn.indexOf(".")));
            }
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        ArrayList<String> thumbFileNames = new ArrayList<String>(Arrays.asList(fThumb.list()));
        try {
            for (String fn : thumbFileNames) {

                thumbAssetList.add(fn.substring(2, fn.indexOf(".")));

            }
        }catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        boolean haveMatch = originalAssetList.removeAll(thumbAssetList);

        List<Asset> assetListWithoutThumb = new ArrayList<Asset>();

        // for (String s : originalAssetList) {
        //   assetListWithoutThumb.add(new Asset(s));
        //}
        // ArrayList<String> orgFileNames2 = new ArrayList<String>(Arrays.asList(fOriginal.list()));
        try {
            for (String fn : orgFileNames) {

                if (originalAssetList.contains(fn.substring(2, fn.indexOf(".")))) {
                    assetListWithoutThumb.add(new Asset(fn));
                }
                // originalAssetList.add(fn.substring(2, fn.indexOf(".")));
            }

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return assetListWithoutThumb;


    }

    public static Result getassetlist() {
        Form<Customer> filledForm = custForm.bindFromRequest();
        Customer selected = filledForm.get();
        return ok(views.html.assetList.render(getMissingThumbFiles(selected.name), assetForm));
    }

    public static Result generateThumbNails() {
        Form<Asset> filledForm = assetForm.bindFromRequest();
        Asset selected = filledForm.get();
        //List<Asset> selecteAssets = new ArrayList<Asset>();
        //selecteAssets.add(selected);
        //return ok(views.html.assetList.render(selecteAssets,assetForm));

        try {
            UpdateAssets update = new UpdateAssets("3791","bong","en",null,null,"5");
            update.update();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ok(selected.selectedAssets.get(0));
    }
}
