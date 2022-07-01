
package empresapaquetes;

public class Paquete {
    private int numeroPaquete;
    private int cedula;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, int cedula, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.cedula = cedula;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public int getCedula() {
        return cedula;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
   
    public String datosPaquete() {
        return "Numero paquete: "+numeroPaquete+"\nCedula: "+cedula+"\nPeso: "+peso+"\nPrioridad: "+prioridad;
    }
}
