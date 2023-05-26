/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import java.util.Scanner;

/**
 *
 * @author rachm
 */
public class RunPractica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo[] car = new Vehiculo[10];
        Scanner inpt = new Scanner(System.in);
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese los datos del vehículo numero:" + (i+1));
            System.out.print("Color: ");
            String color = inpt.nextLine();
            System.out.print("Marca: ");
            String marca = inpt.nextLine();
            System.out.print("Modelo: ");
            String modelo = inpt.nextLine();
            

            car[i] = new Vehiculo(color, marca, modelo);
            
        }
        System.out.flush();  
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Vehiculo: "+ car[i].getMarca());
            System.out.print(", Color: " + car[i].getColor());
            System.out.print(", Modelo: " + car[i].getModelo());
            System.out.println("");
            System.out.println("Cantidad de gasolina: ");
            int gas = inpt.nextInt();
            System.out.print("Vehiculo: " );
            car[i].encender(gas);
            System.out.println("");
            
            System.out.println("Vehiculo: " + car[i].avanzar(gas));
            System.out.println("Vehiculo: "+car[i].frenar());
        }
        
        
    }
    
}
