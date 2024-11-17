package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.view.LoginAdmView;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 * La clase LoginAdmController gestiona la lógica de control para la vista de inicio de sesión
 * del administrador. Se encarga de verificar las credenciales del administrador y de interactuar
 * con el modelo y la vista correspondientes.
 */
public class LoginAdmController {

    // Sistema de concesionario asociado al controlador
    private SistemaConcesionario sistemaConcesionario;
    
    // Vista de inicio de sesión del administrador
    private LoginAdmView view;

    /**
     * Constructor de la clase LoginAdmController.
     *
     * @param sistemaConcesionario Sistema de concesionario asociado.
     * @param view Vista de inicio de sesión del administrador.
     */
    public LoginAdmController(SistemaConcesionario sistemaConcesionario, @SuppressWarnings("exports") LoginAdmView view) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.view = view;
    }

    /**
     * Verifica las credenciales del administrador.
     *
     * @param usuario Nombre de usuario del administrador.
     * @param password Contraseña del administrador.
     * @return El objeto Administrador si las credenciales son correctas, de lo contrario, null.
     */
    public Administrador verificarCredenciales(String usuario, String password) {
        if (sistemaConcesionario.verificarAdministradorCuenta(usuario, password)) {
            return sistemaConcesionario.obtenerAdministradorPorCredenciales(usuario, password);
        }
        return null;
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
     * Obtiene la vista de inicio de sesión del administrador.
     *
     * @return Vista de inicio de sesión del administrador.
     */
    @SuppressWarnings("exports")
    public LoginAdmView getView() {
        return view;
    }

    /**
     * Establece la vista de inicio de sesión del administrador.
     *
     * @param view Vista de inicio de sesión del administrador.
     */
    public void setView(@SuppressWarnings("exports") LoginAdmView view) {
        this.view = view;
    }
}