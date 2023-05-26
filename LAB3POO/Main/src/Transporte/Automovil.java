package Transporte;

public class Automovil implements TransTerrestre{

    private String color;
    
    @Override
    public String avanzar() {
        return "Automovil Avanzando";
    }

    @Override
    public String frenar() {
        return "Automovil Frenando";
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
