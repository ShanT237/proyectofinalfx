module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.edu.uniquindio.poo to javafx.fxml;
    opens co.edu.uniquindio.poo.view to javafx.fxml; // Abre el paquete de la vista para JavaFX
    exports co.edu.uniquindio.poo;
}