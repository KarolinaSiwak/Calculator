module com.example.karolina {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.karolina to javafx.fxml;
    exports com.example.karolina;
}