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
public class Oveja extends Animal{
    
    public Oveja() {
        nombre = "Perro";
        peso = 3.4;
    }

    @Override
    public String ruido(){
        return "Bala Bala";
    }
}
