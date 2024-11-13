package co.edu.uniquindio.poo.view;

import java.io.IOException;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryView {

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    private Button buttonAdministrador;

    @FXML
    private Button buttonEmpleado;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == buttonAdministrador) {
            app.openLoginAdmView(); 
        } else if (event.getSource() == buttonEmpleado) {
            app.openLoginEmpleadoView(); 
        }
    }

    @FXML
    void initialize() {
        assert buttonAdministrador != null : "fx:id=\"buttonAdministrador\" was not injected: check your FXML file 'Primary.fxml'.";
        assert buttonEmpleado != null : "fx:id=\"buttonEmpleado\" was not injected: check your FXML file 'Primary.fxml'.";
    }
}
