package co.edu.uniquindio.poo.model;

public class Cliente extends Persona{
    private String direccion;
    private String telefono;
    
    public Cliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String direccion, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.direccion = direccion;
        this.telefono = telefono;
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

    
}
