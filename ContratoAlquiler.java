/** 
 * @author (Heidelberg Gelvez) 
 */
public class ContratoAlquiler{
    //atributos
    private Cliente cliente;
    private Estado estado;
    private Vehiculo vehiculo;
    private double costoTotal;
    
    //constructor
    public ContratoAlquiler(){
    }
    
    public ContratoAlquiler(Estado estado, Vehiculo vehiculo, double costoTotal, Cliente cliente) {
        this.estado = estado;
        this.vehiculo = vehiculo;
        this.costoTotal = costoTotal;
        this.cliente = cliente;
    }
    
    //getters and setters
    
    public Estado getEstado() {
        return estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setEstado(Estado newEstado) {
        this.estado = newEstado;
    }

    public void setVehiculo(Vehiculo newVehiculo) {
        this.vehiculo = newVehiculo;
    }

    public void setCostoTotal(double newCostoTotal) {
        this.costoTotal = newCostoTotal;
    }
    
    public void setCliente(Cliente newCliente) {
        this.cliente = newCliente;
    }
    
}