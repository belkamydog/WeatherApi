module com.example.weather {
    requires javafx.controls;
    requires javafx.fxml;


//    opens visual to javafx.fxml;
    exports Application;
    opens Application to javafx.fxml;
//    exports controller;
    opens controller to javafx.fxml;
}