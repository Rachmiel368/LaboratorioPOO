package Transporte;

public class Barco extends TransMaritimo{

    private String color;
    
    @Override
    public String encender() {
        return "esta Encendido";
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
