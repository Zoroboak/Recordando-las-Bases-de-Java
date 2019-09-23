/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

/**
 *
 * @author Pedro Pérez
 */
public class ManejoExepciones {
    
    public static void main(String[] args) {
        
        int[] listaNumeros = {0,1,2,3,4,5,6,7,8,9};
        
        try {
            
            System.out.println(listaNumeros[199]);
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e.getMessage());
        }catch(Exception i){
            System.out.println("Error: "+i.getMessage());
        }finally{
            System.out.println("Final");
        }
        
        
    }
}
