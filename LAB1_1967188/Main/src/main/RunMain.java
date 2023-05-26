package main;

import java.util.Scanner;

public class RunMain {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1) Saludar 2) Modificar Saludo");
        int opc;
        opc = entrada.nextInt();
        
        Saludos sld = new Saludos();
        if(opc==1)
        {
                System.out.println(sld.holamundo());
        
                Saludos sld2 = new Saludos("Buenas Tardes");
        }
        else if(opc==2)
        {
                String nuevosaludo;
                System.out.println("Ingresa Nuevo Saludo : ");
                nuevosaludo = entrada.next();
                System.out.println(sld.holamundo());
        
                Saludos sld3 = new Saludos(nuevosaludo);
        }
        
    }
    
}
