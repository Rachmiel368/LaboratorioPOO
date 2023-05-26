/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

/**
 *
 * @author rachm
 */
public class Perro extends Animal {
    
    public void Ladrar(){
        System.out.println("El Perro ladra...");
    }
    
    @Override
    public String Comer(){
        return "El Perro come";
    }
    @Override
    public String Caminar(){
        return "El Perro camina";
    }
}
