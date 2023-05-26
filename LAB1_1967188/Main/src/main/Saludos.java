package main;

public class Saludos {
    
    private String sld;
    
    public Saludos(){
        
    }
    
    public Saludos(String sld){
        System.out.println(this.holaMundo(sld));
    }
    
    public String holamundo(){
        return "Hola Mundo";
    }
    
    private String holaMundo(String sld){
        return sld;
    }
}
