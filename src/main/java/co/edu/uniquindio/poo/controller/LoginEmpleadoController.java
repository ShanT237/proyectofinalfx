package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.view.LoginEmpleadoView;
import javafx.scene.control.Label;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 * La clase LoginEmpleadoController gestiona la lógica de control para la vista de inicio de sesión
 * de los empleados. Se encarga de verificar las credenciales de los empleados y de interactuar
 * con el modelo y la vista correspondientes.
 */
public class LoginEmpleadoController {

    // Sistema de concesionario asociado al controlador
    private SistemaConcesionario sistemaConcesionario;
    
    // Vista de inicio de sesión del empleado
    private LoginEmpleadoView view;

    /**
     * Constructor de la clase LoginEmpleadoController.
     *
     * @param sistemaConcesionario Sistema de concesionario asociado.
     * @param view Vista de inicio de sesión del empleado.
     */
    public LoginEmpleadoController(SistemaConcesionario sistemaConcesionario, @SuppressWarnings("exports") LoginEmpleadoView view) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.view = view;
    }

    /**
     * Verifica las credenciales del empleado.
     *
     * @param nombreUsuario Nombre de usuario del empleado.
     * @param contraseña Contraseña del empleado.
     * @return true si las credenciales son correctas, de lo contrario, false.
     */
    public boolean verificarEmpleadoCuenta(String nombreUsuario, String contraseña) {
        return sistemaConcesionario.verificarEmpleadoCuenta(nombreUsuario, contraseña);
    }

    /**
     * Maneja el evento de ingreso del empleado.
     * Verifica si los campos de usuario y contraseña están completos y si las credenciales son correctas.
     * Si son correctas, abre la vista secundaria del empleado; de lo contrario, muestra un mensaje de error.
     *
     * @param nombreUsuario Nombre de usuario del empleado.
     * @param password Contraseña del empleado.
     * @param labelError Etiqueta para mostrar mensajes de error.
     */
    public void handleIngresar(String nombreUsuario, String password, @SuppressWarnings("exports") Label labelError) {
        if (nombreUsuario.isEmpty() || password.isEmpty()) {
            labelError.setText("Por favor, ingrese todos los datos.");
        } else {
            if (verificarEmpleadoCuenta(nombreUsuario, password)) {
                labelError.setText("");
                view.openSecondaryEmpleado();
            } else {
                labelError.setText("Credenciales incorrectas.");
            }
        }
    }

    /**
     * Obtiene el sistema de concesionario asociado al controlador.
     *
     * @return Sistema de concesionario.
     */
    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    /**
     * Establece el sistema de concesionario asociado al controlador.
     *
     * @param sistemaConcesionario Sistema de concesionario.
     */
    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    /**
     * Obtiene la vista de inicio de sesión del empleado.
     *
     * @return Vista de inicio de sesión del empleado.
     */
    @SuppressWarnings("exports")
    public LoginEmpleadoView getView() {
        return view;
    }

    /**
     * Establece la vista de inicio de sesión del empleado.
     *
     * @param view Vista de inicio de sesión del empleado.
     */
    public void setView(@SuppressWarnings("exports") LoginEmpleadoView view) {
        this.view = view;
    }
}