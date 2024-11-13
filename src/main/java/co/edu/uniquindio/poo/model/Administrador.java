package co.edu.uniquindio.poo.model;

public class Administrador extends Persona {
    private String telefono;

    public Administrador(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
