/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

/**
 *
 * @author rachm
 */
public class Gato extends Animal {
    
    public void Maullar(){
        System.out.println("El Gato Maulla...");
    }
    
    @Override
    public String Comer(){
        return "El Gato come";
    }
    @Override
    public String Caminar(){
        return "El Gato camina";
    }
}
