/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author rachm
 */
public class TransporteAereo {
    
    private String matricula;
    private int numPasaje;
    
    public String avanzar(){
        return "AereoAvanza";
    }
    
    public String volar(){
        return "Aereo Volando";
    }

    private String color;
    
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the numPasaje
     */
    public int getNumPasaje() {
        return numPasaje;
    }

    /**
     * @param numPasaje the numPasaje to set
     */
    public void setNumPasaje(int numPasaje) {
        this.numPasaje = numPasaje;
    }
    
}
