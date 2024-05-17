/** 
 * @author (Heidelberg Gelvez) 
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    
    //constructor
    public Cliente (){
    }
    
    public Cliente (String nombre, String direccion, String telefono, String correo){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    //getters and  setters
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setNombre (String newNombre){
        this.nombre = newNombre;
    }
    
    public void setDireccion (String newDireccion){
        this.direccion = newDireccion;
    }
    
    public void setTelefono (String newTelefono){
        this.telefono = newTelefono;
    }
    
    public void setCorreo (String newCorreo){
        this.correo = newCorreo;
    }
    
    //metodos
    public void buscarVehiculo(){
        
    }
    
    public void reservarVehiculo(){
        
    }
    
    public void CancelarReserva(){
        
    }
    
}