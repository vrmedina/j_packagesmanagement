
package empresapaquetes;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String datosSucursal() {
        return "Numero sucursal: "+numeroSucursal+"\nDireccion: "+direccion+"\nCiudad: "+ciudad;
    }
    
    public double precioPaquete(Paquete p) {
        double precio;
        precio = p.getPeso();
        if (p.getPrioridad()==1) {
            precio += 10;
        }else if (p.getPrioridad()==2) {
            precio += 20;
        }
        return precio;
    }
    
}
