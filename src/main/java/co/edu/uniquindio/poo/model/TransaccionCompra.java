package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TransaccionCompra implements ITransaccion {
    private String codigo;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaCompra;
    private double monto;
    private SistemaConcesionario sistema;

    
    public TransaccionCompra(String codigo, Cliente cliente, Empleado empleado, Vehiculo vehiculo,
            LocalDate fechaCompra, double monto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.fechaCompra = fechaCompra;
        this.monto = calcularMontoCompra();
    }
    @Override 
    public void procesar(Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        if (vehiculo.pasaRevisionTecnica()) { 
            vehiculo.setDisponible(true); 
            this.monto = calcularMontoCompra(); 

            
            sistema.getRegistro().getTransacciones().add(this);

            System.out.println("Transacción de compra procesada exitosamente para el vehículo: " 
                               + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no pasó la revisión técnica y no se puede comprar.");
        }
    }

    public String getDetalles(){
        return codigo;
    }

    public String getTipo(){
        return getClass().getSimpleName();
    }


    private double calcularMontoCompra() {
        
        return 20000.0; 
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


    public LocalDate getFechaCompra() {
        return fechaCompra;
    }


    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public double getMonto() {
        return monto;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    
    
}
