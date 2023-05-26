/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

import java.util.Scanner;
/**
 *
 * @author rachm
 */
public class RunPractica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funciones fn = new Funciones();
        Scanner inpt = new Scanner(System.in);
        String cad= inpt.nextLine();
        String cadena;
        String valor;
        
        
        System.out.println("Hay "+fn.getVocales(cad)+" Vocales.");
        
        System.out.println("Hay "+fn.contarMayusculas(cad)+" Mayusculas.");
        System.out.println("Hay "+fn.contarMinusculas(cad)+" Minusculas.");
        
        fn.reverseStr(cad);
        
        
        System.out.println("");
        
        System.out.println("Ingresa una cadena");
        cadena=inpt.nextLine();
        System.out.println("Ingresa un valor a encontrar en la cadena: ");
        valor=inpt.nextLine();
        System.out.println("El valor "+valor+" Se encontro "+fn.incidenciaStr(cadena, valor)+" veces en la cadena ingresada.");
        
        
        System.out.println("Ingresa una cadena");
        cadena=inpt.nextLine();
        System.out.println("Ingresa un valor a encontrar en la cadena: ");
        valor=inpt.nextLine();
        fn.dividirStr(cadena, valor);
        
        
        System.out.println("");
        
        System.out.println("Ingresa una cadena");
        cadena=inpt.nextLine();
        System.out.println("Ingresa un valor a reemplazar en la cadena: ");
        valor=inpt.nextLine();
        System.out.println("Ingresa el valor que lo va a reemplazar: ");
        String valor2=inpt.nextLine();
        String resultado = fn.reemplazarValorEnCadena(cadena, valor, valor2);
        System.out.println("El valor '" + valor + "' se ha reemplazado por '" + valor2 + "' en la cadena:");
        System.out.println(resultado);
        
    }
    
}
