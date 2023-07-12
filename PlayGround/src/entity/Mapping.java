package entity;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    private Map<String,String> mappingsTable;

    public Mapping() {
        this.mappingsTable = new HashMap<>();
    }

    public void save(String url,String shortenedURL){
        mappingsTable.put(url,shortenedURL);
    }

    public String getByshortenedURL(String url){
        if(!mappingsTable.containsKey(url)){
            // add a exception handling here
            return null;
        }
        return mappingsTable.get(url);
    }
}
