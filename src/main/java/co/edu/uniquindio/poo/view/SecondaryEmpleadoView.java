package co.edu.uniquindio.poo.view;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.ITransaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;



public class SecondaryEmpleadoView {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    /*
     * No Modificar
     * Panel 1: Gestionar Clientes
     */
    @FXML
    private Pane gestionarClientesPane;
    @FXML
    private Button ClientesPaneActualizarButton;
    @FXML
    private Button ClientesPaneEliminarButton;
    @FXML
    private Button ClientesPaneLimpiarCamposButton;
    @FXML
    private Button ClientesPaneRegistrarClienteButton;
    @FXML
    private TextField ClientesPaneDireccionField;
    @FXML
    private TextField ClientesPaneEmailField;
    @FXML
    private TextField ClientesPaneIDField;
    @FXML
    private TextField ClientesPaneNombreField;
    @FXML
    private TextField ClientesPanePasswordField;
    @FXML
    private TextField ClientesPaneSecretWordField;
    @FXML
    private TextField ClientesPaneTelField;
    @FXML
    private TextField ClientesPaneUserNameField;
    @FXML
    private TableView<Cliente> paneClientesTablaCRegitrados;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosID;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosNombre;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosDireccion;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosEmail;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosTelefono;

    /*
     * No Modificar
     * Panel 2: Gestionar Vehiculos
     */
    @FXML
    private Pane gestionarVehiculosPane;
    @FXML
    private Button gestionarVehiculosEliminarButton;
    @FXML
    private Button gestionarVehiculosRegistrarVehiculoButton;
    @FXML
    private Label gestionarVehiculosLabelMatricula;
    @FXML
    private TableView<Vehiculo> gestionarVehiculosTablaDeEspera;
    @FXML
    private TableColumn<Vehiculo, Boolean> tablaDeEsperaEstado;
    @FXML
    private TableColumn<Vehiculo, String> tablaDeEsperaMatricula;
    @FXML
    private TableColumn<Vehiculo, String> tablaDeEsperaModelo;
    @FXML
    private TableColumn<Vehiculo, String> tablaDeEsperaTipo;

    @FXML
    private TableView<Vehiculo> gestionarVehiculosTablaRegistro;
    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroMatricula;
    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroModelo;
    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroTipo;

    /*
     * No Modificar
     * Panel 3: Gestionar Transacciones
     */
    @FXML
    private Pane gestionarTransaccionesPane;
    @FXML
    private TableView<Cliente> tablaTransaccionCliente;
    @FXML
    private TableColumn<Cliente, String> idClienteTransaccionColumna;
    @FXML
    private TableColumn<Cliente, String> nombreClienteTransaccionColumna;

    @FXML
    private TableView<Vehiculo> tablaTransaccionVehiculo;
    @FXML
    private TableColumn<Vehiculo, String> matriculaVehiculoTransaccionColumna;
    @FXML
    private TableColumn<Vehiculo, String> modeloVehiculoTransaccionColumna;
    @FXML
    private TableColumn<Vehiculo, Boolean> disponibleVehiculoTransaccionColumna;
    @FXML
    private TableColumn<Vehiculo, String> tipoVehiculoTransaccionColumna;
    
    @FXML
    private TableView<ITransaccion> tablaTransacciones;
    @FXML
    private TableColumn<Cliente, String> transaccionesColumnaCliente;
    @FXML
    private TableColumn<Vehiculo, String> transaccionesColumnaVehiculo;
    @FXML
    private TableColumn<ITransaccion, String> transaccionesColumnaCodigo;
    @FXML
    private TableColumn<Empleado, String> transaccionesColumnaEmpleado;

    @FXML
    private Label TransaccionLabelMatricula;
    @FXML
    private Label transaccionLabelID;
    @FXML
    private Button transaccionActualizarButton;
    @FXML
    private Button transaccionEliminarButton;
    @FXML
    private Button transaccionProcesarButton;
    @FXML
    private TextField transaccionCodigoField;
    @FXML
    private ChoiceBox<?> transaccionChoiceBox;

    /*
     * No Modificar
     * Panel 4: Transacciones que ha hecho el Empleado
     */
    @FXML
    private Pane registroPane;
    @FXML
    private Label registroPaneNumeroTransaccionesLabel;
    @FXML
    private Button registroPaneVolverButton;
    @FXML
    private TableView<ITransaccion> registroPaneTablaTransacciones;
    @FXML
    private TableColumn<ITransaccion, String> tablaTransaccionesEmpleadoTipo;
    @FXML
    private TableColumn<Cliente, String> tablaTransaccionesEmpleadoCliente;
    @FXML
    private TableColumn<Cliente, String> tablaTransaccionesEmpleadoMatricula;
   

    /*
     * No Modificar
     * Principal: Botones de Navegacion y Label
     */
    @FXML
    private Button gestionarClientesButton;
    @FXML
    private Button gestionarVehiculosButton;
    @FXML
    private Button verRegistroButton;
    @FXML
    private Button gestionarTransaccionesButton;

    @FXML
    private void initialize() {
        // Mostrar el primer panel por defecto
        gestionarClientesPane.setVisible(true);
        gestionarVehiculosPane.setVisible(false);
        gestionarTransaccionesPane.setVisible(false);
        registroPane.setVisible(false);

        gestionarClientesButton.setOnAction(e -> showPanel(gestionarClientesPane));
        gestionarVehiculosButton.setOnAction(e -> showPanel(gestionarVehiculosPane));
        gestionarTransaccionesButton.setOnAction(e -> showPanel(gestionarTransaccionesPane));
        verRegistroButton.setOnAction(e -> showPanel(registroPane));
    }

    // Método que cambia la visibilidad del panel según el botón presionado
    private void showPanel(Pane pane) {
        // Ocultar todos los panes
        gestionarClientesPane.setVisible(false);
        gestionarVehiculosPane.setVisible(false);
        gestionarTransaccionesPane.setVisible(false);
        registroPane.setVisible(false);

        // Mostrar el panel correspondiente
        pane.setVisible(true);
    }

}
