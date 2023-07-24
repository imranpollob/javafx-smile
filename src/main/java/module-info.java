module com.example.face {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.face to javafx.fxml;
    exports com.example.face;
}