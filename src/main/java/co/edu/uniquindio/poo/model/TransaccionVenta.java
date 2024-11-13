package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class TransaccionVenta implements ITransaccion {

    private String codigo;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaVenta;
    private double monto;
    private SistemaConcesionario sistema;

    public TransaccionVenta(String codigo, Cliente cliente, Empleado empleado, Vehiculo vehiculo, LocalDate fechaVenta,
            double monto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.fechaVenta = fechaVenta;
        monto = calcularMontoVenta();
    }
    @Override
    public void procesar(Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
            this.monto = calcularMontoVenta();

            sistema.getRegistro().getTransacciones().add(this);

            System.out.println("Transacción de venta procesada exitosamente para el vehículo: "
                    + vehiculo.getMarca() + " (" + vehiculo.getModelo() + ")");
        } else {
            System.out.println("El vehículo no está disponible para la venta.");
        }
    }
    
    @Override
    public String getDetalles() {
        return codigo;
    }
    
    @Override
    public String getTipo() {
        return getClass().getSimpleName();
    }

    private double calcularMontoVenta() {

        return 25000.0;
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

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
