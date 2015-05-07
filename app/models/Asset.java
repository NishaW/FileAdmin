package models;

import play.db.ebean.Model;

/**
 * Created by Nisha on 2015-05-05.
 */
public class Asset extends Model {

    public int assetId;
    public String assetName;

 public Asset(String assetName) {

     this.assetName= assetName;


    }
}
