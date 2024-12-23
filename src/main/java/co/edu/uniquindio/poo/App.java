package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;



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
import co.edu.uniquindio.poo.model.TAlquiler;
import co.edu.uniquindio.poo.model.TCompra;
import co.edu.uniquindio.poo.model.TVenta;
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
        private Empleado empleadoAutenticado;
        private LinkedList<Vehiculo> listaDeEspera = new LinkedList<>();

        @SuppressWarnings("exports")
        public Stage getPrimaryStage() {
                return primaryStage;
        }

        public void setPrimaryStage(@SuppressWarnings("exports") Stage primaryStage) {
                this.primaryStage = primaryStage;
        }

        public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
                this.sistemaConcesionario = sistemaConcesionario;
        }

        public ObservableList<Vehiculo> getListaDeEspera() {
                return FXCollections.observableArrayList(listaDeEspera);
        }

        public void setListaDeEspera(LinkedList<Vehiculo> listaDeEspera) {
                this.listaDeEspera = listaDeEspera;
        }

        public SistemaConcesionario getSistemaConcesionario() {
                return sistemaConcesionario;
        }

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
        public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {
                this.primaryStage = primaryStage;
                this.primaryStage.setTitle("Sistema Concesionario");
                Image icono = new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/MediaFx/S.png"));
                primaryStage.getIcons().add(icono);
                RegistroTransacciones registro = new RegistroTransacciones(LocalDate.now());

                // Crea el Administrador
                Administrador adm1 = new Administrador(
                                "Santiago", "007", "Shant", "pass007", "Squirrel77",
                                "shant.com", "3201234567");

                // Crear empleados
                Empleado empleado1 = new Empleado("Santiago Torres", "007", "Shant", "pass007", "Sparrot", "shant.com",
                                "Gerente", "3101112233");
                Empleado empleado2 = new Empleado("Ana Lopez", "E002", "anaL", "pass002", "sol",
                                "ana.lopez@tuCarroUQ.com",
                                "Compras", "3102223344");
                Empleado empleado3 = new Empleado("Luis Martinez", "E003", "luisM", "pass003", "mar",
                                "luis.martinez@tuCarroUQ.com", "Alquiler", "3103334455");
                Empleado empleado4 = new Empleado("Maria Rodriguez", "E004", "mariaR", "pass004", "luna",
                                "maria.rodriguez@tuCarroUQ.com", "Ventas", "3104445566");
                Empleado empleado5 = new Empleado("Pedro Sanchez", "E005", "pedroS", "pass005", "estrella",
                                "pedro.sanchez@tuCarroUQ.com", "Compras", "3105556677");
                Empleado empleado6 = new Empleado("Laura Castro", "E006", "lauraC", "pass006", "nube",
                                "laura.castro@tuCarroUQ.com", "Alquiler", "3106667788");
                Empleado empleado7 = new Empleado("Jose Torres", "E007", "joseT", "pass007", "rio",
                                "jose.torres@tuCarroUQ.com",
                                "Ventas", "3107778899");

                // Crear clientes
                Cliente cliente1 = new Cliente("Andrea Diaz", "C001", "andreaD", "clientpass1", "flor",
                                "andrea.diaz@gmail.com",
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
                Cliente cliente7 = new Cliente("Luisa Peña", "C007", "luisaP", "clientpass7", "sol",
                                "luisa.pena@gmail.com",
                                "Calle 13 #20-30", "3207778899");
                Cliente cliente8 = new Cliente("Mario Torres", "C008", "marioT", "clientpass8", "mar",
                                "mario.torres@gmail.com",
                                "Avenida 35 #8-20", "3208889900");
                Cliente cliente9 = new Cliente("Camila Soto", "C009", "camilaS", "clientpass9", "luz",
                                "camila.soto@gmail.com",
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

                sistemaConcesionario = new SistemaConcesionario("Concesionaria Shane", adm1, registro);
                // Agregar empleados al sistema
                sistemaConcesionario.agregarEmpleado(empleado1);
                sistemaConcesionario.agregarEmpleado(empleado2);
                sistemaConcesionario.agregarEmpleado(empleado3);
                sistemaConcesionario.agregarEmpleado(empleado4);
                sistemaConcesionario.agregarEmpleado(empleado5);
                sistemaConcesionario.agregarEmpleado(empleado6);
                sistemaConcesionario.agregarEmpleado(empleado7);
                sistemaConcesionario.agregarEmpleado(empleado8);
                sistemaConcesionario.agregarEmpleado(empleado9);
                sistemaConcesionario.agregarEmpleado(empleado10);
                sistemaConcesionario.agregarEmpleado(empleado11);
                sistemaConcesionario.agregarEmpleado(empleado12);
                sistemaConcesionario.agregarEmpleado(empleado13);
                sistemaConcesionario.agregarEmpleado(empleado14);
                sistemaConcesionario.agregarEmpleado(empleado15);

                sistemaConcesionario.agregarCliente(cliente1);
                sistemaConcesionario.agregarCliente(cliente2);
                sistemaConcesionario.agregarCliente(cliente3);
                sistemaConcesionario.agregarCliente(cliente4);
                sistemaConcesionario.agregarCliente(cliente5);
                sistemaConcesionario.agregarCliente(cliente6);
                sistemaConcesionario.agregarCliente(cliente7);
                sistemaConcesionario.agregarCliente(cliente8);
                sistemaConcesionario.agregarCliente(cliente9);
                sistemaConcesionario.agregarCliente(cliente10);
                sistemaConcesionario.agregarCliente(cliente11);
                sistemaConcesionario.agregarCliente(cliente12);
                sistemaConcesionario.agregarCliente(cliente13);
                sistemaConcesionario.agregarCliente(cliente14);
                sistemaConcesionario.agregarCliente(cliente15);

                // Revisiones Tecnicas
                @SuppressWarnings("unused")
                RevisionTecnica revision1 = new RevisionTecnica(LocalDate.of(2024, 1, 10), 1, LocalDate.of(2025, 1, 10),
                                "RT001", true);
                @SuppressWarnings("unused")
                RevisionTecnica revision2 = new RevisionTecnica(LocalDate.of(2024, 2, 15), 2, LocalDate.of(2025, 2, 15),
                                "RT002", true);
                RevisionTecnica revision3 = new RevisionTecnica(LocalDate.of(2024, 3, 20), 3, LocalDate.of(2025, 3, 20),
                                "RT003", true);
                @SuppressWarnings("unused")
                RevisionTecnica revision4 = new RevisionTecnica(LocalDate.of(2024, 4, 25), 4, LocalDate.of(2025, 4, 25),
                                "RT004", true);
                RevisionTecnica revision5 = new RevisionTecnica(LocalDate.of(2024, 5, 30), 5, LocalDate.of(2025, 5, 30),
                                "RT005", true);
                RevisionTecnica revision6 = new RevisionTecnica(LocalDate.of(2024, 6, 12), 6, LocalDate.of(2025, 6, 12),
                                "RT006", true);
                RevisionTecnica revision7 = new RevisionTecnica(LocalDate.of(2024, 7, 5), 7, LocalDate.of(2025, 7, 5),
                                "RT007",
                                true);
                RevisionTecnica revision8 = new RevisionTecnica(LocalDate.of(2024, 8, 18), 8, LocalDate.of(2025, 8, 18),
                                "RT008", true);
                RevisionTecnica revision9 = new RevisionTecnica(LocalDate.of(2024, 9, 22), 9, LocalDate.of(2025, 9, 22),
                                "RT009", true);
                RevisionTecnica revision10 = new RevisionTecnica(LocalDate.of(2024, 10, 10), 10,
                                LocalDate.of(2025, 10, 10),
                                "RT010", true);

                // Crea Vehiculos
                Moto moto1 = new Moto("Yamaha", "MT-07", "KLJ-233", 6, 220.0, 689.0,
                                EnumTransmision.MANUAL, true, 8000.0, 17.0, 5.5, EnumCombustible.GASOLINA);

                Moto moto2 = new Moto("Honda", "CBR500R", "PLM-073", 6, 180.0, 471.0,
                                EnumTransmision.MANUAL, true, 6500.0, 15.0, 4.5, EnumCombustible.GASOLINA);
                Camioneta camioneta1 = new Camioneta(
                                "Chevrolet", "Tahoe", "DEF234", 8, 250.0, 6.2, EnumTransmision.AUTOMATICA,
                                true, 60000.0, 400.0, 3.0, 7, 5, 500, 8, true, true, true, true, true, true, true,
                                true);

                Camioneta camioneta2 = new Camioneta(
                                "Ford", "Expedition", "GHI345", 7, 240.0, 5.8, EnumTransmision.MANUAL,
                                false, 57000.0, 350.0, 2.8, 7, 5, 450, 7, false, true, true, true, false, true, true,
                                true);

                Camioneta camioneta3 = new Camioneta(
                                "Toyota", "Land Cruiser", "JKL678", 8, 270.0, 6.0, EnumTransmision.AUTOMATICA,
                                true, 65000.0, 500.0, 3.2, 7, 5, 550, 9, true, true, true, true, true, false, true,
                                true);

                Camioneta camioneta4 = new Camioneta(
                                "Nissan", "Armada", "MNO901", 7, 230.0, 5.6, EnumTransmision.MANUAL,
                                true, 62000.0, 450.0, 3.0, 8, 5, 600, 8, true, false, true, true, false, true, false,
                                false);

                Camioneta camioneta5 = new Camioneta(
                                "Honda", "Pilot", "PQR234", 6, 220.0, 4.5, EnumTransmision.AUTOMATICA,
                                true, 54000.0, 420.0, 2.9, 7, 5, 480, 7, false, true, true, true, true, false, true,
                                true);
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

                Camion camion1 = new Camion("Volvo", "FH16", "ABC123", 12, 120.0, 16.1,
                                EnumTransmision.AUTOMATICA, true, 150000.0,
                                true, false, 20000, 4, true, true, true,
                                EnumTipoCamion.ARTICULADO);

                Camion camion2 = new Camion("Mercedes", "Actros", "DEF456", 10, 110.0, 15.0,
                                EnumTransmision.MANUAL, false, 130000.0,
                                false, true, 18000, 3, false, true, false,
                                EnumTipoCamion.CISTERNA);

                // Crear nuevos vehículos
                Moto moto3 = new Moto("Suzuki", "GSX-R750", "XYZ789", 6, 240.0, 750.0,
                                EnumTransmision.MANUAL, true, 9000.0, 16.0, 5.0, EnumCombustible.GASOLINA);

                Moto moto4 = new Moto("Kawasaki", "Ninja ZX-6R", "LMN456", 6, 250.0, 636.0,
                                EnumTransmision.MANUAL, true, 9500.0, 17.0, 4.8, EnumCombustible.GASOLINA);

                Camioneta camioneta6 = new Camioneta(
                                "Jeep", "Grand Cherokee", "OPQ123", 8, 260.0, 6.4, EnumTransmision.AUTOMATICA,
                                true, 70000.0, 450.0, 3.5, 7, 5, 550, 9, true, true, true, true, true, true, true,
                                true);

                Camioneta camioneta7 = new Camioneta(
                                "Hyundai", "Santa Fe", "RST456", 6, 230.0, 3.5, EnumTransmision.AUTOMATICA,
                                true, 55000.0, 400.0, 3.0, 7, 5, 500, 8, true, true, true, true, true, true, true,
                                true);

                PickUp pickUp6 = new PickUp(
                                "GMC", "Sierra", "UVW789", 6, 200.0, 5.3, EnumTransmision.AUTOMATICA,
                                true, 48000.0, true, true, 5, 4, 7, 900, true, true, true, true, true);

                PickUp pickUp7 = new PickUp(
                                "Toyota", "Hilux", "XYZ012", 6, 190.0, 4.0, EnumTransmision.MANUAL,
                                true, 42000.0, false, true, 5, 4, 6, 850, true, true, true, true, true);

                Sedan sedan6 = new Sedan(
                                "Kia", "Optima", "ABC345", 6, 210.0, 2.4, EnumTransmision.AUTOMATICA,
                                true, 32000.0, 450.0, 2.5, 5, 4, 400, 6, true, true, true, true, true, true, true);

                Sedan sedan7 = new Sedan(
                                "Mazda", "6", "DEF678", 6, 220.0, 2.5, EnumTransmision.AUTOMATICA,
                                true, 34000.0, 470.0, 2.6, 5, 4, 420, 7, true, true, true, true, true, true, true);

                Deportivo deportivo6 = new Deportivo(
                                "Chevrolet", "Corvette", "GHI901", 7, 320.0, 6.2, EnumTransmision.MANUAL,
                                true, 70000.0, true, true, 2, 2, 8, 650.0, 3.0, "Deportivo de alto rendimiento");

                Deportivo deportivo7 = new Deportivo(
                                "Ford", "Mustang", "JKL234", 6, 300.0, 5.0, EnumTransmision.AUTOMATICA,
                                true, 55000.0, true, false, 2, 2, 6, 450.0, 3.5, "Deportivo clásico");

                Camion camion3 = new Camion("MAN", "TGX", "MNO567", 12, 115.0, 15.5,
                                EnumTransmision.AUTOMATICA, true, 140000.0,
                                true, false, 19000, 4, true, true, true,
                                EnumTipoCamion.ARTICULADO);

                Camion camion4 = new Camion("DAF", "XF", "PQR890", 10, 125.0, 14.0,
                                EnumTransmision.MANUAL, false, 135000.0,
                                false, true, 18500, 3, false, true, false,
                                EnumTipoCamion.CISTERNA);

                Van van3 = new Van(
                                "Renault", "Trafic", "STU123", 5, 170.0, 2.0, EnumTransmision.AUTOMATICA,
                                true, 32000.0, 65.0, 11.0, EnumCombustible.GASOLINA,
                                14, 4, 850, 7, true, true, true, true);

                Van van4 = new Van(
                                "Peugeot", "Boxer", "VWX456", 6, 150.0, 2.2, EnumTransmision.MANUAL,
                                false, 36000.0, 70.0, 12.5, EnumCombustible.DIESEL,
                                13, 4, 950, 9, true, false, true, true);

                Bus bus3 = new Bus(
                                "Iveco", "Daily", "YZA789", 8, 95.0, 5.8, EnumTransmision.AUTOMATICA,
                                true, 140000.0, 290.0, 2.6, 48, 4, 980, 9, 2, 3, true, true, true);

                Bus bus4 = new Bus(
                                "Scania", "Citywide", "BCD012", 7, 85.0, 5.3, EnumTransmision.MANUAL,
                                false, 125000.0, 270.0, 2.9, 42, 4, 930, 8, 2, 4, false, true, true);

                // Agregar los nuevos vehículos al sistema
                sistemaConcesionario.agregarVehiculo(moto3);
                sistemaConcesionario.agregarVehiculo(moto4);
                sistemaConcesionario.agregarVehiculo(camioneta6);
                sistemaConcesionario.agregarVehiculo(camioneta7);
                sistemaConcesionario.agregarVehiculo(pickUp6);
                sistemaConcesionario.agregarVehiculo(pickUp7);
                sistemaConcesionario.agregarVehiculo(sedan6);
                sistemaConcesionario.agregarVehiculo(sedan7);
                sistemaConcesionario.agregarVehiculo(deportivo6);
                sistemaConcesionario.agregarVehiculo(deportivo7);
                sistemaConcesionario.agregarVehiculo(camion3);
                sistemaConcesionario.agregarVehiculo(camion4);
                sistemaConcesionario.agregarVehiculo(van3);
                sistemaConcesionario.agregarVehiculo(van4);
                sistemaConcesionario.agregarVehiculo(bus3);
                sistemaConcesionario.agregarVehiculo(bus4);

                sistemaConcesionario.agregarVehiculo(moto1);
                sistemaConcesionario.agregarVehiculo(moto2);
                // Camionetas
                sistemaConcesionario.agregarVehiculo(camioneta1);
                sistemaConcesionario.agregarVehiculo(camioneta2);
                sistemaConcesionario.agregarVehiculo(camioneta3);
                sistemaConcesionario.agregarVehiculo(camioneta4);
                sistemaConcesionario.agregarVehiculo(camioneta5);

                sistemaConcesionario.agregarVehiculo(camion1);
                sistemaConcesionario.agregarVehiculo(camion2);

                // PickUps
                sistemaConcesionario.agregarVehiculo(pickUp1);
                sistemaConcesionario.agregarVehiculo(pickUp2);
                sistemaConcesionario.agregarVehiculo(pickUp3);
                sistemaConcesionario.agregarVehiculo(pickUp4);
                sistemaConcesionario.agregarVehiculo(pickUp5);

                // Sedanes
                sistemaConcesionario.agregarVehiculo(sedan1);
                sistemaConcesionario.agregarVehiculo(sedan2);
                sistemaConcesionario.agregarVehiculo(sedan3);
                sistemaConcesionario.agregarVehiculo(sedan4);
                sistemaConcesionario.agregarVehiculo(sedan5);

                // Deportivos
                sistemaConcesionario.agregarVehiculo(deportivo1);
                sistemaConcesionario.agregarVehiculo(deportivo2);
                sistemaConcesionario.agregarVehiculo(deportivo3);
                sistemaConcesionario.agregarVehiculo(deportivo4);
                sistemaConcesionario.agregarVehiculo(deportivo5);

                // Transacciones de alquiler
                TAlquiler alquiler1 = new TAlquiler("ALQ001", 20);
                TAlquiler alquiler2 = new TAlquiler("ALQ002", 25);
                TAlquiler alquiler3 = new TAlquiler("ALQ003", 30);
                TAlquiler alquiler4 = new TAlquiler("ALQ004", 35);
                TAlquiler alquiler5 = new TAlquiler("ALQ005", 40);
                TAlquiler alquiler6 = new TAlquiler("ALQ006", 45);
                TAlquiler alquiler7 = new TAlquiler("ALQ007", 50);

                // Transacciones de compra
                TCompra compra1 = new TCompra("CMP001");
                TCompra compra2 = new TCompra("CMP002");
                TCompra compra3 = new TCompra("CMP003");
                TCompra compra4 = new TCompra("CMP004");
                TCompra compra5 = new TCompra("CMP005");
                TCompra compra6 = new TCompra("CMP006");
                TCompra compra7 = new TCompra("CMP007");

                // Transacciones de venta
                TVenta venta1 = new TVenta("VTA001");
                TVenta venta2 = new TVenta("VTA002");
                TVenta venta3 = new TVenta("VTA003");
                TVenta venta4 = new TVenta("VTA004");
                TVenta venta5 = new TVenta("VTA005");
                TVenta venta6 = new TVenta("VTA006");
                TVenta venta7 = new TVenta("VTA007");

                // Crear nuevas transacciones de compra
                TCompra compra8 = new TCompra("CMP008");
                TCompra compra9 = new TCompra("CMP009");
                TCompra compra10 = new TCompra("CMP010");
                TCompra compra11 = new TCompra("CMP011");
                TCompra compra12 = new TCompra("CMP012");

                // Crear nuevas transacciones de venta
                TVenta venta8 = new TVenta("VTA008");
                TVenta venta9 = new TVenta("VTA009");
                TVenta venta10 = new TVenta("VTA010");
                TVenta venta11 = new TVenta("VTA011");
                TVenta venta12 = new TVenta("VTA012");

                // Crear nuevas transacciones de alquiler
                TAlquiler alquiler8 = new TAlquiler("ALQ008", 55);
                TAlquiler alquiler9 = new TAlquiler("ALQ009", 60);
                TAlquiler alquiler10 = new TAlquiler("ALQ010", 65);
                TAlquiler alquiler11 = new TAlquiler("ALQ011", 70);
                TAlquiler alquiler12 = new TAlquiler("ALQ012", 75);

                // Procesar las nuevas transacciones de compra
                compra8.procesar(sistemaConcesionario, cliente8, camioneta4, empleado9);
                compra9.procesar(sistemaConcesionario, cliente9, pickUp4, empleado10);
                compra10.procesar(sistemaConcesionario, cliente10, sedan3, empleado11);
                compra11.procesar(sistemaConcesionario, cliente11, deportivo3, empleado12);
                compra12.procesar(sistemaConcesionario, cliente12, camion2, empleado13);

                // Procesar las nuevas transacciones de venta
                venta8.procesar(sistemaConcesionario, cliente8, camioneta5, empleado9);
                venta9.procesar(sistemaConcesionario, cliente9, pickUp5, empleado10);
                venta10.procesar(sistemaConcesionario, cliente10, sedan4, empleado11);
                venta11.procesar(sistemaConcesionario, cliente11, deportivo4, empleado12);
                venta12.procesar(sistemaConcesionario, cliente12, camion1, empleado13);

                // Procesar las nuevas transacciones de alquiler
                alquiler8.procesar(sistemaConcesionario, cliente8, van3, empleado9);
                alquiler9.procesar(sistemaConcesionario, cliente9, van4, empleado10);
                alquiler10.procesar(sistemaConcesionario, cliente10, bus4, empleado11);
                alquiler11.procesar(sistemaConcesionario, cliente11, bus3, empleado12);
                alquiler12.procesar(sistemaConcesionario, cliente12, moto1, empleado13);

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
                compra1.procesar(sistemaConcesionario, cliente1, moto1, empleado1);
                compra2.procesar(sistemaConcesionario, cliente2, deportivo4, empleado3);
                compra3.procesar(sistemaConcesionario, cliente3, camioneta2, empleado4);
                compra4.procesar(sistemaConcesionario, cliente4, pickUp2, empleado5);
                compra5.procesar(sistemaConcesionario, cliente5, deportivo2, empleado6);
                compra6.procesar(sistemaConcesionario, cliente6, sedan5, empleado7);
                compra7.procesar(sistemaConcesionario, cliente7, sedan2, empleado8);

                venta1.procesar(sistemaConcesionario, cliente1, moto2, empleado1);
                venta2.procesar(sistemaConcesionario, cliente2, camioneta1, empleado4);
                venta3.procesar(sistemaConcesionario, cliente3, pickUp1, empleado5);
                venta4.procesar(sistemaConcesionario, cliente4, deportivo1, empleado6);
                venta5.procesar(sistemaConcesionario, cliente5, sedan1, empleado7);
                venta6.procesar(sistemaConcesionario, cliente6, pickUp3, empleado8);
                venta7.procesar(sistemaConcesionario, cliente7, sedan1, empleado2);

                // Crear vehículos
                Van van1 = new Van(
                                "Ford", "Transit", "ABC123", 5, 180.0, 2.3, EnumTransmision.AUTOMATICA,
                                true, 30000.0, 70.0, 12.0, EnumCombustible.GASOLINA,
                                15, 4, 800, 6, true, true, true, true);
                Van van2 = new Van(
                                "Mercedes", "Sprinter", "DEF456", 6, 160.0, 2.2, EnumTransmision.MANUAL,
                                false, 35000.0, 75.0, 13.5, EnumCombustible.DIESEL,
                                12, 4, 900, 8, true, false, true, true);
                Bus bus1 = new Bus(
                                "Mercedes", "Citaro", "MNO345", 8, 100.0, 6.0, EnumTransmision.AUTOMATICA,
                                true, 150000.0, 300.0, 2.5, 50, 4, 1000, 10, 2, 3, true, true, true);
                Bus bus2 = new Bus(
                                "Volvo", "7900", "PQR678", 7, 90.0, 5.5, EnumTransmision.MANUAL,
                                false, 120000.0, 280.0, 2.8, 45, 4, 950, 9, 2, 4, false, true, true);

                // Añadir los vehículos a la lista de espera
                listaDeEspera.add(van1);
                listaDeEspera.add(van2);
                listaDeEspera.add(bus1);
                listaDeEspera.add(bus2);

                // Crear 10 nuevos vehículos
                Van van5 = new Van(
                                "Fiat", "Ducato", "EFG123", 5, 160.0, 2.3, EnumTransmision.AUTOMATICA,
                                true, 31000.0, 68.0, 11.5, EnumCombustible.GASOLINA,
                                14, 4, 820, 7, true, true, true, true);

                Van van6 = new Van(
                                "Citroën", "Jumper", "HIJ456", 6, 155.0, 2.2, EnumTransmision.MANUAL,
                                false, 33000.0, 72.0, 12.8, EnumCombustible.DIESEL,
                                13, 4, 870, 8, true, false, true, true);

                Bus bus5 = new Bus(
                                "MAN", "Lion's City", "KLM789", 8, 95.0, 5.9, EnumTransmision.AUTOMATICA,
                                true, 145000.0, 295.0, 2.7, 49, 4, 970, 9, 2, 3, true, true, true);

                Bus bus6 = new Bus(
                                "Solaris", "Urbino", "NOP012", 7, 88.0, 5.4, EnumTransmision.MANUAL,
                                false, 118000.0, 275.0, 2.9, 44, 4, 920, 8, 2, 4, false, true, true);

                Moto moto5 = new Moto("Ducati", "Monster", "QRS345", 6, 230.0, 821.0,
                                EnumTransmision.MANUAL, true, 12000.0, 18.0, 6.0, EnumCombustible.GASOLINA);

                Moto moto6 = new Moto("BMW", "S1000RR", "TUV678", 6, 299.0, 999.0,
                                EnumTransmision.MANUAL, true, 15000.0, 16.5, 5.8, EnumCombustible.GASOLINA);

                Camion camion5 = new Camion("Scania", "R500", "WXY901", 12, 130.0, 16.5,
                                EnumTransmision.AUTOMATICA, true, 155000.0,
                                true, false, 21000, 4, true, true, true,
                                EnumTipoCamion.ARTICULADO);

                Camion camion6 = new Camion("Iveco", "Stralis", "ZAB234", 10, 115.0, 14.5,
                                EnumTransmision.MANUAL, false, 140000.0,
                                false, true, 19500, 3, false, true, false,
                                EnumTipoCamion.CISTERNA);

                PickUp pickUp8 = new PickUp(
                                "Isuzu", "D-Max", "CDE567", 6, 185.0, 3.0, EnumTransmision.AUTOMATICA,
                                true, 43000.0, true, true, 5, 4, 6, 820, true, true, true, true, true);

                Sedan sedan8 = new Sedan(
                                "Hyundai", "Sonata", "FGH890", 6, 215.0, 2.0, EnumTransmision.AUTOMATICA,
                                true, 31000.0, 460.0, 2.4, 5, 4, 390, 6, true, true, true, true, true, true, true);

                adm1.crearReporte(empleado15);
                adm1.crearReporte(empleado1);
                adm1.crearReporte(empleado2);
                // Añadir los nuevos vehículos a la lista de espera
                listaDeEspera.add(van5);
                listaDeEspera.add(van6);
                listaDeEspera.add(bus5);
                listaDeEspera.add(bus6);
                listaDeEspera.add(moto5);
                listaDeEspera.add(moto6);
                listaDeEspera.add(camion5);
                listaDeEspera.add(camion6);
                listaDeEspera.add(pickUp8);
                listaDeEspera.add(sedan8);
                System.out.println(empleado1.getTransacciones().size());
                openPrimaryView();

        }

        /*
         * No Modificar
         * Abre la ventana Principal
         */
        public void openPrimaryView() {
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
                primaryStage.close();
                try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryEmpleado.fxml"));

                        Scene scene = new Scene(loader.load());

                        SecondaryEmpleadoView view = loader.getController();
                        view.setApp(this);

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
                primaryStage.close();
                try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryAdm.fxml"));

                        Scene scene = new Scene(loader.load());

                        SecondaryAdmView view = loader.getController();
                        view.setApp(this);

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
