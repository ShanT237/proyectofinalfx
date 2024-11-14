package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.ITransaccion;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SecondaryEmpleadoController {

    private Empleado empleado;
    private SistemaConcesionario sistema;

    private List<ITransaccion> transacciones;

    public SecondaryEmpleadoController(SistemaConcesionario sistema, Empleado empleado) {
        this.transacciones = new ArrayList<>();
        this.sistema = sistema;
        this.empleado = empleado;
    }

    // Método para asignar el empleado al controlador
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ObservableList<ITransaccion> obtenerTransacciones() {
        if (empleado != null) {
            System.out.println("Transacciones del empleado: " + empleado.getTransacciones());
            return FXCollections.observableArrayList(empleado.getTransacciones());
        }
        return FXCollections.observableArrayList();
    }

    // Método para contar el número de transacciones
    public int obtenerNumeroTransacciones() {
        return empleado != null ? empleado.getTransacciones().size() : 0;
    }

    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(sistema.getClientes());
    }

    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String direccion, String telefono) {
        empleado.crearCliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion, telefono);
    }
    public boolean actualizarClientePorID(String id, Cliente nuevosDatos) {
        for (Cliente c : sistema.getClientes()) {
            if (c.getId().equals(id)) {
                // Actualiza los datos del cliente
                c.setNombre(nuevosDatos.getNombre());
                c.setDireccion(nuevosDatos.getDireccion());
                c.setEmail(nuevosDatos.getEmail());
                c.setTelefono(nuevosDatos.getTelefono());
                c.setPalabraSecreta(nuevosDatos.getPalabraSecreta());
                c.setContraseña(nuevosDatos.getContraseña());
                c.setNombreDeUsuario(nuevosDatos.getNombreDeUsuario());

    
                // Imprime mensaje de éxito
                System.out.println("Cliente con ID " + id + " actualizado exitosamente.");
    
    
                return true;
            }
        }
        // Si el cliente con el ID no se encuentra
        System.out.println("Cliente con ID " + id + " no encontrado.");
        return false;
    }

    public void eliminarCliente(String id) {
        empleado.eliminarCliente(id);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        empleado.eliminarVehiculo(vehiculo.getMatricula());
    }

    public ObservableList<Vehiculo> obtenerVehiculosRegistrados() {
        return FXCollections.observableArrayList(sistema.getVehiculos());
    }

    public void registrarVehiculoDesdeEspera(Vehiculo vehiculo) {
        sistema.agregarVehiculo(vehiculo);
    }
    
}
