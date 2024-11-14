package co.edu.uniquindio.poo.view;


import java.net.URL;
import java.util.ResourceBundle;

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

    @FXML
    private Button ClientesPaneActualizarButton;

    @FXML
    private TextField ClientesPaneDireccionField;

    @FXML
    private Button ClientesPaneEliminarButton;

    @FXML
    private TextField ClientesPaneEmailField;

    @FXML
    private TextField ClientesPaneIDField;

    @FXML
    private Button ClientesPaneLimpiarCamposButton;

    @FXML
    private TextField ClientesPaneNombreField;

    @FXML
    private TextField ClientesPanePasswordField;

    @FXML
    private Button ClientesPaneRegistrarClienteButton;

    @FXML
    private TextField ClientesPaneSecretWordField;

    @FXML
    private TextField ClientesPaneTelField;

    @FXML
    private TextField ClientesPaneUserNameField;

    @FXML
    private Label TransaccionLabelMatricula;

    @FXML
    private TableColumn<Vehiculo, Boolean> disponibleVehiculoTransaccionColumna;

    @FXML
    private Button gestionarClientesButton;

    @FXML
    private Pane gestionarClientesPane;

    @FXML
    private Button gestionarTransaccionesButton;

    @FXML
    private Pane gestionarTransaccionesPane;

    @FXML
    private Button gestionarVehiculosButton;

    @FXML
    private Button gestionarVehiculosEliminarButton;

    @FXML
    private Label gestionarVehiculosLabelMatricula;

    @FXML
    private Pane gestionarVehiculosPane;

    @FXML
    private Button gestionarVehiculosRegistrarVehiculoButton;

    @FXML
    private TableView<?> gestionarVehiculosTablaDeEspera;

    @FXML
    private TableView<?> gestionarVehiculosTablaRegistro;

    @FXML
    private TableColumn<?, ?> idClienteTransaccionColumna;

    @FXML
    private TableColumn<?, ?> matriculaVehiculoTransaccionColumna;

    @FXML
    private TableColumn<?, ?> modeloVehiculoTransaccionColumna;

    @FXML
    private TableColumn<?, ?> nombreClienteTransaccionColumna;

    @FXML
    private TableView<?> paneClientesTablaCRegitrados;

    @FXML
    private Pane registroPane;

    @FXML
    private Label registroPaneNumeroTransaccionesLabel;

    @FXML
    private TableView<?> registroPaneTablaTransacciones;

    @FXML
    private Button registroPaneVolverButton;

    @FXML
    private TableColumn<?, ?> tablaClientesRegistradosDireccion;

    @FXML
    private TableColumn<?, ?> tablaClientesRegistradosEmail;

    @FXML
    private TableColumn<?, ?> tablaClientesRegistradosID;

    @FXML
    private TableColumn<?, ?> tablaClientesRegistradosNombre;

    @FXML
    private TableColumn<?, ?> tablaClientesRegistradosTelefono;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaEstado;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaMatricula;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaModelo;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaTipo;

    @FXML
    private TableColumn<?, ?> tablaRegistroMatricula;

    @FXML
    private TableColumn<?, ?> tablaRegistroModelo;

    @FXML
    private TableColumn<?, ?> tablaRegistroTipo;

    @FXML
    private TableView<?> tablaTransaccionCliente;

    @FXML
    private TableView<?> tablaTransaccionVehiculo;

    @FXML
    private TableView<?> tablaTransacciones;

    @FXML
    private TableColumn<?, ?> tablaTransaccionesEmpleadoCliente;

    @FXML
    private TableColumn<?, ?> tablaTransaccionesEmpleadoMatricula;

    @FXML
    private TableColumn<?, ?> tablaTransaccionesEmpleadoTipo;

    @FXML
    private TableColumn<?, ?> tipoVehiculoTransaccionColumna;

    @FXML
    private Button transaccionActualizarButton;

    @FXML
    private ChoiceBox<?> transaccionChoiceBox;

    @FXML
    private TextField transaccionCodigoField;

    @FXML
    private Button transaccionEliminarButton;

    @FXML
    private Label transaccionLabelID;

    @FXML
    private Button transaccionProcesarButton;

    @FXML
    private TableColumn<?, ?> transaccionesColumnaCliente;

    @FXML
    private TableColumn<?, ?> transaccionesColumnaCodigo;

    @FXML
    private TableColumn<?, ?> transaccionesColumnaEmpleado;

    @FXML
    private TableColumn<?, ?> transaccionesColumnaVehiculo;

    @FXML
    private Button verRegistroButton;

    @FXML
    void initialize() {
        assert ClientesPaneActualizarButton != null : "fx:id=\"ClientesPaneActualizarButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneDireccionField != null : "fx:id=\"ClientesPaneDireccionField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneEliminarButton != null : "fx:id=\"ClientesPaneEliminarButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneEmailField != null : "fx:id=\"ClientesPaneEmailField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneIDField != null : "fx:id=\"ClientesPaneIDField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneLimpiarCamposButton != null : "fx:id=\"ClientesPaneLimpiarCamposButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneNombreField != null : "fx:id=\"ClientesPaneNombreField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPanePasswordField != null : "fx:id=\"ClientesPanePasswordField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneRegistrarClienteButton != null : "fx:id=\"ClientesPaneRegistrarClienteButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneSecretWordField != null : "fx:id=\"ClientesPaneSecretWordField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneTelField != null : "fx:id=\"ClientesPaneTelField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert ClientesPaneUserNameField != null : "fx:id=\"ClientesPaneUserNameField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert TransaccionLabelMatricula != null : "fx:id=\"TransaccionLabelMatricula\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert disponibleVehiculoTransaccionColumna != null : "fx:id=\"disponibleVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarClientesButton != null : "fx:id=\"gestionarClientesButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarClientesPane != null : "fx:id=\"gestionarClientesPane\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarTransaccionesButton != null : "fx:id=\"gestionarTransaccionesButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarTransaccionesPane != null : "fx:id=\"gestionarTransaccionesPane\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosButton != null : "fx:id=\"gestionarVehiculosButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosEliminarButton != null : "fx:id=\"gestionarVehiculosEliminarButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosLabelMatricula != null : "fx:id=\"gestionarVehiculosLabelMatricula\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosPane != null : "fx:id=\"gestionarVehiculosPane\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosRegistrarVehiculoButton != null : "fx:id=\"gestionarVehiculosRegistrarVehiculoButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosTablaDeEspera != null : "fx:id=\"gestionarVehiculosTablaDeEspera\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert gestionarVehiculosTablaRegistro != null : "fx:id=\"gestionarVehiculosTablaRegistro\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert idClienteTransaccionColumna != null : "fx:id=\"idClienteTransaccionColumna\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert matriculaVehiculoTransaccionColumna != null : "fx:id=\"matriculaVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert modeloVehiculoTransaccionColumna != null : "fx:id=\"modeloVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert nombreClienteTransaccionColumna != null : "fx:id=\"nombreClienteTransaccionColumna\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert paneClientesTablaCRegitrados != null : "fx:id=\"paneClientesTablaCRegitrados\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert registroPane != null : "fx:id=\"registroPane\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert registroPaneNumeroTransaccionesLabel != null : "fx:id=\"registroPaneNumeroTransaccionesLabel\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert registroPaneTablaTransacciones != null : "fx:id=\"registroPaneTablaTransacciones\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert registroPaneVolverButton != null : "fx:id=\"registroPaneVolverButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaClientesRegistradosDireccion != null : "fx:id=\"tablaClientesRegistradosDireccion\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaClientesRegistradosEmail != null : "fx:id=\"tablaClientesRegistradosEmail\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaClientesRegistradosID != null : "fx:id=\"tablaClientesRegistradosID\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaClientesRegistradosNombre != null : "fx:id=\"tablaClientesRegistradosNombre\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaClientesRegistradosTelefono != null : "fx:id=\"tablaClientesRegistradosTelefono\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaDeEsperaEstado != null : "fx:id=\"tablaDeEsperaEstado\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaDeEsperaMatricula != null : "fx:id=\"tablaDeEsperaMatricula\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaDeEsperaModelo != null : "fx:id=\"tablaDeEsperaModelo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaDeEsperaTipo != null : "fx:id=\"tablaDeEsperaTipo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaRegistroMatricula != null : "fx:id=\"tablaRegistroMatricula\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaRegistroModelo != null : "fx:id=\"tablaRegistroModelo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaRegistroTipo != null : "fx:id=\"tablaRegistroTipo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaTransaccionCliente != null : "fx:id=\"tablaTransaccionCliente\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaTransaccionVehiculo != null : "fx:id=\"tablaTransaccionVehiculo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaTransacciones != null : "fx:id=\"tablaTransacciones\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaTransaccionesEmpleadoCliente != null : "fx:id=\"tablaTransaccionesEmpleadoCliente\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaTransaccionesEmpleadoMatricula != null : "fx:id=\"tablaTransaccionesEmpleadoMatricula\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tablaTransaccionesEmpleadoTipo != null : "fx:id=\"tablaTransaccionesEmpleadoTipo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert tipoVehiculoTransaccionColumna != null : "fx:id=\"tipoVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionActualizarButton != null : "fx:id=\"transaccionActualizarButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionChoiceBox != null : "fx:id=\"transaccionChoiceBox\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionCodigoField != null : "fx:id=\"transaccionCodigoField\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionEliminarButton != null : "fx:id=\"transaccionEliminarButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionLabelID != null : "fx:id=\"transaccionLabelID\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionProcesarButton != null : "fx:id=\"transaccionProcesarButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionesColumnaCliente != null : "fx:id=\"transaccionesColumnaCliente\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionesColumnaCodigo != null : "fx:id=\"transaccionesColumnaCodigo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionesColumnaEmpleado != null : "fx:id=\"transaccionesColumnaEmpleado\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert transaccionesColumnaVehiculo != null : "fx:id=\"transaccionesColumnaVehiculo\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";
        assert verRegistroButton != null : "fx:id=\"verRegistroButton\" was not injected: check your FXML file 'SecondaryEmpleado.fxml'.";

    }

}
