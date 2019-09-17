/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPerros;

/**
 * Constructor de Perros
 * 
 * @author Pedro Daniel Pérez Sánchez
 */
public class perro {
    
    //Atributos
    private String Raza; 
    private String tamaño; 
    private String Años; 
    private String Color; 
    
    //Constructor
    /**
     *  Constructor por defecto de perros
     */
    public perro() {
        this.Raza = "Default";
        this.tamaño = "Default";
        this.Años = "Default";
        this.Color = "Default";
    }
    
    /**
     * Constructor de perros pasandole los atributos por parametros
     * 
     * @param Raza
     * @param tamaño
     * @param Años
     * @param Color 
     */
    public perro(String Raza, String tamaño, String Años, String Color) {
        this.Raza = Raza;
        this.tamaño = tamaño;
        this.Años = Años;
        this.Color = Color;
    }
    
    public String getInfo(){
        return this.Raza+", "+this.tamaño+", "+this.Años+", "+this.Color;
    }
    
    /* Gettlers AND Settlers ############  */
    
    public String getRaza() {
        return Raza;
    }
    /**
     * 
     * @param Raza 
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    /**
     * 
     * @return 
     */
    public String getTamaño() {
        return tamaño;
    }
    
    /**
     * 
     * @param tamaño 
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getAños() {
        return Años;
    }
    
    /**
     * 
     * @param Años 
     */
    public void setAños(String Años) {
        this.Años = Años;
    }
    
    /**
     * 
     * @return 
     */
    public String getColor() {
        return Color;
    }
    
    /**
     * 
     * @param Color 
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
   
    
    
    
}
