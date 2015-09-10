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
public interface OptionE extends Package {
    // Before BMW fell in love with sensors and complicating things,
    // they had the 'e' or 'eta - efficiency' models.
    // These had smaller engines designed to make power at lower RPM's
    // to reduce fuel consumption but still provide adequate power at
    // normal operatin speeds. Numbers sell more than efficiency and 
    // the option was discontinued.
    
    // Each package has a different level description, suspension
    // setup, and interior options.
    
    // It's way more comlicated than these three options but I'm keeping it simple
        
//    public String GetDesignation() {
//        return "Efficiency";
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public String GetSuspension() {
//        return "Standard Suspension";
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public String GetInterior() {
//        return "Base Interior";
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    // All of the strings declared in the parent interface stay the same
    // All accept this one
    // I want to be able to call this class as an interface when I'm assigning
    // a car's model. For example, the 325e "is-a" e30 and it can "e package"
    //@Override
    final String DESIGNATION ="Efficiency";
    
}
