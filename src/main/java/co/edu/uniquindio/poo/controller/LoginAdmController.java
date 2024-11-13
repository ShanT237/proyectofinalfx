package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.view.LoginAdmView;

public class LoginAdmController {
    
    private SistemaConcesionario sistemaConcesionario;
    private LoginAdmView view;

    public LoginAdmController(SistemaConcesionario sistemaConcesionario, LoginAdmView view) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.view = view;
    }

    // Devuelve el objeto Administrador autenticado, o null si las credenciales son incorrectas
    public Administrador verificarCredenciales(String usuario, String password) {
        if (sistemaConcesionario.verificarAdministradorCuenta(usuario, password)) {
            return sistemaConcesionario.obtenerAdministradorPorCredenciales(usuario, password); // Supongamos que este método obtiene el administrador
        }
        return null;
    }
}