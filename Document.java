/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author me
 */
public class Document {
 private String id;
 private String name;
 private String location; //file name or Web page
public Document(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
 public void setName(String newname) {
        this.name = newname;
    }
    public void setid(String newid) {
        this.id = newid;
    }
    public String getid() {
        return id;
    }
public String getlocation() {
        return location;
    }

    public void setlocation(String newlocation) {
        this.location = newlocation;
    }
   
 private Map<String, Object> tags = new HashMap<>();
 //…
 public void addTag(String key, Object obj) {
 tags.put(key, obj);
 }
//…
}

