/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseAbstracta;

/**
 *
 * @author Pedro Pérez
 */
public class Gato extends Animal{
    
    public Gato() {
        nombre = "Gato";
        peso = 2;
    }

    @Override 
    public String ruido(){
        return "Miau Miau";
    }
    
}
