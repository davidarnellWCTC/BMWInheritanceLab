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
public abstract class M10Engine implements BMWEngines {
        // Every M10 based engine will be 4 cylinders
    // There are no exceptions to this rule
    public  int GetNumberCylinders() {
        return 4;        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Every M10 based engine will be an inline 4
    // There are no exceptions to this rule
    public  String getConfiguration() {
        return "inline";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
