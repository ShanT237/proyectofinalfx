package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class Reporte {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Empleado empleado;
    private LinkedList<ITransaccion> transacciones;
    private String codigo;

    private int totalVentas;
    private int totalAlquileres;
    private int totalCompras;
    private double montoTotal;

    public Reporte(String codigo,
    LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleado = empleado;
        transacciones = new LinkedList<>();
  
    }

    public void agregarTransaccion(ITransaccion transaccionParam) {
        transacciones.add(transaccionParam);
        actualizarTotales(transaccionParam);
    }

    private void actualizarTotales(ITransaccion transaccion) {
        switch (transaccion.getTipo()) {
            case "TransaccionVenta":
                totalVentas++;
                break;
            case "TransaccionAlquiler":
                totalAlquileres++;
                break;
            case "TransaccionCompra":
                totalCompras++;
                break;
        }
        montoTotal += transaccion.getMonto();
    }

    public String generarResumen() {
        return "Resumen del Reporte:\n" +
               "Total Ventas: " + totalVentas + "\n" +
               "Total Alquileres: " + totalAlquileres + "\n" +
               "Total Compras: " + totalCompras + "\n" +
               "Monto Total: $" + montoTotal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LinkedList<ITransaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<ITransaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

}
