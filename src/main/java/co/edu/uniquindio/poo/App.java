package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EnumCombustible;
import co.edu.uniquindio.poo.model.EnumTransmision;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.RegistroTransacciones;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.TransaccionAlquiler;
import co.edu.uniquindio.poo.model.TransaccionCompra;
import co.edu.uniquindio.poo.model.TransaccionVenta;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.view.LoginAdmView;
import co.edu.uniquindio.poo.view.LoginEmpleadoView;
import co.edu.uniquindio.poo.view.PrimaryView;
import co.edu.uniquindio.poo.view.SecondaryEmpleadoView;

public class App extends Application {

    private Stage primaryStage;
    private SistemaConcesionario sistemaConcesionario;

    public SistemaConcesionario getSistemaConcesionario() {
        return sistemaConcesionario;
    }

    private Empleado empleadoAutenticado;

    public Empleado getEmpleadoAutenticado() {
        return empleadoAutenticado;
    }

    public void setEmpleadoAutenticado(Empleado empleadoAutenticado) {
        this.empleadoAutenticado = empleadoAutenticado;
    }

    private Administrador administradorAutenticado;

    public Administrador getAdministradorAutenticado() {
        return administradorAutenticado;
    }

    public void setAdministradorAutenticado(Administrador administradorAutenticado) {
        this.administradorAutenticado = administradorAutenticado;
    }

    /*
     * No Modificar
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Sistema de Concesionario");
        RegistroTransacciones registro = new RegistroTransacciones(LocalDate.now());

        Administrador adm1 = new Administrador(
            "Santiago", "007", "Shant", "password123", "Squirrel77",
            "shant.com", "3201234567"
        );

        // Crear empleados
        Empleado empleado1 = new Empleado("Santiago Torres", "007", "Shant", "pass007", "Sparrot", "shant.com", "Gerente", "3101112233");
        Empleado empleado2 = new Empleado("Ana Lopez", "E002", "anaL", "pass002", "sol", "ana.lopez@tuCarroUQ.com", "Compras", "3102223344");
        Empleado empleado3 = new Empleado("Luis Martinez", "E003", "luisM", "pass003", "mar", "luis.martinez@tuCarroUQ.com", "Alquiler", "3103334455");
        Empleado empleado4 = new Empleado("Maria Rodriguez", "E004", "mariaR", "pass004", "luna", "maria.rodriguez@tuCarroUQ.com", "Ventas", "3104445566");
        Empleado empleado5 = new Empleado("Pedro Sanchez", "E005", "pedroS", "pass005", "estrella", "pedro.sanchez@tuCarroUQ.com", "Compras", "3105556677");
        Empleado empleado6 = new Empleado("Laura Castro", "E006", "lauraC", "pass006", "nube", "laura.castro@tuCarroUQ.com", "Alquiler", "3106667788");
        Empleado empleado7 = new Empleado("Jose Torres", "E007", "joseT", "pass007", "rio", "jose.torres@tuCarroUQ.com", "Ventas", "3107778899");

        // Crear clientes
        Cliente cliente1 = new Cliente("Andrea Diaz", "C001", "andreaD", "clientpass1", "flor", "andrea.diaz@gmail.com", "Calle 123 #45-67", "3201112233");
        Cliente cliente2 = new Cliente("Daniel Rios", "C002", "danielR", "clientpass2", "montaña", "daniel.rios@gmail.com", "Carrera 98 #10-20", "3202223344");
        Cliente cliente3 = new Cliente("Sofia Morales", "C003", "sofiaM", "clientpass3", "paz", "sofia.morales@gmail.com", "Avenida 50 #5-45", "3203334455");
        Cliente cliente4 = new Cliente("Ricardo Pardo", "C004", "ricardoP", "clientpass4", "cielo", "ricardo.pardo@gmail.com", "Calle 74 #9-21", "3204445566");
        Cliente cliente5 = new Cliente("Elena Vargas", "C005", "elenaV", "clientpass5", "estrella", "elena.vargas@gmail.com", "Carrera 80 #15-30", "3205556677");

       

        sistemaConcesionario = new SistemaConcesionario("Concesionario de Ejemplo", adm1, registro);
        sistemaConcesionario.agregarEmpleado(empleado1);
        sistemaConcesionario.agregarEmpleado(empleado2);

      

        sistemaConcesionario.agregarCliente(cliente1);
        sistemaConcesionario.agregarCliente(cliente2);
        sistemaConcesionario.agregarCliente(cliente3);
        sistemaConcesionario.agregarCliente(cliente4);
        sistemaConcesionario.agregarCliente(cliente5);

        Moto moto1 = new Moto("Yamaha", "MT-07", "KLJ-233",  6, 220.0, 689.0,
                EnumTransmision.MANUAL, true, 8000.0, 17.0, 5.5, EnumCombustible.GASOLINA);

        Moto moto2 = new Moto("Honda", "CBR500R", "PLM-073", 6, 180.0, 471.0,
                EnumTransmision.MANUAL, true, 6500.0, 15.0, 4.5, EnumCombustible.GASOLINA);

        sistemaConcesionario.agregarVehiculo(moto1);
        sistemaConcesionario.agregarVehiculo(moto2);

        TransaccionAlquiler alquiler = new TransaccionAlquiler("ALQ001", cliente1, empleado1, moto1, LocalDate.now(),
                LocalDate.now().plusDays(7));
        TransaccionCompra compra = new TransaccionCompra("CMP001", cliente2, empleado2, moto2, LocalDate.now(),
                25000.0);
        TransaccionVenta venta = new TransaccionVenta("VTA001", cliente1, empleado2, moto1, LocalDate.now(), 23000.0);

        registro.registrarTransaccion(alquiler);
        registro.registrarTransaccion(compra);
        registro.registrarTransaccion(venta);

        openPrimaryView();
    }

    /*
     * No Modificar
     */
    private void openPrimaryView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("Primary.fxml"));
            Scene scene = new Scene(loader.load());

            PrimaryView primaryView = loader.getController();
            primaryView.setApp(this);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * No Modificar
     */
    public void openSecondaryEmpleadoView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryEmpleado.fxml"));
            Scene scene = new Scene(loader.load());

            // Obtener el controlador de la vista secundaria, si es necesario
            SecondaryEmpleadoView secondaryEmpleadoView = loader.getController();

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * No Modificar
     */
    public void openLoginEmpleadoView() {
        primaryStage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginEmpleado.fxml"));
            Scene scene = new Scene(loader.load());

            LoginEmpleadoView loginEmpleadoView = loader.getController();
            loginEmpleadoView.setApp(this);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * No Modficar
     */
    public void openLoginAdmView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LoginAdm.fxml")); // Ruta absoluta
            Scene scene = new Scene(loader.load());

            LoginAdmView loginAdmView = loader.getController();
            loginAdmView.setApp(this);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
