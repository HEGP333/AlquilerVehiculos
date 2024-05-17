/** 
 * @author (Heidelberg Gelvez) 
 */
public class Vehiculo{
    //atributos
    private Fecha fechaInicio;
    private Fecha fechaFinal;
    private String ubicacion;
    private String modelo;
    private int año;
    private String placa;
    private double tarifa;
    private boolean disponibilidad;
    
    //constructor
    public Vehiculo(Fecha fechaInicio, Fecha fechaFinal, String ubicacion, String modelo, int año, String placa, double tarifa, boolean disponibilidad) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.ubicacion = ubicacion;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.tarifa = tarifa;
        this.disponibilidad = disponibilidad;
    }

    //getters and setters
    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public Fecha getFechaFinal() {
        return fechaFinal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getPlaca() {
        return placa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setFechaInicio(Fecha newFechaInicio) {
        this.fechaInicio = newFechaInicio;
    }

    public void setFechaFinal(Fecha newFechaFinal) {
        this.fechaFinal = newFechaFinal;
    }

    public void setUbicacion(String newUbicacion) {
        this.ubicacion = newUbicacion;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    public void setAño(int newAño) {
        this.año = newAño;
    }

    public void setPlaca(String newPlaca) {
        this.placa = newPlaca;
    }

    public void setTarifa(double newTarifa) {
        this.tarifa = newTarifa;
    }

    public void setDisponibilidad(boolean newDisponibilidad) {
        this.disponibilidad = newDisponibilidad;
    }
    
}