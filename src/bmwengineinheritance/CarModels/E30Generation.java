/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.CarModels;

// I thought I could get the child classes to inherit imports
// Turns out I can't.
//import bmwengineinheritance.ModelOptions;

/**
 *
 * @author David
 */
public abstract class E30Generation implements Car {
    
    // I'm not sure if I understand this correctly.
    // I want this class to remain an interface but I also want
    // each class that implements/extends it to have this variable
    final String GENERATION = "e30";
}
