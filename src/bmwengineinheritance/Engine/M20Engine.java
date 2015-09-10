/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.Engine;

/**
 *
 * @author David
 */
public abstract class M20Engine implements BMWEngines{
    
    // Every M20 based engine will be 6 cylinders
    // There are no exceptions to this rule
    public  int GetNumberCylinders() {
        return 6;        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Every M20 based engine will be an inline 6
    // There are no exceptions to this rule
    public  String getConfiguration() {
        return "inline";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
