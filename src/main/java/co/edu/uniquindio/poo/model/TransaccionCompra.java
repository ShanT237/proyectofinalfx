package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class TransaccionCompra implements ITransaccion {
    private String codigo;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private LocalDate fechaCompra;
    private double monto;
    private SistemaConcesionario sistema;

    
    public TransaccionCompra(String codigo) {
        this.codigo = codigo;
        this.monto = calcularMontoCompra();
    }
    @Override 
    public void procesar(SistemaConcesionario sistema, Cliente cliente, Vehiculo vehiculo, Empleado empleado) {
        setSistema(sistema);
        if (vehiculo.pasaRevisionTecnica()) { 
            setCliente(cliente);
            setEmpleado(empleado);
            setVehiculo(vehiculo);
            setFechaCompra(LocalDate.now());
            vehiculo.setDisponible(false); 
            this.monto = calcularMontoCompra(); 

            cliente.vehiculoAdquirido(vehiculo);
            sistema.getRegistro().registrarTransaccion(this);
            empleado.getTransacciones().add(this);

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
    public SistemaConcesionario getSistema() {
        return sistema;
    }
    public void setSistema(SistemaConcesionario sistema) {
        this.sistema = sistema;
    }

    
    
    
}
