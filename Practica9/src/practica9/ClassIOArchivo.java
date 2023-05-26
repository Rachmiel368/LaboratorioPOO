/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author rachm
 */
public class ClassIOArchivo {
            
    public ClassIOArchivo(String fname){
        
        this.FileWriter(fname);
    }
    
    private void FileWriter(String fname) {
        
        File fl = new File(fname);
        FileWriter fw;
        
        try{ 
            fw = new FileWriter(fl);
            fw.write("Welcome to javaTpoint.");                
            fw.close();
        }
        
        catch(IOException ex){
            System.out.println(ex.toString());
        }
        
        finally{
            System.out.println("Aqui puden poner Metodos para cerrar el archivo");
        }
    }
}
