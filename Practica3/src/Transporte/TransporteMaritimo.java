/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author rachm
 */
public abstract class TransporteMaritimo {

    private String matricula;
    private int numPasaje;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPasaje() {
        return numPasaje;
    }

    public void setNumPasaje(int numPasaje) {
        this.numPasaje = numPasaje;
    }
    
    public String avanzar(){
        return "Maritimo Avanzando";
    }
    
    
    /*Toda clase abstracta debe de tener un metodo abstracto*/
    public abstract String encender();
    
}
