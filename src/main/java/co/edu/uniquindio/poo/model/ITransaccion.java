package co.edu.uniquindio.poo.model;
/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */

public interface ITransaccion {

    /**
     * Procesa la transacción.
     *
     * @param cliente  Cliente involucrado.
     * @param vehiculo Vehículo involucrado.
     * @param empleado Empleado que procesa.
     */
    public void procesar(SistemaConcesionario sitema, Cliente cliente, Vehiculo vehiculo, Empleado empleado);

    /**
     * @return Detalles de la transacción.
     */
    public String getDetalles();

    /**
     * @return Tipo de transacción.
     */
    public String getTipo();

    /**
     * @return Monto de la transacción.
     */
    public double getMonto();

    /**
     * @return Empleado que procesó la transacción.
     */
    public Empleado getEmpleado();
}