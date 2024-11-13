package co.edu.uniquindio.poo.model;

public class Administrador extends Persona implements IGestionar {
    private String telefono;
    private SistemaConcesionario sistemaConcesionario;

    public Administrador(String nombre, String id, String nombreDeUsuario, String contraseña, String palabraSecreta,
            String email, String telefono) {
        super(nombre, id, nombreDeUsuario, contraseña, palabraSecreta, email);
        this.telefono = telefono;
    }

    @Override
    public void eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : sistemaConcesionario.getVehiculos()) {
            if (vehiculo.getMatricula().equals(matricula)) {
                sistemaConcesionario.getVehiculos().remove(vehiculo);
                System.out.println("Vehículo Eliminado exitosamente");
                return;  
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

    @Override
    public void eliminarCliente(String id) {
        for (Cliente cliente : sistemaConcesionario.getClientes()) {
            if (cliente.getId().equals(id)) {
                sistemaConcesionario.getClientes().remove(cliente);
                System.out.println("Cliente Eliminado exitosamente");
                return;  
            }
        }
        System.out.println("Cliente no encontrado.");
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


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

}
