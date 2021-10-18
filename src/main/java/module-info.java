module com.example.portfolio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.portfolio2 to javafx.fxml;
    exports com.example.portfolio2;
}