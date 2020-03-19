/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author me
 */
public class Catalog {
    private String name;
 private String path;
 public Catalog(String name)
 {
 this.name=name;
 }
 private List<Document> documents = new ArrayList<>();
 public String getName() {
        return name;
    }
 public void setName(String newname) {
        this.name = newname;
    }
 public String getpath() {
        return path;
    }
 public void setpath(String newpath) {
        this.path = newpath;
    }
 
 public void add(Document doc) {
 documents.add(doc);
 }
 public Document findById(String id) {
 for (Document doc : documents) {
 if (doc.getid().equals(id)) {
 return doc;
 }
 }
 return null;
 }

}
