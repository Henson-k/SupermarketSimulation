module com.example.supermarketsimulation {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.supermarketsimulation to javafx.fxml;
    exports com.example.supermarketsimulation;
}