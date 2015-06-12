package models;

import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nisha on 2015-05-05.
 */
public class Asset extends Model {

    public String assetName;
    public String extension;
    public ArrayList<String> selectedAssets;

    public static Model.Finder<Long, Asset> FIND =
            new Model.Finder<Long, Asset>(Long.class, Asset.class);
    public Asset(String assetName) {

        this.assetName = assetName;
    }

    public Asset() {

    }
}
