package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TransaccionAlquiler implements ITransaccion {

    private String codigo;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double monto;
    private SistemaConcesionario sistema;
    
    public TransaccionAlquiler(String codigo, Cliente cliente, Empleado empleado, Vehiculo vehiculo,
            LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        monto = calcularMontoAlquiler();
    }
    
    @Override
    public void procesar(Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false); 
            this.monto = calcularMontoAlquiler(); 

            
            sistema.getRegistro().getTransacciones().add(this);

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
