/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.ModelOptions;

/**
 *
 * @author David
 */
public class OptionIs implements Package{
    // Each package has a different level description, suspension
    // setup, and interior options.
    
    // It's way more comlicated than these three options but I'm keeping it simple
        
    public String GetDesignation() {
        return "Sport";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String GetSuspension() {
        return "Sport Suspension";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String GetInterior() {
        return "Sport Interior";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Im completely guessing on what I need to do here.
//    final String DESIGNATION = "Sport Model";
//    final String SUSPENSION = "Sport Suspension";
//    final String INTERIOR = "Sport Interior";
    
}
