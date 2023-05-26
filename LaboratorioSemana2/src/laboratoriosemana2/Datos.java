/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriosemana2;
/**
 *
 * @author rachm
 */
public class Datos {
    private String nom;
    
    public Datos()
    {
        
    }
    public Datos(double m, double e, double cn, double cs)
    { 
        double p = this.calPro(m, e, cn, cs);
        if(p<=7)
            System.out.println("El promedio: " + Double.toString(p));
        else
            System.out.println("No aprobó");
    }
    public Datos(String nom, double m, double e, double cn, double cs)
    {
        this.nom = nom;
        double p = this.calPro(m, e, cn, cs);
        
        if(p<=7)
            System.out.println("El promedio: "+ this.nom + " " + Double.toString(p));
        else
            System.out.println("No aprobó");
    }
    
    private double calPro(double m, double e, double cn, double cs)
    {
        return (m+e+cn+cs)/4;
    }
    public String getName()
    {
        return this.nom;
    }
}