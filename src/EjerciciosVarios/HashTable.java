/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosVarios;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author alumno
 */
public class HashTable {
    
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("");
        System.out.println("********************");
        System.out.println("Practica: Hashtable");
        System.out.println("-------------------");
        /**
         * Declarando el hashTable
         */
        Hashtable<Integer,String> contenedor=new Hashtable<Integer,String>();
        
        
        /**
         * Insectando elementos
         */
        contenedor.put(101, "Harry");
        contenedor.put(102, "Potter");
        contenedor.put(103, "IRONMAN");
        contenedor.put(104, "IRONMAN");
        contenedor.put(105, "HALLO");
        
        /**
         * Obteniendo Valor
         */
        System.out.println("");
        System.out.println("Obteniendo Valor");
        System.out.println("----------------");
        System.out.println(contenedor.get(105));
        System.out.println(contenedor.get(101));
        
        
        /**
         * Recorrer HashTable
         */
        System.out.println("");
        System.out.println("Recorriendo HashTable");
        System.out.println("---------------------");
        Enumeration<String> enumeration = contenedor.elements();
        while (enumeration.hasMoreElements()) {
          System.out.println(""+"hashtable valores: " + enumeration.nextElement());
        }
        
        /**
         * Mostrar las claves
         */
        System.out.println("");
        System.out.println("Obteniendo las Claves");
        System.out.println("----------------------");
        Enumeration<Integer> llaves = contenedor.keys();
        while (llaves.hasMoreElements()) {
          System.out.println(""+"hashtable llaves: " + llaves.nextElement());
        }
        
        
        /**
         * Todas las claves
         */
        System.out.println("");
        System.out.println("Todas las Claves");
        System.out.println("----------------");
        System.out.println("Claves: " +contenedor.keys());
        
        
        /**
         * Eliminando la primera clave
         */
        System.out.println("");
        System.out.println("Eliminada clave: "+contenedor.get(101));
        System.out.println("----------------");
        contenedor.remove(101);
        
        
        
    }
    
    
}
