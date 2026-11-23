module org.example.busuhrserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.busuhrserver to javafx.fxml;
    exports org.example.busuhrserver;
}