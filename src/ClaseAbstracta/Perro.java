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
public class Perro extends Animal{

    public Perro() {
        nombre = "Perro";
        peso = 5;
    }

    public String ruido(){
        return "El Perro hace Gua Guau";
    }
}
