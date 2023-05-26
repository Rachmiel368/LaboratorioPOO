package main;

import Transporte.Automovil;
import Transporte.Avion;
import Transporte.Barco;

public class RunMain {

    public static void main(String[] args) {
        
        Automovil au = new Automovil();
        au.setColor("Rojo");
        System.out.println("El Auto color: " + au.getColor() + " " + au.avanzar());
        System.out.println(au.frenar());
        
        
        /*ASI COMO HICIMOS EN LA LINEA 13, TNEMOS QUE UTILIZAR TODAS LAS
        PROPIEDADES PARA --AVION-- Y --BARCO--*/
        Avion av = new Avion();
        System.out.println(av.encender());
        System.out.println(av.avanzar());
        
        
        Barco ba = new Barco();
        ba.setColor("Blanco");
        System.out.println("El barco color " + ba.getColor() + " " + ba.encender());
    }
    
}

/*TAMBIEN HACER UN DIAGRAMA DE COMO SE VA HEREDANDO LAS CLASES PADRES A LAS
CLASES HIJO, ESTO SE SUBE JUNTO CON EL PROGRAMA*/

/*TAMBIER SUBIR SS DE COMO CORRE EL CODIGO*/