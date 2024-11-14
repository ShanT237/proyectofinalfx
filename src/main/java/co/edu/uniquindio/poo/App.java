package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EnumCombustible;
import co.edu.uniquindio.poo.model.EnumTipoCamion;
import co.edu.uniquindio.poo.model.EnumTransmision;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.RegistroTransacciones;
import co.edu.uniquindio.poo.model.RevisionTecnica;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.TransaccionAlquiler;
import co.edu.uniquindio.poo.model.TransaccionCompra;
import co.edu.uniquindio.poo.model.TransaccionVenta;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.view.LoginAdmView;
import co.edu.uniquindio.poo.view.LoginEmpleadoView;
import co.edu.uniquindio.poo.view.PrimaryView;
import co.edu.uniquindio.poo.view.SecondaryAdmView;
import co.edu.uniquindio.poo.view.SecondaryEmpleadoView;

/**
 * Autores: Santiago Rodríguez Torres, Oscar Mateo Moreno
 * Fecha: 13/11/2024
 * Licencia: GNU GPL V3
 *
 */
public class App extends Application {

    /*
     * Variables de Apoyo y Sus metodos
     */

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
     * Datos de Inicio
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Sistema de Concesionario");
        RegistroTransacciones registro = new RegistroTransacciones(LocalDate.now());

        // Crea el Administrador
        Administrador adm1 = new Administrador(
                "Santiago", "007", "Shant", "pass007", "Squirrel77",
                "shant.com", "3201234567");

        // Crear empleados
        Empleado empleado1 = new Empleado("Santiago Torres", "007", "Shant", "pass007", "Sparrot", "shant.com",
                "Gerente", "3101112233");
        Empleado empleado2 = new Empleado("Ana Lopez", "E002", "anaL", "pass002", "sol", "ana.lopez@tuCarroUQ.com",
                "Compras", "3102223344");
        Empleado empleado3 = new Empleado("Luis Martinez", "E003", "luisM", "pass003", "mar",
                "luis.martinez@tuCarroUQ.com", "Alquiler", "3103334455");
        Empleado empleado4 = new Empleado("Maria Rodriguez", "E004", "mariaR", "pass004", "luna",
                "maria.rodriguez@tuCarroUQ.com", "Ventas", "3104445566");
        Empleado empleado5 = new Empleado("Pedro Sanchez", "E005", "pedroS", "pass005", "estrella",
                "pedro.sanchez@tuCarroUQ.com", "Compras", "3105556677");
        Empleado empleado6 = new Empleado("Laura Castro", "E006", "lauraC", "pass006", "nube",
                "laura.castro@tuCarroUQ.com", "Alquiler", "3106667788");
        Empleado empleado7 = new Empleado("Jose Torres", "E007", "joseT", "pass007", "rio", "jose.torres@tuCarroUQ.com",
                "Ventas", "3107778899");

        // Crear clientes
        Cliente cliente1 = new Cliente("Andrea Diaz", "C001", "andreaD", "clientpass1", "flor", "andrea.diaz@gmail.com",
                "Calle 123 #45-67", "3201112233");
        Cliente cliente2 = new Cliente("Daniel Rios", "C002", "danielR", "clientpass2", "montaña",
                "daniel.rios@gmail.com", "Carrera 98 #10-20", "3202223344");
        Cliente cliente3 = new Cliente("Sofia Morales", "C003", "sofiaM", "clientpass3", "paz",
                "sofia.morales@gmail.com", "Avenida 50 #5-45", "3203334455");
        Cliente cliente4 = new Cliente("Ricardo Pardo", "C004", "ricardoP", "clientpass4", "cielo",
                "ricardo.pardo@gmail.com", "Calle 74 #9-21", "3204445566");
        Cliente cliente5 = new Cliente("Elena Vargas", "C005", "elenaV", "clientpass5", "estrella",
                "elena.vargas@gmail.com", "Carrera 80 #15-30", "3205556677");
        // Empleados
        Empleado empleado8 = new Empleado("Carlos Gomez", "E008", "carlosG", "pass008", "agua",
                "carlos.gomez@tuCarroUQ.com",
                "Alquiler", "3108889900");
        Empleado empleado9 = new Empleado("Maria Fernanda", "E009", "mariaF", "pass009", "sol",
                "maria.fernanda@tuCarroUQ.com",
                "Ventas", "3109991011");
        Empleado empleado10 = new Empleado("Juan Perez", "E010", "juanP", "pass010", "viento",
                "juan.perez@tuCarroUQ.com",
                "Alquiler", "3110002122");
        Empleado empleado11 = new Empleado("Ana Rodriguez", "E011", "anaR", "pass011", "luna",
                "ana.rodriguez@tuCarroUQ.com",
                "Ventas", "3111113233");
        Empleado empleado12 = new Empleado("Pedro Lopez", "E012", "pedroL", "pass012", "rayo",
                "pedro.lopez@tuCarroUQ.com",
                "Alquiler", "3112224344");
        Empleado empleado13 = new Empleado("Julia Mendoza", "E013", "juliaM", "pass013", "nieve",
                "julia.mendoza@tuCarroUQ.com",
                "Ventas", "3113335455");
        Empleado empleado14 = new Empleado("Ricardo Salazar", "E014", "ricardoS", "pass014", "océano",
                "ricardo.salazar@tuCarroUQ.com",
                "Alquiler", "3114446566");
        Empleado empleado15 = new Empleado("Patricia Ruiz", "E015", "patriciaR", "pass015", "estrella",
                "patricia.ruiz@tuCarroUQ.com",
                "Ventas", "3115557677");

        // Clientes
        Cliente cliente6 = new Cliente("Felipe Romero", "C006", "felipeR", "clientpass6", "roca",
                "felipe.romero@gmail.com",
                "Calle 58 #15-25", "3206667788");
        Cliente cliente7 = new Cliente("Luisa Peña", "C007", "luisaP", "clientpass7", "sol", "luisa.pena@gmail.com",
                "Calle 13 #20-30", "3207778899");
        Cliente cliente8 = new Cliente("Mario Torres", "C008", "marioT", "clientpass8", "mar", "mario.torres@gmail.com",
                "Avenida 35 #8-20", "3208889900");
        Cliente cliente9 = new Cliente("Camila Soto", "C009", "camilaS", "clientpass9", "luz", "camila.soto@gmail.com",
                "Carrera 12 #30-40", "3209991011");
        Cliente cliente10 = new Cliente("Ricardo Gómez", "C010", "ricardoG", "clientpass10", "rojo",
                "ricardo.gomez@gmail.com",
                "Avenida 77 #12-15", "3210002122");
        Cliente cliente11 = new Cliente("Valentina Castro", "C011", "valentinaC", "clientpass11", "flor",
                "valentina.castro@gmail.com",
                "Calle 23 #50-60", "3211113233");
        Cliente cliente12 = new Cliente("Javier Jiménez", "C012", "javierJ", "clientpass12", "noche",
                "javier.jimenez@gmail.com",
                "Carrera 45 #5-20", "3212224344");
        Cliente cliente13 = new Cliente("Lorena Gutierrez", "C013", "lorenaG", "clientpass13", "agua",
                "lorena.gutierrez@gmail.com",
                "Calle 99 #9-30", "3213335455");
        Cliente cliente14 = new Cliente("Antonio Medina", "C014", "antonioM", "clientpass14", "fuego",
                "antonio.medina@gmail.com",
                "Avenida 22 #11-25", "3214446566");
        Cliente cliente15 = new Cliente("Teresa Delgado", "C015", "teresaD", "clientpass15", "luna",
                "teresa.delgado@gmail.com",
                "Carrera 50 #8-10", "3215557677");

        sistemaConcesionario = new SistemaConcesionario("Concesionario de Ejemplo", adm1, registro);
        sistemaConcesionario.agregarEmpleado(empleado1);
        sistemaConcesionario.agregarEmpleado(empleado2);

        sistemaConcesionario.agregarCliente(cliente1);
        sistemaConcesionario.agregarCliente(cliente2);
        sistemaConcesionario.agregarCliente(cliente3);
        sistemaConcesionario.agregarCliente(cliente4);
        sistemaConcesionario.agregarCliente(cliente5);

        // Revisiones Tecnicas
        RevisionTecnica revision1 = new RevisionTecnica(LocalDate.of(2024, 1, 10), 1, LocalDate.of(2025, 1, 10),
                "RT001", true);
        RevisionTecnica revision2 = new RevisionTecnica(LocalDate.of(2024, 2, 15), 2, LocalDate.of(2025, 2, 15),
                "RT002", false);
        RevisionTecnica revision3 = new RevisionTecnica(LocalDate.of(2024, 3, 20), 3, LocalDate.of(2025, 3, 20),
                "RT003", true);
        RevisionTecnica revision4 = new RevisionTecnica(LocalDate.of(2024, 4, 25), 4, LocalDate.of(2025, 4, 25),
                "RT004", true);
        RevisionTecnica revision5 = new RevisionTecnica(LocalDate.of(2024, 5, 30), 5, LocalDate.of(2025, 5, 30),
                "RT005", false);
        RevisionTecnica revision6 = new RevisionTecnica(LocalDate.of(2024, 6, 12), 6, LocalDate.of(2025, 6, 12),
                "RT006", true);
        RevisionTecnica revision7 = new RevisionTecnica(LocalDate.of(2024, 7, 5), 7, LocalDate.of(2025, 7, 5), "RT007",
                true);
        RevisionTecnica revision8 = new RevisionTecnica(LocalDate.of(2024, 8, 18), 8, LocalDate.of(2025, 8, 18),
                "RT008", false);
        RevisionTecnica revision9 = new RevisionTecnica(LocalDate.of(2024, 9, 22), 9, LocalDate.of(2025, 9, 22),
                "RT009", true);
        RevisionTecnica revision10 = new RevisionTecnica(LocalDate.of(2024, 10, 10), 10, LocalDate.of(2025, 10, 10),
                "RT010", false);

        // Crea Vehiculos
        Moto moto1 = new Moto("Yamaha", "MT-07", "KLJ-233", 6, 220.0, 689.0,
                EnumTransmision.MANUAL, true, 8000.0, 17.0, 5.5, EnumCombustible.GASOLINA);

        Moto moto2 = new Moto("Honda", "CBR500R", "PLM-073", 6, 180.0, 471.0,
                EnumTransmision.MANUAL, true, 6500.0, 15.0, 4.5, EnumCombustible.GASOLINA);
        Camioneta camioneta1 = new Camioneta(
                "Chevrolet", "Tahoe", "DEF234", 8, 250.0, 6.2, EnumTransmision.AUTOMATICA,
                true, 60000.0, 400.0, 3.0, 7, 5, 500, 8, true, true, true, true, true, true, true, true);

        Camioneta camioneta2 = new Camioneta(
                "Ford", "Expedition", "GHI345", 7, 240.0, 5.8, EnumTransmision.MANUAL,
                false, 57000.0, 350.0, 2.8, 7, 5, 450, 7, false, true, true, true, false, true, true, true);

        Camioneta camioneta3 = new Camioneta(
                "Toyota", "Land Cruiser", "JKL678", 8, 270.0, 6.0, EnumTransmision.AUTOMATICA,
                true, 65000.0, 500.0, 3.2, 7, 5, 550, 9, true, true, true, true, true, false, true, true);

        Camioneta camioneta4 = new Camioneta(
                "Nissan", "Armada", "MNO901", 7, 230.0, 5.6, EnumTransmision.MANUAL,
                true, 62000.0, 450.0, 3.0, 8, 5, 600, 8, true, false, true, true, false, true, false, false);

        Camioneta camioneta5 = new Camioneta(
                "Honda", "Pilot", "PQR234", 6, 220.0, 4.5, EnumTransmision.AUTOMATICA,
                true, 54000.0, 420.0, 2.9, 7, 5, 480, 7, false, true, true, true, true, false, true, true);
        PickUp pickUp1 = new PickUp(
                "Ford", "F-150", "LMN789", 6, 180.0, 5.0, EnumTransmision.MANUAL,
                true, 45000.0, true, false, 5, 4, 6, 800, true, true, true, true, true);

        PickUp pickUp2 = new PickUp(
                "Chevrolet", "Silverado", "XYZ123", 6, 200.0, 5.2, EnumTransmision.AUTOMATICA,
                true, 47000.0, false, true, 5, 4, 7, 900, false, true, true, true, false);

        PickUp pickUp3 = new PickUp(
                "RAM", "1500", "DEF456", 6, 190.0, 5.0, EnumTransmision.MANUAL,
                true, 46000.0, true, false, 5, 4, 5, 850, true, false, true, true, true);

        PickUp pickUp4 = new PickUp(
                "Toyota", "Tundra", "ABC789", 6, 210.0, 5.4, EnumTransmision.AUTOMATICA,
                false, 50000.0, false, true, 6, 4, 8, 950, true, true, true, true, true);

        PickUp pickUp5 = new PickUp(
                "Nissan", "Titan", "JKL321", 5, 180.0, 4.8, EnumTransmision.MANUAL,
                true, 42000.0, true, true, 4, 4, 6, 780, false, true, false, true, false);
        Sedan sedan1 = new Sedan(
                "Toyota", "Camry", "ABC456", 6, 220.0, 2.5, EnumTransmision.AUTOMATICA,
                true, 35000.0, 500.0, 2.5, 5, 4, 400, 6, true, true, false, true, true, false, true);

        Sedan sedan2 = new Sedan(
                "Honda", "Accord", "DEF567", 6, 230.0, 2.4, EnumTransmision.AUTOMATICA,
                true, 28000.0, 550.0, 3.0, 5, 4, 450, 8, false, true, true, true, false, true, false);

        Sedan sedan3 = new Sedan(
                "BMW", "Serie 3", "GHI678", 7, 250.0, 3.0, EnumTransmision.AUTOMATICA,
                true, 40000.0, 600.0, 2.8, 5, 4, 500, 7, true, true, true, true, true, true, true);

        Sedan sedan4 = new Sedan(
                "Mercedes-Benz", "Clase E", "JKL789", 7, 240.0, 2.8, EnumTransmision.AUTOMATICA,
                false, 45000.0, 520.0, 2.6, 5, 4, 420, 5, true, false, true, true, true, true, false);

        Sedan sedan5 = new Sedan(
                "Audi", "A6", "MNO890", 6, 220.0, 2.5, EnumTransmision.AUTOMATICA,
                true, 38000.0, 480.0, 2.5, 5, 4, 400, 6, true, false, true, true, false, true, true);
        Deportivo deportivo1 = new Deportivo(
                "Ferrari", "488", "XYZ123", 7, 325.0, 3.9, EnumTransmision.MANUAL,
                true, 250000.0, true, true, 2, 2, 6, 670.0, 3.0, "Deportivo de alto rendimiento");

        Deportivo deportivo2 = new Deportivo(
                "Lamborghini", "Huracan", "ABC789", 6, 330.0, 5.2, EnumTransmision.AUTOMATICA,
                false, 220000.0, true, false, 2, 2, 8, 640.0, 3.2, "Deportivo de lujo");

        Deportivo deportivo3 = new Deportivo(
                "Porsche", "911", "LMN456", 7, 310.0, 3.8, EnumTransmision.MANUAL,
                true, 150000.0, false, true, 2, 2, 6, 560.0, 3.5, "Deportivo clásico");

        Deportivo deportivo4 = new Deportivo(
                "Aston Martin", "Vantage", "JKL321", 6, 290.0, 4.0, EnumTransmision.AUTOMATICA,
                false, 180000.0, true, false, 2, 2, 6, 510.0, 3.9, "Deportivo deportivo");

        Deportivo deportivo5 = new Deportivo(
                "McLaren", "720S", "QRS852", 7, 340.0, 3.8, EnumTransmision.MANUAL,
                true, 300000.0, true, true, 2, 2, 7, 710.0, 2.8, "Supercar de alto rendimiento");

        sistemaConcesionario.agregarVehiculo(moto1);
        sistemaConcesionario.agregarVehiculo(moto2);

        // Transacciones de alquiler
        TransaccionAlquiler alquiler1 = new TransaccionAlquiler("ALQ001", 20);
        TransaccionAlquiler alquiler2 = new TransaccionAlquiler("ALQ002", 25);
        TransaccionAlquiler alquiler3 = new TransaccionAlquiler("ALQ003", 30);
        TransaccionAlquiler alquiler4 = new TransaccionAlquiler("ALQ004", 35);
        TransaccionAlquiler alquiler5 = new TransaccionAlquiler("ALQ005", 40);
        TransaccionAlquiler alquiler6 = new TransaccionAlquiler("ALQ006", 45);
        TransaccionAlquiler alquiler7 = new TransaccionAlquiler("ALQ007", 50);

        // Transacciones de compra
        TransaccionCompra compra1 = new TransaccionCompra("CMP001");
        TransaccionCompra compra2 = new TransaccionCompra("CMP002");
        TransaccionCompra compra3 = new TransaccionCompra("CMP003");
        TransaccionCompra compra4 = new TransaccionCompra("CMP004");
        TransaccionCompra compra5 = new TransaccionCompra("CMP005");
        TransaccionCompra compra6 = new TransaccionCompra("CMP006");
        TransaccionCompra compra7 = new TransaccionCompra("CMP007");

        // Transacciones de venta
        TransaccionVenta venta1 = new TransaccionVenta("VTA001");
        TransaccionVenta venta2 = new TransaccionVenta("VTA002");
        TransaccionVenta venta3 = new TransaccionVenta("VTA003");
        TransaccionVenta venta4 = new TransaccionVenta("VTA004");
        TransaccionVenta venta5 = new TransaccionVenta("VTA005");
        TransaccionVenta venta6 = new TransaccionVenta("VTA006");
        TransaccionVenta venta7 = new TransaccionVenta("VTA007");

        // Procesar las transacciones
        alquiler1.procesar(sistemaConcesionario, cliente3, moto2, empleado7);
        alquiler2.procesar(sistemaConcesionario, cliente1, camioneta5, empleado4);
        alquiler3.procesar(sistemaConcesionario, cliente5, sedan1, empleado2);
        alquiler4.procesar(sistemaConcesionario, cliente2, pickUp1, empleado5);
        alquiler5.procesar(sistemaConcesionario, cliente6, camioneta1, empleado3);
        alquiler6.procesar(sistemaConcesionario, cliente4, deportivo1, empleado1);
        alquiler7.procesar(sistemaConcesionario, cliente7, camioneta3, empleado8);

        moto1.revisionTecnica(revision10);
        deportivo4.revisionTecnica(revision9);
        camioneta2.revisionTecnica(revision8);
        pickUp2.revisionTecnica(revision7);
        deportivo2.revisionTecnica(revision6);
        sedan5.revisionTecnica(revision5);
        sedan2.revisionTecnica(revision3);
        compra1.procesar(sistemaConcesionario, cliente1, moto1, empleado2);
        compra2.procesar(sistemaConcesionario, cliente2, deportivo4, empleado3);
        compra3.procesar(sistemaConcesionario, cliente3, camioneta2, empleado4);
        compra4.procesar(sistemaConcesionario,cliente4, pickUp2, empleado5);
        compra5.procesar(sistemaConcesionario, cliente5, deportivo2, empleado6);
        compra6.procesar(sistemaConcesionario, cliente6, sedan5, empleado7);
        compra7.procesar(sistemaConcesionario, cliente7, sedan2, empleado8);

        venta1.procesar(sistemaConcesionario, cliente1, moto2, empleado3);
        venta2.procesar(sistemaConcesionario, cliente2, camioneta1, empleado4);
        venta3.procesar(sistemaConcesionario, cliente3, pickUp1, empleado5);
        venta4.procesar(sistemaConcesionario, cliente4, deportivo1, empleado6);
        venta5.procesar(sistemaConcesionario, cliente5, sedan1, empleado7);
        venta6.procesar(sistemaConcesionario, cliente6, pickUp3, empleado8);
        venta7.procesar(sistemaConcesionario, cliente7, sedan1, empleado2);

        // Crear la lista de vehículos en espera
        List<Vehiculo> ListaVehiculosEnEspera = new ArrayList<>();

        // Crear vehículos
        Van van1 = new Van(
                "Ford", "Transit", "ABC123", 5, 180.0, 2.3, EnumTransmision.AUTOMATICA,
                true, 30000.0, 70.0, 12.0, EnumCombustible.GASOLINA,
                15, 4, 800, 6, true, true, true, true);
        Van van2 = new Van(
                "Mercedes", "Sprinter", "DEF456", 6, 160.0, 2.2, EnumTransmision.MANUAL,
                false, 35000.0, 75.0, 13.5, EnumCombustible.DIESEL,
                12, 4, 900, 8, true, false, true, true);
        Camion camion1 = new Camion(
                "Volvo", "FH", "GHI789", 6, 120.0, 13.0, EnumTransmision.AUTOMATICA,
                true, 70000.0, true, false, 18000, 4, true, true, true, EnumTipoCamion.CISTERNA);
        Camion camion2 = new Camion(
                "Scania", "R500", "JKL012", 6, 130.0, 12.5, EnumTransmision.MANUAL,
                false, 75000.0, false, true, 20000, 3, true, true, true, EnumTipoCamion.CARGAPESADA);
        Bus bus1 = new Bus(
                "Mercedes", "Citaro", "MNO345", 8, 100.0, 6.0, EnumTransmision.AUTOMATICA,
                true, 150000.0, 300.0, 2.5, 50, 4, 1000, 10, 2, 3, true, true, true);
        Bus bus2 = new Bus(
                "Volvo", "7900", "PQR678", 7, 90.0, 5.5, EnumTransmision.MANUAL,
                false, 120000.0, 280.0, 2.8, 45, 4, 950, 9, 2, 4, false, true, true);

        // Añadir los vehículos a la lista
        ListaVehiculosEnEspera.add(van1);
        ListaVehiculosEnEspera.add(van2);
        ListaVehiculosEnEspera.add(camion1);
        ListaVehiculosEnEspera.add(camion2);
        ListaVehiculosEnEspera.add(bus1);
        ListaVehiculosEnEspera.add(bus2);

        openPrimaryView();
    }

    /*
     * No Modificar
     * Abre la ventana Principal
     */
    private void openPrimaryView() {
        try {
            primaryStage.setResizable(false);
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
     * Abre la ventana Principal de Empleado
     */
    public void openSecondaryEmpleadoView() {
        primaryStage.setResizable(true);
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
     * Abre la venta de inicio de Sesion de empleado
     */
    public void openLoginEmpleadoView() {
        primaryStage.setResizable(false);
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
     * Abre la Ventana de Inicio de Administrador
     */
    public void openLoginAdmView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LoginAdm.fxml"));
            Scene scene = new Scene(loader.load());

            LoginAdmView loginAdmView = loader.getController();
            loginAdmView.setApp(this);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * No Modificar
     * Abre la Ventana principal de Administrador
     */
    public void openSecondaryAdmView() {
        primaryStage.setResizable(true);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryAdm.fxml"));
            Scene scene = new Scene(loader.load());

            SecondaryAdmView secondaryAdmView = loader.getController();

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
