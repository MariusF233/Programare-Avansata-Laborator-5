/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author me
 */
public class CatalogUtil {

    public static void save(Catalog catalog)
            throws IOException {
        try ( var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getpath()))) {
            oos.writeObject(catalog);
        }
    }

    public static Catalog load(String path) throws InvalidCatalogException {
       try (var object=new ObjectOutputStream(new FileOutputStream(document.getlocation()))) {
       var destinatie=new ObjectInputStream(new FileInputStream(catalog.getpath()))
           
           object.load(destinatie);
       
       }catch(IOException e1){e1.printStackTrace();}
       }
    
     public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();
        if(desktop.getlocation().equals(path)
       open(path);
        else  findById(id);


//… browse or open, depending of the location type
                
    }
    }

   


