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
public abstract class Animal {
    
    protected double peso = 0;
    protected String nombre = "";

    public double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String ruido();
    
    
    
}
