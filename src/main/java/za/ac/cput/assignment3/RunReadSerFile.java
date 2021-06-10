/**
 * RunReadSerFile.java
 * @author Mongameli Shasha (219181527)
 * 08 June 2021
 */
package za.ac.cput.assignment3;

import java.util.Collections;


public class RunReadSerFile {
    
        public static void main(String args[])  {
        ReadSerFile obj = new ReadSerFile();
        obj.openFileRead();
        obj.readFile();
        obj.readCloseFile();
        obj.sortCustomer();
        obj.sortSuppliers();
        obj.displayCustomersText();
        obj.displaySupplierText();
        
    }
    
}
