package Transporte;

public abstract class TransMaritimo {

    private String matricula;
    private int numPasaje;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPasaje() {
        return numPasaje;
    }

    public void setNumPasaje(int numPasaje) {
        this.numPasaje = numPasaje;
    }
    
    public String avanzar(){
        return "Maritimo Avanzando";
    }
    
    
    /*Toda clase abstracta debe de tener un metodo abstracto*/
    public abstract String encender();
    
}
