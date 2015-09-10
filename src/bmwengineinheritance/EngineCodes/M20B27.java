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
public class M20B27 extends M20Engine {

    // The methods in this class complete the abstract methods it inherited
    public double GetDisplacement() {
        return 2.693;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double GetPeakHorsepower() {
        return 127;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double GetPeakTorque() {
        return 170;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
