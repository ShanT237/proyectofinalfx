package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Empleado extends Persona implements IGestionar {
    private SistemaConcesionario sistemaConcesionario;
    private String puesto;
    private String telefono;
    private LinkedList<ITransaccion> transacciones;

    public Empleado(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String puesto, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.puesto = puesto;
        this.telefono = telefono;
        transacciones = new LinkedList<>();
    }

    @Override
    public void crearCliente(String nombre, String id, String nombreDeUsuario, String contraseña,
            String palabraSecreta, String email, String direccion, String telefono) {

        Cliente nuevoCliente = new Cliente(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email, direccion,
                telefono);

        sistemaConcesionario.agregarCliente(nuevoCliente);
        System.out.println("Cliente creado exitosamente.");
    }
    @Override
    public void crearVehiculo(String tipoVehiculo, Vehiculo vehiculo) {

        sistemaConcesionario.getVehiculos().add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getClass().getSimpleName() + " creado exitosamente");
    }



    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<ITransaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<ITransaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }


}
