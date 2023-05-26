package Transporte;

public class TransAero {

    private String matricula;
    private int numPasaje;
    
    public String avanzar(){
        return "Aero Avanzando";
    }
    
    public String volar(){
        return "Aero Volando";
    }
    
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
    
}
