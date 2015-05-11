package controllers;

import models.Asset;
import play.mvc.Controller;
import play.mvc.Result;
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

        File fOriginal = new File("\\\\teststorage1\\storage\\bong\\storage\\");
        File fThumb = new File("\\\\teststorage1\\storage\\bong\\smallth\\");

        ArrayList<String> orgFileNames = new ArrayList<String>(Arrays.asList(fOriginal.list()));

        try {
            for (String fn : orgFileNames) {

                originalAssetList.add(fn.substring(2, fn.indexOf(".")));
            }
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        ArrayList<String> thumbFileNames = new ArrayList<String>(Arrays.asList(fThumb.list()));
        for (String fn : thumbFileNames) {

            thumbAssetList.add(fn.substring(2, fn.indexOf(".")));

        }
        boolean x = originalAssetList.removeAll(thumbAssetList);

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
