/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator5;

/**
 *
 * @author me
 */
public class CatalogInvalidException extends Exception {
    public InvalidCatalogException(Exception ex) {
 super("Invalid catalog file.", ex);
 }

}
