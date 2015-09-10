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
public class OptionI implements Package {

    // Each package has a different level description, suspension
    // setup, and interior options.
    
    // It's way more comlicated than these three options but I'm keeping it simple
        
    
    
    public String GetDesignation() {
        return "Base Model";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    final String DESIGNATION = "Base";

    public String GetSuspension() {
        return "Standard Suspension";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    final String SUSPENSION = "Standard Suspension";

    public String GetInterior() {
        return "Standard Interior";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //final String INTERIOR = "Standard Interior";
    
//    final public String DESIGNATION = "Base Model";
//    final public String SUSPENSION = "Standard Suspension";
//    final public String INTERIOR = "Standard Interior";
    
}
