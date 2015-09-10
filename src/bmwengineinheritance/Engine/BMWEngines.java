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
public interface BMWEngines {
    
    // Each engine has the following properties in common
    public double GetDisplacement();
    public double GetPeakHorsepower();
    public double GetPeakTorque();
    public int GetNumberCylinders();
    public String getConfiguration();
    
    // In order to full implement the child class, the specific engine class,
    // all of these properties must be completed.
    
}
