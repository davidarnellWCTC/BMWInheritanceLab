/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.Cars;

import bmwengineinheritance.Engine.Engine;
import bmwengineinheritance.Engine.M20B25;
import bmwengineinheritance.ModelOptions.OptionI;

/**
 *
 * @author David
 */
public class Model325i implements E30Generation {

    public void GetEngine() {        
        Engine engine = new M20B25();        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Package package = new OptionI();

//    public void GetPackage() {
//        Package package = new OptionI();
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }  
}
