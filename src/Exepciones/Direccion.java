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
public class Direccion {
    
    private String calle = "";
    private String piso = "";
    private int codigoPostal = 00000;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) throws BadPostCodeException{
        
        if (codigoPostal<10000) {
            throw new BadPostCodeException("El código postal debe tener al menos 5 dígitos");
        }
        
        this.codigoPostal = codigoPostal;
    }
    
    
    
    
}
