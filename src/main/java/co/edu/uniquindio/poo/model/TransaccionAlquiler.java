package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class TransaccionAlquiler implements ITransaccion {

    private String codigo;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double monto;
    private int dias;
    private SistemaConcesionario sistema;
    
    public TransaccionAlquiler(String codigo, int dias) {
        this.codigo = codigo;
        monto = calcularMontoAlquiler();
    }
    
    @Override
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.isDisponible()) {
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaAlquiler(LocalDate.now());
            setFechaAlquiler(LocalDate.now().plusDays(dias));
            vehiculo.setDisponible(false); 
            this.monto = calcularMontoAlquiler(); 


            sistema.getRegistro().registrarTransaccion(this);
            empleado.getTransacciones().add(this);

            System.out.println("Transacción de alquiler procesada exitosamente para el vehículo: " 
                               + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
    }

    private double calcularMontoAlquiler() {
        return 100.0; 
    }


    public String getDetalles(){
        return codigo;
    }

    public String getTipo(){
        return getClass().getSimpleName();
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public SistemaConcesionario getSistema() {
        return sistema;
    }

    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    
}
