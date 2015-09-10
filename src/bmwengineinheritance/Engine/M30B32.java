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
public class M30B32 extends M30Engine {
    
    // The methods in this class complete the abstract methods it inherited
    public double GetDisplacement() {
        return 3.210;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double GetPeakHorsepower() {
        return 179;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double GetPeakTorque() {
        return 195;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
