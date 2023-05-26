/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;
import Personas.Persona;
import Personas.Alumno;
import Personas.Corredor;
import Personas.Programador;
import java.util.ArrayList;

/**
 *
 * @author rachm
 */
public class RunPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno al= new Alumno("Pedro Paramo");
        Corredor cr= new Corredor("Ernesto Canto");
        Programador pr= new Programador("Juan Perez");
        Persona pa = new Alumno("Jorge");
        
        pa.correr();
        
        System.out.println(al.correr());
        System.out.println(cr.correr());
        System.out.println(pr.correr());
        
        ArrayList<Persona> alp = new ArrayList<Persona>();
        alp.add(al);
        alp.add(cr);
        alp.add(pr);
        alp.add(pa);
        
        int a = 0;
        for (Persona e: alp) {
            a=a+e.correr();
            System.out.println(e.getNom()+e.correr());
            
            
        }
        System.out.println(a/alp.size());
        
        
    }
    
}
