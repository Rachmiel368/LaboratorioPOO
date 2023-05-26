/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

/**
 *
 * @author rachm
 */
public class Aguila extends Animal implements Volar{
    
    
    
    @Override
    public String Comer(){
        return "El Aguila come";
    }
    @Override
    public String Caminar(){
        return "El Aguila camina";
    }
    @Override
    public String Volar(){
        return "El Aguila vuela";
    }
}
