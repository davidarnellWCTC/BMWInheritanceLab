/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.EngineCodes;

/**
 *
 * @author David
 */
public class M20B25 extends M20Engine{

    // The methods in this class complete the abstract methods it inherited
    public double GetDisplacement() {
        return 2.494;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double GetPeakHorsepower() {
        return 168;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double GetPeakTorque() {
        return 163;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    public String testing = "1234";
    
}
