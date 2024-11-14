package co.edu.uniquindio.poo.model;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public interface IGestionar {

    public void crearVehiculo(String tipoVehiculo, Vehiculo vehiculo);
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
    String email, String direccion, String telefono);
    public void eliminarVehiculo(String matricula);
    public void eliminarCliente(String id);

    /*
     * Falta Metodo eliminarTransaccion
     * Falta Metodos Actualizar Vehiculo y Cliente
     */
}
    

