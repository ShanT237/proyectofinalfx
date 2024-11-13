package co.edu.uniquindio.poo.model;

public interface ITransaccion {

    public void procesar(Cliente cliente, Vehiculo vehiculo, Empleado empleado);

    public String getDetalles();

    public String getTipo();

    public double getMonto();

    public Empleado getEmpleado();    
}
