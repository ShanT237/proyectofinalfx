package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente extends Persona{
    private String direccion;
    private String telefono;
    private LinkedList<Vehiculo> vehiculosPertenecientes;
    
    public Cliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String direccion, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.direccion = direccion;
        this.telefono = telefono;
        vehiculosPertenecientes = new LinkedList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Vehiculo> getVehiculosPertenecientes() {
        return vehiculosPertenecientes;
    }

    public void setVehiculosPertenecientes(LinkedList<Vehiculo> vehiculosPertenecientes) {
        this.vehiculosPertenecientes = vehiculosPertenecientes;
    }

    
}
