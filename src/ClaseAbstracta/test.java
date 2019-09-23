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
        
        listaAnimales.get(0).getNombre();
        
        Iterator it = listaAnimales.iterator();
        
        while(it.hasNext()){
            System.out.println("El "+it.next().getClass().getSimpleName()+" "+it.next().getNombre());
        }
        
        
        
    }
    
    
}
