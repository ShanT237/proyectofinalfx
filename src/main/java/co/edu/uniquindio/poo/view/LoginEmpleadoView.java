package co.edu.uniquindio.poo.view;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginEmpleadoController;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginEmpleadoView {
    
    /*
     * Atributos de la clase
     */
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
    private PasswordField fieldPassword;

    @FXML
    private Label labelError;

    public void setApp(App app) {
        this.app = app;
        this.sistemaConcesionario = app.getSistemaConcesionario();
        this.controller = new LoginEmpleadoController(this.sistemaConcesionario, this);

        labelError.setVisible(false);
    }
    
    /*
     * Metodo que maneja las acciones del boton ingresar
     */
    @FXML
    void handleIngresar(ActionEvent event) {
        String nombreUsuario = fieldNombreUsuario.getText();
        String password = fieldPassword.getText();

        labelError.setVisible(false);

        if (nombreUsuario.isEmpty() || password.isEmpty()) {
            labelError.setText("Por favor, ingrese todos los datos.");
            labelError.setVisible(true);
        } else {
            Empleado empleado = sistemaConcesionario.obtenerEmpleadoPorCredenciales(nombreUsuario, password);
            if (empleado != null) {
                app.setEmpleadoAutenticado(empleado);
                openSecondaryEmpleado();
            } else {
                labelError.setText("Empleado no encontrado.");
                labelError.setVisible(true);
            }
        }
    }

    public void openSecondaryEmpleado() {
        app.openSecondaryEmpleadoView();
    }
}
