package co.edu.uniquindio.poo.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SecondaryAdmView {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label TransaccionLabelMatricula;

    @FXML
    private TableColumn<?, ?> disponibleVehiculoTransaccionColumna;

    @FXML
    private TextField empleadoPanEmailField;

    @FXML
    private Button empleadoPaneActualizarButton;

    @FXML
    private TextField empleadoPaneDireccionField;

    @FXML
    private TextField empleadoPaneIDField;

    @FXML
    private Button empleadoPaneLimpiarCamposButton;

    @FXML
    private TextField empleadoPaneNombreField;

    @FXML
    private TextField empleadoPanePasswordField;

    @FXML
    private TextField empleadoPanePuestoField;

    @FXML
    private Button empleadoPaneRegistrarClienteButton;

    @FXML
    private TextField empleadoPaneTelField;

    @FXML
    private TextField empleadoPaneUserNameField;

    @FXML
    private TextField empleadoSecretWordField;

    @FXML
    private Button generalButton;

    @FXML
    private Button generarReporteButton;

    @FXML
    private Button gestionarEmpleadosButton;

    @FXML
    private Pane gestionarEmpleadosPane;

    @FXML
    private Pane gestionarTransaccionesPane;

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
    private TableView<?> paneEmpleadosTablaRegitrados;

    @FXML
    private Button princiapalEliminarButton;

    @FXML
    private Button princiapalVolverButton;

    @FXML
    private TableColumn<?, ?> princiaplTablaTransaccionesCliente;

    @FXML
    private TableColumn<?, ?> princiaplTablaTransaccionesCodigo;

    @FXML
    private TableColumn<?, ?> princiaplTablaTransaccionesEmpleado;

    @FXML
    private TableColumn<?, ?> princiaplTablaTransaccionesMonto;

    @FXML
    private TableColumn<?, ?> princiaplTablaTransaccionesTipo;

    @FXML
    private TableColumn<?, ?> princiaplTablaTransaccionesVehiculo;

    @FXML
    private Button princiipalButton;

    @FXML
    private Label principalNumeroTransaccionesLabel;

    @FXML
    private TableView<?> principalPaneTablaTransacciones;

    @FXML
    private Pane registroPane;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaEstado;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaMatricula;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaModelo;

    @FXML
    private TableColumn<?, ?> tablaDeEsperaTipo;

    @FXML
    private Button tablaEmpleadosRegistradosEliminarButton;

    @FXML
    private TableColumn<?, ?> tablaEmpleadosRegistradosEmail;

    @FXML
    private TableColumn<?, ?> tablaEmpleadosRegistradosID;

    @FXML
    private TableColumn<?, ?> tablaEmpleadosRegistradosNombre;

    @FXML
    private TableColumn<?, ?> tablaEmpleadosRegistradosPuesto;

    @FXML
    private TableColumn<?, ?> tablaEmpleadosRegistradosTelefono;

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
    void initialize() {
        assert TransaccionLabelMatricula != null : "fx:id=\"TransaccionLabelMatricula\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert disponibleVehiculoTransaccionColumna != null : "fx:id=\"disponibleVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPanEmailField != null : "fx:id=\"empleadoPanEmailField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneActualizarButton != null : "fx:id=\"empleadoPaneActualizarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneDireccionField != null : "fx:id=\"empleadoPaneDireccionField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneIDField != null : "fx:id=\"empleadoPaneIDField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneLimpiarCamposButton != null : "fx:id=\"empleadoPaneLimpiarCamposButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneNombreField != null : "fx:id=\"empleadoPaneNombreField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPanePasswordField != null : "fx:id=\"empleadoPanePasswordField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPanePuestoField != null : "fx:id=\"empleadoPanePuestoField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneRegistrarClienteButton != null : "fx:id=\"empleadoPaneRegistrarClienteButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneTelField != null : "fx:id=\"empleadoPaneTelField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneUserNameField != null : "fx:id=\"empleadoPaneUserNameField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoSecretWordField != null : "fx:id=\"empleadoSecretWordField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert generalButton != null : "fx:id=\"generalButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert generarReporteButton != null : "fx:id=\"generarReporteButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarEmpleadosButton != null : "fx:id=\"gestionarEmpleadosButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarEmpleadosPane != null : "fx:id=\"gestionarEmpleadosPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarTransaccionesPane != null : "fx:id=\"gestionarTransaccionesPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosEliminarButton != null : "fx:id=\"gestionarVehiculosEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosLabelMatricula != null : "fx:id=\"gestionarVehiculosLabelMatricula\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosPane != null : "fx:id=\"gestionarVehiculosPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosRegistrarVehiculoButton != null : "fx:id=\"gestionarVehiculosRegistrarVehiculoButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosTablaDeEspera != null : "fx:id=\"gestionarVehiculosTablaDeEspera\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosTablaRegistro != null : "fx:id=\"gestionarVehiculosTablaRegistro\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert idClienteTransaccionColumna != null : "fx:id=\"idClienteTransaccionColumna\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert matriculaVehiculoTransaccionColumna != null : "fx:id=\"matriculaVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert modeloVehiculoTransaccionColumna != null : "fx:id=\"modeloVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert nombreClienteTransaccionColumna != null : "fx:id=\"nombreClienteTransaccionColumna\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert paneEmpleadosTablaRegitrados != null : "fx:id=\"paneEmpleadosTablaRegitrados\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiapalEliminarButton != null : "fx:id=\"princiapalEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiapalVolverButton != null : "fx:id=\"princiapalVolverButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesCliente != null : "fx:id=\"princiaplTablaTransaccionesCliente\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesCodigo != null : "fx:id=\"princiaplTablaTransaccionesCodigo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesEmpleado != null : "fx:id=\"princiaplTablaTransaccionesEmpleado\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesMonto != null : "fx:id=\"princiaplTablaTransaccionesMonto\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesTipo != null : "fx:id=\"princiaplTablaTransaccionesTipo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesVehiculo != null : "fx:id=\"princiaplTablaTransaccionesVehiculo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiipalButton != null : "fx:id=\"princiipalButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert principalNumeroTransaccionesLabel != null : "fx:id=\"principalNumeroTransaccionesLabel\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert principalPaneTablaTransacciones != null : "fx:id=\"principalPaneTablaTransacciones\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert registroPane != null : "fx:id=\"registroPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaDeEsperaEstado != null : "fx:id=\"tablaDeEsperaEstado\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaDeEsperaMatricula != null : "fx:id=\"tablaDeEsperaMatricula\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaDeEsperaModelo != null : "fx:id=\"tablaDeEsperaModelo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaDeEsperaTipo != null : "fx:id=\"tablaDeEsperaTipo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosEliminarButton != null : "fx:id=\"tablaEmpleadosRegistradosEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosEmail != null : "fx:id=\"tablaEmpleadosRegistradosEmail\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosID != null : "fx:id=\"tablaEmpleadosRegistradosID\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosNombre != null : "fx:id=\"tablaEmpleadosRegistradosNombre\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosPuesto != null : "fx:id=\"tablaEmpleadosRegistradosPuesto\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosTelefono != null : "fx:id=\"tablaEmpleadosRegistradosTelefono\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroMatricula != null : "fx:id=\"tablaRegistroMatricula\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroModelo != null : "fx:id=\"tablaRegistroModelo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroTipo != null : "fx:id=\"tablaRegistroTipo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaTransaccionCliente != null : "fx:id=\"tablaTransaccionCliente\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaTransaccionVehiculo != null : "fx:id=\"tablaTransaccionVehiculo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaTransacciones != null : "fx:id=\"tablaTransacciones\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tipoVehiculoTransaccionColumna != null : "fx:id=\"tipoVehiculoTransaccionColumna\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionActualizarButton != null : "fx:id=\"transaccionActualizarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionChoiceBox != null : "fx:id=\"transaccionChoiceBox\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionCodigoField != null : "fx:id=\"transaccionCodigoField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionEliminarButton != null : "fx:id=\"transaccionEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionLabelID != null : "fx:id=\"transaccionLabelID\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionProcesarButton != null : "fx:id=\"transaccionProcesarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionesColumnaCliente != null : "fx:id=\"transaccionesColumnaCliente\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionesColumnaCodigo != null : "fx:id=\"transaccionesColumnaCodigo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionesColumnaEmpleado != null : "fx:id=\"transaccionesColumnaEmpleado\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert transaccionesColumnaVehiculo != null : "fx:id=\"transaccionesColumnaVehiculo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";

    }

    
}
