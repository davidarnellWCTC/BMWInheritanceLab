/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.CarModels;

import bmwengineinheritance.EngineCodes.Engine;
import bmwengineinheritance.EngineCodes.M20B25;
import bmwengineinheritance.ModelOptions.OptionI;
import bmwengineinheritance.ModelOptions.Package;
/**
 *
 * @author David
 */
public class Model325i extends E30Generation  {

//    public Model325i(){
//        GetEngine();
//        //GetPackage();
//    }
//    public void GetEngine() {        
//        Engine engine = new M20B25();        
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public Model325i(){
        Engine engine = new M20B25();
        Package options = new OptionI();
        //GetEngine();
        //GetPackage();
    }
    
    //Engine engine = new M20B25();
    
    //Package option = new OptionI();

//    public void GetPackage() {
//        Package package = new OptionI();
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }  


}
