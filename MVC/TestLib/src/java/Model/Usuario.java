/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rachm
 */
public class Usuario {
    private String fname; 
    private String lname;
    private String color;
    private String IDUsuario;

    
    public String getFname() {
        return fname;
    }

    
    public void setFname(String fname) {
        this.fname = fname;
    }

    
    public String getLname() {
        return lname;
    }

    
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getID() {
        return IDUsuario;
    }

    
    public void setID(String IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

}
