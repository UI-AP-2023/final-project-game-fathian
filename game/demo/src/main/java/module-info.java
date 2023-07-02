module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.controller;
    opens com.example.demo.controller to javafx.fxml;
    exports com.example.demo.PageController;
    opens com.example.demo.PageController to javafx.fxml;
    exports com.example.demo.model.exception;
    opens com.example.demo.model.exception to javafx.fxml;
    exports com.example.demo.model;
    opens com.example.demo.model to javafx.fxml;
}