package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.view.LoginEmpleadoView;
import javafx.scene.control.Label;

public class LoginEmpleadoController {
    private SistemaConcesionario sistemaConcesionario;
    private LoginEmpleadoView view;

    public LoginEmpleadoController(SistemaConcesionario sistemaConcesionario, LoginEmpleadoView view) {
        this.sistemaConcesionario = sistemaConcesionario;
        this.view = view;
    }

    // Verificar si el empleado existe
    public boolean verificarEmpleadoCuenta(String nombreUsuario, String contraseña) {
        return sistemaConcesionario.verificarEmpleadoCuenta(nombreUsuario, contraseña);
    }

    // Lógica para manejar el ingreso
    public void handleIngresar(String nombreUsuario, String password, Label labelError) {
        if (nombreUsuario.isEmpty() || password.isEmpty()) {
            labelError.setText("Por favor, ingrese todos los datos.");
        } else {
            if (verificarEmpleadoCuenta(nombreUsuario, password)) {
                labelError.setText(""); // Limpiar mensaje de error
                view.openSecondaryEmpleado(); // Abre la ventana secundaria
            } else {
                labelError.setText("Credenciales incorrectas.");
            }
        }
    }


}

