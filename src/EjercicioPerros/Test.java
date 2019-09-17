/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPerros;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        //Declaramos el ArrayList
        ArrayList<perro> listaPerros = new ArrayList();
        
        listaPerros.add(new perro("Mastin", "Grande", "5 Años", "Negro"));
        listaPerros.add(new perro("Maltés", "Mediano", "3 Años", "Blanco"));
        listaPerros.add(new perro("Mastin", "Pequeño", "1 Años", "Azul"));
        
        for(int i=0;i<listaPerros.size();i++) {
            System.out.println(listaPerros.get(i).getInfo());
          }
        
        
        
        
    }
    
}
