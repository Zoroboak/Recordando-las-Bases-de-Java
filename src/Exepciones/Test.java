/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author Pedro Pérez
 */
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("Dame un codigo postal");
        Scanner entrada = new Scanner(System.in);
        int codigoPostal = entrada.nextInt();
        
        Direccion trabajo = new Direccion();
        
        try {
            trabajo.setCodigoPostal(codigoPostal);
            System.out.println("Codigo Postal Correcto");
            
        } catch (BadPostCodeException e) {
            System.out.println("Exepción: "+e.getMessage());
        }
        
        System.out.println("");
        System.out.println("Fin del programa :D");
        
        
    }
}
