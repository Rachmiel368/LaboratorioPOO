/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

/**
 *
 * @author rachm
 */
public class Canario extends Animal implements Volar{
    
    public void Cantar(){
        System.out.println("El Canario Canta...");
    }
    @Override
    public String Comer(){
        return "El Canario come";
    }
    @Override
    public String Caminar(){
        return "El Canario camina";
    }
    @Override
    public String Volar(){
        return "El Canario vuela";
    }
}
