/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author rachm
 */
public class Corredor extends Persona{

    public Corredor(String nom){
        super(nom);
    }
    
    @Override
    public int correr() {
        return 15;
    }
    
}
