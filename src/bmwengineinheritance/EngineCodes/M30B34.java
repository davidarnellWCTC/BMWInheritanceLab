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
public class M30B34 extends M30Engine{

    // The methods in this class complete the abstract methods it inherited
    public double GetDisplacement() {
        return 3.428;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double GetPeakHorsepower() {
        return 185;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double GetPeakTorque() {
        return 213;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
