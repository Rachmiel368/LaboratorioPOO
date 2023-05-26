package Transporte;

public class Avion extends TransAero {

    private String color;
    
    public String encender(){
        return "Avion Encendido";
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
