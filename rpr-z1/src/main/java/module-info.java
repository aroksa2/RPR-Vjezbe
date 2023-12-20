module com.example.rprz1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rprz1 to javafx.fxml;
    exports com.example.rprz1;
}