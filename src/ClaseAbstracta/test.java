/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseAbstracta;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pedro Pérez
 */
public class test {
    
    public static void main(String[] args) {
        
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        
        listaAnimales.add(new Gato());
        listaAnimales.add(new Oveja());
        listaAnimales.add(new Perro());
        
        Iterator it = listaAnimales.iterator();
        
        while(it.hasNext()){
            Animal aux = (Animal) it.next();
            System.out.println(aux.ruido());
        }
        
        
        
    }
    
    
}
