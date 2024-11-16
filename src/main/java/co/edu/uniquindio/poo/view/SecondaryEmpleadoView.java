package co.edu.uniquindio.poo.view;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.*;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TableView<Transaccion> tablaTransacciones;
    @FXML
    private TableColumn<Cliente, String> transaccionesColumnaCliente;
    @FXML
    private TableColumn<Vehiculo, String> transaccionesColumnaVehiculo;
    @FXML
    private TableColumn<Transaccion, String> transaccionesColumnaCodigo;
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
    private TableView<Transaccion> registroPaneTablaTransacciones;
    @FXML
    private TableColumn<Transaccion, String> tablaTransaccionesEmpleadoTipo;
    @FXML
    private TableColumn<Transaccion, String> tablaTransaccionesEmpleadoCliente;
    @FXML
    private TableColumn<Transaccion, String> tablaTransaccionesEmpleadoMatricula;

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

    private App app;
    private SecondaryEmpleadoController controller;

    @FXML
    private void initialize() {

        gestionarClientesPane.setVisible(false);
        gestionarVehiculosPane.setVisible(false);
        gestionarTransaccionesPane.setVisible(false);
        registroPane.setVisible(true);

        gestionarVehiculosTablaDeEspera.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        gestionarVehiculosLabelMatricula.setText("Matrícula: " + newValue.getMatricula());
                    } else {
                        gestionarVehiculosLabelMatricula.setText("Seleccione un vehículo");
                    }
                });

        tablaDeEsperaMatricula
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tablaDeEsperaModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tablaDeEsperaTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));

        // Configuración de columnas de tabla de registrados
        tablaRegistroMatricula
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tablaRegistroModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tablaRegistroTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));

        // Acción para mover el vehículo seleccionado de la lista de espera a la lista
        // de registrados
        gestionarVehiculosRegistrarVehiculoButton.setOnAction(e -> registrarVehiculoDesdeEspera());
        gestionarVehiculosEliminarButton.setOnAction(e -> eliminarVehiculoRegistradoSeleccionado());


        ClientesPaneRegistrarClienteButton.setOnAction(e -> registrarCliente());
        ClientesPaneActualizarButton.setOnAction(e -> actualizarCliente());
        ClientesPaneEliminarButton.setOnAction(e -> eliminarCliente());
        ClientesPaneLimpiarCamposButton.setOnAction(e -> limpiarCampos());

        gestionarClientesButton.setOnAction(e -> showPanel(gestionarClientesPane));
        gestionarVehiculosButton.setOnAction(e -> showPanel(gestionarVehiculosPane));
        gestionarTransaccionesButton.setOnAction(e -> showPanel(gestionarTransaccionesPane));
        verRegistroButton.setOnAction(e -> showPanel(registroPane));

        tablaClientesRegistradosID
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tablaClientesRegistradosNombre
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tablaClientesRegistradosDireccion
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        tablaClientesRegistradosEmail
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
        tablaClientesRegistradosTelefono
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));

        tablaTransaccionesEmpleadoTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));

        tablaTransaccionesEmpleadoCliente.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));

        tablaTransaccionesEmpleadoMatricula.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getMatricula()));

        registroPaneVolverButton.setOnAction(e -> openPrimaryView());

        paneClientesTablaCRegitrados.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        mostrarDatosCliente(newValue);
                    }
                });

        registroPaneVolverButton.setOnAction(e -> openPrimaryView());

        registroPane.setVisible(true);
    }

    public void actualizarVista() {
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(controller.obtenerClientes());
        paneClientesTablaCRegitrados.setItems(clientes);
        paneClientesTablaCRegitrados.refresh(); // Forzar actualización visual de la tabla

        ObservableList<Transaccion> transacciones = FXCollections
                .observableArrayList(controller.obtenerTransacciones());
        registroPaneTablaTransacciones.setItems(transacciones);
        registroPaneTablaTransacciones.refresh(); // Forzar actualización de la tabla de transacciones
        gestionarVehiculosTablaDeEspera.setItems(app.getListaDeEspera());
        gestionarVehiculosTablaRegistro.setItems(controller.obtenerVehiculosRegistrados());
        gestionarVehiculosTablaRegistro.refresh();
        gestionarVehiculosTablaDeEspera.refresh();
        registroPaneNumeroTransaccionesLabel.setText("Total de Transacciones: " + transacciones.size());
    }

    private void registrarVehiculoDesdeEspera() {
        Vehiculo vehiculoSeleccionado = gestionarVehiculosTablaDeEspera.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            controller.registrarVehiculoDesdeEspera(vehiculoSeleccionado);
            actualizarVista();
        }
    }

    private void eliminarVehiculoRegistradoSeleccionado() {
        Vehiculo vehiculoSeleccionado = gestionarVehiculosTablaRegistro.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            // Elimina el vehículo del modelo
            controller.eliminarVehiculo(vehiculoSeleccionado);
    
            // Elimina el vehículo de la tabla de la vista
            gestionarVehiculosTablaRegistro.getItems().remove(vehiculoSeleccionado);
    
            // Muestra la matrícula del vehículo eliminado
            gestionarVehiculosLabelMatricula.setText("Vehículo eliminado: " + vehiculoSeleccionado.getMatricula());
    
            // Actualiza la vista para reflejar los cambios
            actualizarVista();
        } else {
            // Si no se seleccionó un vehículo
            gestionarVehiculosLabelMatricula.setText("Seleccione un vehículo para eliminar");
        }
    }

    private void registrarCliente() {
        String nombre = ClientesPaneNombreField.getText();
        String id = ClientesPaneIDField.getText();
        String direccion = ClientesPaneDireccionField.getText();
        String email = ClientesPaneEmailField.getText();
        String telefono = ClientesPaneTelField.getText();
        String usuario = ClientesPaneUserNameField.getText();
        String password = ClientesPanePasswordField.getText();
        String palabraSecreta = ClientesPaneSecretWordField.getText();

        controller.crearCliente(nombre, id, usuario, password, palabraSecreta, email, direccion, telefono);
        actualizarVista();
    }

    private void mostrarDatosCliente(Cliente cliente) {
        ClientesPaneIDField.setText(cliente.getId());
        ClientesPaneNombreField.setText(cliente.getNombre());
        ClientesPaneDireccionField.setText(cliente.getDireccion());
        ClientesPaneEmailField.setText(cliente.getEmail());
        ClientesPaneTelField.setText(cliente.getTelefono());
        ClientesPaneUserNameField.setText(cliente.getNombreDeUsuario());
        ClientesPanePasswordField.setText(cliente.getContraseña());
        ClientesPaneSecretWordField.setText(cliente.getPalabraSecreta());
    }

    private void actualizarCliente() {
        // Obtener los datos de los campos de texto
        String nombre = ClientesPaneNombreField.getText();
        String id = ClientesPaneIDField.getText();
        String direccion = ClientesPaneDireccionField.getText();
        String email = ClientesPaneEmailField.getText();
        String telefono = ClientesPaneTelField.getText();
        String usuario = ClientesPaneUserNameField.getText();
        String password = ClientesPanePasswordField.getText();
        String palabraSecreta = ClientesPaneSecretWordField.getText();

        if (id.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || email.isEmpty() || telefono.isEmpty()) {
            System.out.println("Todos los campos deben estar completos.");
            return;
        }

        Cliente nuevosDatos = new Cliente(nombre, id, usuario, password, palabraSecreta, email, direccion, telefono);

        boolean actualizado = controller.actualizarClientePorID(id, nuevosDatos);

        if (actualizado) {
            actualizarVista();
        } else {
            System.out.println("No se pudo actualizar el cliente.");
        }
    }

    private void eliminarCliente() {
        Cliente clienteSeleccionado = paneClientesTablaCRegitrados.getSelectionModel().getSelectedItem();
        if (clienteSeleccionado != null) {
            controller.eliminarCliente(clienteSeleccionado.getId());
            actualizarVista();
        }
    }

    private void limpiarCampos() {
        // Limpiar todos los campos del formulario
        ClientesPaneNombreField.clear();
        ClientesPaneIDField.clear();
        ClientesPaneDireccionField.clear();
        ClientesPaneEmailField.clear();
        ClientesPaneTelField.clear();
        ClientesPaneUserNameField.clear();
        ClientesPanePasswordField.clear();
        ClientesPaneSecretWordField.clear();

    }

    // Método que cambia la visibilidad del panel según el botón presionado
    private void showPanel(Pane pane) {
        // Ocultar todos los panes
        actualizarVista();
        gestionarClientesPane.setVisible(false);
        gestionarVehiculosPane.setVisible(false);
        gestionarTransaccionesPane.setVisible(false);
        registroPane.setVisible(false);

        // Mostrar el panel correspondiente
        pane.setVisible(true);
    }

    // Método para abrir la vista principal
    private void openPrimaryView() {
        app.openPrimaryView();
    }

    public void setApp(App app) {
        this.app = app;
        controller = new SecondaryEmpleadoController(app.getSistemaConcesionario(), app.getEmpleadoAutenticado());
        actualizarVista();
    }
}
