package singleton.A6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> dataAccess = new Hashtable<>();
    List<String> dsSP = new ArrayList<>();
    public static DataAccessUpgrade getInstance(String tag){
        if(dataAccess.get(tag)==null){
            DataAccessUpgrade d = new DataAccessUpgrade();
            dataAccess.put(tag,d);
        }
        return dataAccess.get(tag);
    }

    public void add(String s) { dsSP.add(s); }
}
