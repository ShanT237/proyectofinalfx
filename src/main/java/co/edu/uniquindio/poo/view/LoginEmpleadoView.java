package co.edu.uniquindio.poo.view;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginEmpleadoController;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginEmpleadoView {

    private App app;
    private LoginEmpleadoController controller;
    private SistemaConcesionario sistemaConcesionario;

    public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
        this.sistemaConcesionario = sistemaConcesionario;
    }

    @FXML
    private Button buttonIngresar;

    @FXML
    private TextField fieldNombreUsuario;

    @FXML
    private TextField fieldPassword;

    @FXML
    private Label labelError;

    public void setApp(App app) {
        this.app = app;
        this.sistemaConcesionario = app.getSistemaConcesionario(); // Asegúrate de obtener el sistemaConcesionario aquí
        this.controller = new LoginEmpleadoController(this.sistemaConcesionario, this);

        // Oculta el label de error al inicio
        labelError.setVisible(false);
    }

@FXML
void handleIngresar(ActionEvent event) {
    String nombreUsuario = fieldNombreUsuario.getText();
    String password = fieldPassword.getText();

    // Ocultar el mensaje de error antes de validar
    labelError.setVisible(false);

    if (nombreUsuario.isEmpty() || password.isEmpty()) {
        labelError.setText("Por favor, ingrese todos los datos.");
        labelError.setVisible(true); // Muestra el mensaje de error
    } else {
        Empleado empleado = sistemaConcesionario.obtenerEmpleadoPorCredenciales(nombreUsuario, password);
        if (empleado != null) {
            app.setEmpleadoAutenticado(empleado);  // Guarda el empleado en la variable de App
            openSecondaryEmpleado(); // Abre la vista secundaria
        } else {
            labelError.setText("Empleado no encontrado.");
            labelError.setVisible(true); // Muestra el mensaje de error
        }
    }
}

    public void openSecondaryEmpleado() {
        app.openSecondaryEmpleadoView(); // Abrir la vista secundaria
    }
}
