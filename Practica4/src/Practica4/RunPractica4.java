/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica4;

/**
 *
 * @author rachm
 */
public class RunPractica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Canario cn = new Canario();
        Gato gt = new Gato();
        Perro pr = new Perro();
        Aguila ag = new Aguila();
        
        cn.setColor("Rojo");
        System.out.println("El Canario es color "+cn.getColor());
        System.out.println(cn.Caminar()+" "+cn.Comer()+" "+cn.Volar());
        cn.Cantar();
        
        gt.setColor("Negro");
        System.out.println("El Gato es color "+gt.getColor());
        System.out.println(gt.Caminar()+" "+gt.Comer());
        gt.Maullar();
        
        
        pr.setColor("Blanco");
        System.out.println("El Perro es color "+pr.getColor());
        System.out.println(pr.Caminar()+" "+pr.Comer());
        pr.Ladrar();
        
        
        ag.setColor("Cafe");
        System.out.println("El Aguila es color "+ag.getColor());
        System.out.println(ag.Caminar()+" "+ag.Comer()+" "+ag.Volar());
        
    }
    
}
