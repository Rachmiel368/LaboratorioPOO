/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;



/**
 *
 * @author rachm
 */
public class Vehiculo {
    
    private String color, marca, modelo;
    private int gasolina;
    private boolean encendido;
    
    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }
    
    void encender(int gas)
    {
        if (gas > 0) {
            this.encendido = true;
            this.gasolina = gas;
            System.out.print("Enciende");
        } else {
            System.out.print("No hay suficiente gasolina para encender el vehículo.");
        }
    }
    
    public String avanzar(int gas)
    {
        if (this.encendido && this.gasolina >= gas) {
            this.gasolina -= gas;
            return "Avanza.";
        } else {
            this.encendido = false;
            return "El vehículo no puede avanzar debido a falta de gasolina o porque está apagado.";
        }
    }
    public String frenar()
    {
        return "Frena.";
    }
    
    
    
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getGasolina() {
        return gasolina;
    }
    
}
