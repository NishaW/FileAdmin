package controllers;

import models.Asset;
import play.mvc.Controller;
import play.mvc.Result;
import scala.reflect.internal.Trees;
import views.html.customerList;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nisha on 2015-05-05.
 */
public class FileApplication extends Controller {


    public static List<Asset> getMissingThumbFiles() {
        List<String> originalAssetList = new ArrayList<String>();
        List<String> thumbAssetList = new ArrayList<>();

        File fOriginal = new File("C:\\Users\\Nisha\\Pictures\\Bong");
        File fThumb = new File("C:\\Users\\Nisha\\Pictures\\Bong_Thumb");

        //(Arrays.asList(fThumb.list())
       // boolean x= Arrays.asList(fOriginal.list()).removeAll(Arrays.asList(fThumb.list()));


        ArrayList<String> orgFileNames = new ArrayList<String>(Arrays.asList(fOriginal.list()));
       // Arrays.copyOfRange(orgFileNames,0,1);


        for (String fn : orgFileNames) {

            originalAssetList.add(fn.substring(2,fn.length()));

        }

        ArrayList<String> thumbFileNames = new ArrayList<String>(Arrays.asList(fThumb.list()));
        for (String fn : thumbFileNames) {

            thumbAssetList.add(fn.substring(2,fn.length()));

        }
        boolean x= originalAssetList.removeAll(thumbAssetList);
                //new ArrayList<String>(Arrays.asList(fOriginal.list()));
        List<Asset> assetListWithoutThumb = new ArrayList<Asset>();

        for (String s : originalAssetList) {
            assetListWithoutThumb.add(new Asset(s));
        }
        return assetListWithoutThumb;
    }

    public static Result getassetlist() {
        return ok(views.html.assetList.render(getMissingThumbFiles()));
    }
}
