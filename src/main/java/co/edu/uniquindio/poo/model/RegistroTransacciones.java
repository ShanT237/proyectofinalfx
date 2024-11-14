package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class RegistroTransacciones {
    private LocalDate fecha;
    private LinkedList<ITransaccion> transacciones;
    
    /*
     * Metodo constructor
     */
    public RegistroTransacciones(LocalDate fecha) {
        this.fecha = fecha;
        transacciones = new LinkedList<>();

    }

    /*
     * Metodos principales
     */

    public void registrarTransaccion(ITransaccion transaccion){
        if(verificarTransaccion(transaccion)){
            System.out.println("No se puede registrar la transaccion");

        } else{
            transacciones.add(transaccion);
            System.out.println("La transacción fue registrada de forma exitosa");
        }

    }

    public boolean verificarTransaccion(ITransaccion transaccion ){
        boolean sentinela = false;
        for (ITransaccion iTransaccion : transacciones) {
            if(iTransaccion.getDetalles().equals(transaccion.getDetalles())){
                sentinela = true;
                break;
            }
            
        } return sentinela;

    }

    /*
     * Metodos Get  y Set
     */

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LinkedList<ITransaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<ITransaccion> transacciones) {
        this.transacciones = transacciones;
    }

}
