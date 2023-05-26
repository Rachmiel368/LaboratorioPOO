/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica3;
import Transporte.Automovil;
import Transporte.Avion;
import Transporte.Barco;

/**
 *
 * @author rachm
 */
public class RunPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil au = new Automovil();
        au.setColor("rojo");
        System.out.println("El auto color: "+ au.getColor()+" "+ au.avanzar());
        System.out.println(au.frenar());
        
        Avion av = new Avion();
        au.setColor("");
        System.out.println(av.encender());
        System.out.println(av.avanzar());
        
        Barco ba = new Barco();
        ba.setColor("Blanco");
        System.out.println("El barco color " + ba.getColor() + " " + ba.encender());
        
        
    }
    
}
