/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

public class Automovil implements TransporteTerrestre{

    private String color;
    
    @Override
    public String avanzar() {
        return "Automovil Avanzando";
    }

    @Override
    public String frenar() {
        return "Automovil Frenando";
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
