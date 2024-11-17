package co.edu.uniquindio.poo.view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.SecondaryAdmController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SecondaryAdmView {

    // General Resources
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    /*
     * Pane 1: Gestionar las Transacciones del Sistema
     */
    @FXML
    private Pane transaccionesPane;

    @FXML
    private TableView<?> principalPaneTablaTransacciones;

    @FXML
    private TableColumn<Transaccion, String> princiaplTablaTransaccionesCliente;

    @FXML
    private TableColumn<Transaccion, String> princiaplTablaTransaccionesCodigo;

    @FXML
    private TableColumn<Transaccion, String> princiaplTablaTransaccionesEmpleado;

    @FXML
    private TableColumn<Transaccion, Double> princiaplTablaTransaccionesMonto;

    @FXML
    private TableColumn<Transaccion, String> princiaplTablaTransaccionesTipo;

    @FXML
    private TableColumn<Vehiculo, String> princiaplTablaTransaccionesVehiculo;

    @FXML
    private Button princiapalEliminarButton;

    @FXML
    private Button princiapalVolverButton;

    @FXML
    private Label principalNumeroTransaccionesLabel;

    /*
     * Panel 2: Gestion de empleados
     */
    @FXML
    private Pane gestionarEmpleadosPane;

    @FXML
    private TextField empleadoPanEmailField;

    @FXML
    private TextField empleadoPaneDireccionField;

    @FXML
    private TextField empleadoPaneIDField;

    @FXML
    private TextField empleadoPaneNombreField;

    @FXML
    private TextField empleadoPanePasswordField;

    @FXML
    private TextField empleadoPanePuestoField;

    @FXML
    private TextField empleadoPaneTelField;

    @FXML
    private TextField empleadoPaneUserNameField;

    @FXML
    private TextField empleadoSecretWordField;

    @FXML
    private Button empleadoPaneActualizarButton;

    @FXML
    private Button empleadoPaneLimpiarCamposButton;

    @FXML
    private Button empleadoPaneRegistrarClienteButton;

    // Tabla de los empleados registrados

    @FXML
    private TableView<Empleado> paneEmpleadosTablaRegitrados;

    @FXML
    private TableColumn<Empleado, String> tablaEmpleadosRegistradosEmail;

    @FXML
    private TableColumn<Empleado, String> tablaEmpleadosRegistradosID;

    @FXML
    private TableColumn<Empleado, String> tablaEmpleadosRegistradosNombre;

    @FXML
    private TableColumn<Empleado, String> tablaEmpleadosRegistradosPuesto;

    @FXML
    private TableColumn<Empleado, String> tablaEmpleadosRegistradosTelefono;

    @FXML
    private Button tablaEmpleadosRegistradosEliminarButton;

    /*
     * Pane 3: Crear Reporte respecto al ID del empleado
     */

    @FXML
    private Pane gestionarReportesPane;

    @FXML
    private TextField reporteCodigoTextField;

    @FXML
    private TextField reporteIdEmpleadoTextField;

    @FXML
    private TableView<?> reporteTabla;

    @FXML
    private TableColumn<Reporte, String> reporteColumnaCodigo;

    @FXML
    private TableColumn<Reporte, String> reporteColumnaEmpleado;

    @FXML
    private TableColumn<Reporte, LocalDate> reporteColumnaFecha;

    @FXML
    private TableColumn<Reporte, Integer> reporteColumnaTotalAlquileres;

    @FXML
    private TableColumn<Reporte, Integer> reporteColumnaTotalCompras;

    @FXML
    private TableColumn<Reporte, Double> reporteColumnaTotalMonto;

    @FXML
    private TableColumn<Reporte, Integer> reporteColumnaTotalTransacciones;

    @FXML
    private TableColumn<Reporte, Integer> reporteColumnaTotalVentas;

    @FXML
    private Button reporteCrearButton;

    @FXML
    private Button reporteEliminarButton;

    @FXML
    private Label reporteMensajeError;

    /*
     * Pane 4: Tabla Clientes y Vehiculos
     */

    @FXML
    private Pane gestionarRegistroPane;

    @FXML
    private TableView<Cliente> paneClientesTablaCRegitrados;

    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosDireccion;

    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosEmail;

    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosID;

    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosNombre;

    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosTelefono;

    @FXML
    private Button eliminarClienteButton;

    @FXML
    private TableView<Vehiculo> gestionarVehiculosTablaRegistro;

    @FXML
    private TableColumn<Vehiculo, Boolean> tablaRegistroDisponible;

    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroMatricula;

    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroModelo;

    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroTipo;

    @FXML
    private Button eliminarVehiculoButton;

    /*
     * Atributos Generales
     */
    @FXML
    private Button generalButton;

    @FXML
    private Button generarReporteButton;

    @FXML
    private Button gestionarEmpleadosButton;

    @FXML
    private Button principalButton;

    private App app;
    private SecondaryAdmController controller;

    @FXML
    void initialize() {
        //Gestion del las ventanas
        gestionarEmpleadosPane.setVisible(false);
        gestionarReportesPane.setVisible(false);
        transaccionesPane.setVisible(true);
        gestionarRegistroPane.setVisible(false);
        principalButton.setOnAction(e -> showPanel(transaccionesPane));
        gestionarEmpleadosButton.setOnAction(e -> showPanel(gestionarEmpleadosPane));
        generarReporteButton.setOnAction(e -> showPanel(gestionarReportesPane));
        generalButton.setOnAction(e -> showPanel(gestionarRegistroPane));

        assert transaccionesPane != null
                : "fx:id=\"TransaccionesPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert eliminarClienteButton != null
                : "fx:id=\"eliminarClienteButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert eliminarVehiculoButton != null
                : "fx:id=\"eliminarVehiculoButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPanEmailField != null
                : "fx:id=\"empleadoPanEmailField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneActualizarButton != null
                : "fx:id=\"empleadoPaneActualizarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneDireccionField != null
                : "fx:id=\"empleadoPaneDireccionField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneIDField != null
                : "fx:id=\"empleadoPaneIDField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneLimpiarCamposButton != null
                : "fx:id=\"empleadoPaneLimpiarCamposButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneNombreField != null
                : "fx:id=\"empleadoPaneNombreField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPanePasswordField != null
                : "fx:id=\"empleadoPanePasswordField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPanePuestoField != null
                : "fx:id=\"empleadoPanePuestoField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneRegistrarClienteButton != null
                : "fx:id=\"empleadoPaneRegistrarClienteButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneTelField != null
                : "fx:id=\"empleadoPaneTelField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoPaneUserNameField != null
                : "fx:id=\"empleadoPaneUserNameField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert empleadoSecretWordField != null
                : "fx:id=\"empleadoSecretWordField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert generalButton != null
                : "fx:id=\"generalButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert generarReporteButton != null
                : "fx:id=\"generarReporteButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarEmpleadosButton != null
                : "fx:id=\"gestionarEmpleadosButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarEmpleadosPane != null
                : "fx:id=\"gestionarEmpleadosPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarRegistroPane != null
                : "fx:id=\"gestionarRegistroPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarReportesPane != null
                : "fx:id=\"gestionarReportesPane\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert gestionarVehiculosTablaRegistro != null
                : "fx:id=\"gestionarVehiculosTablaRegistro\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert paneClientesTablaCRegitrados != null
                : "fx:id=\"paneClientesTablaCRegitrados\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert paneEmpleadosTablaRegitrados != null
                : "fx:id=\"paneEmpleadosTablaRegitrados\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiapalEliminarButton != null
                : "fx:id=\"princiapalEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiapalVolverButton != null
                : "fx:id=\"princiapalVolverButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesCliente != null
                : "fx:id=\"princiaplTablaTransaccionesCliente\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesCodigo != null
                : "fx:id=\"princiaplTablaTransaccionesCodigo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesEmpleado != null
                : "fx:id=\"princiaplTablaTransaccionesEmpleado\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesMonto != null
                : "fx:id=\"princiaplTablaTransaccionesMonto\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesTipo != null
                : "fx:id=\"princiaplTablaTransaccionesTipo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert princiaplTablaTransaccionesVehiculo != null
                : "fx:id=\"princiaplTablaTransaccionesVehiculo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert principalButton != null
                : "fx:id=\"principalButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert principalNumeroTransaccionesLabel != null
                : "fx:id=\"principalNumeroTransaccionesLabel\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert principalPaneTablaTransacciones != null
                : "fx:id=\"principalPaneTablaTransacciones\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteCodigoTextField != null
                : "fx:id=\"reporteCodigoTextField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaCodigo != null
                : "fx:id=\"reporteColumnaCodigo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaEmpleado != null
                : "fx:id=\"reporteColumnaEmpleado\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaFecha != null
                : "fx:id=\"reporteColumnaFecha\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaTotalAlquileres != null
                : "fx:id=\"reporteColumnaTotalAlquileres\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaTotalCompras != null
                : "fx:id=\"reporteColumnaTotalCompras\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaTotalMonto != null
                : "fx:id=\"reporteColumnaTotalMonto\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaTotalTransacciones != null
                : "fx:id=\"reporteColumnaTotalTransacciones\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteColumnaTotalVentas != null
                : "fx:id=\"reporteColumnaTotalVentas\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteCrearButton != null
                : "fx:id=\"reporteCrearButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteEliminarButton != null
                : "fx:id=\"reporteEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteIdEmpleadoTextField != null
                : "fx:id=\"reporteIdEmpleadoTextField\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteMensajeError != null
                : "fx:id=\"reporteMensajeError\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert reporteTabla != null
                : "fx:id=\"reporteTabla\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaClientesRegistradosDireccion != null
                : "fx:id=\"tablaClientesRegistradosDireccion\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaClientesRegistradosEmail != null
                : "fx:id=\"tablaClientesRegistradosEmail\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaClientesRegistradosID != null
                : "fx:id=\"tablaClientesRegistradosID\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaClientesRegistradosNombre != null
                : "fx:id=\"tablaClientesRegistradosNombre\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaClientesRegistradosTelefono != null
                : "fx:id=\"tablaClientesRegistradosTelefono\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosEliminarButton != null
                : "fx:id=\"tablaEmpleadosRegistradosEliminarButton\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosEmail != null
                : "fx:id=\"tablaEmpleadosRegistradosEmail\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosID != null
                : "fx:id=\"tablaEmpleadosRegistradosID\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosNombre != null
                : "fx:id=\"tablaEmpleadosRegistradosNombre\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosPuesto != null
                : "fx:id=\"tablaEmpleadosRegistradosPuesto\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaEmpleadosRegistradosTelefono != null
                : "fx:id=\"tablaEmpleadosRegistradosTelefono\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroDisponible != null
                : "fx:id=\"tablaRegistroDisponible\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroMatricula != null
                : "fx:id=\"tablaRegistroMatricula\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroModelo != null
                : "fx:id=\"tablaRegistroModelo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";
        assert tablaRegistroTipo != null
                : "fx:id=\"tablaRegistroTipo\" was not injected: check your FXML file 'SecondaryAdm.fxml'.";

    }

    public void actualizarVista() {

    }

    private void showPanel(Pane pane) {
        actualizarVista();
        gestionarEmpleadosPane.setVisible(false);
        gestionarReportesPane.setVisible(false);
        transaccionesPane.setVisible(false);
        gestionarRegistroPane.setVisible(false);
        pane.setVisible(true);
    }

    public void setApp(App app) {
        this.app = app;
        controller = new SecondaryAdmController(app.getSistemaConcesionario().getAdministrador(), app.getSistemaConcesionario());
        actualizarVista();
    }

}
