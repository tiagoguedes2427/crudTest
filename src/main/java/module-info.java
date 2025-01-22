module com.tiago.democrudtiago {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tiago.democrudtiago to javafx.fxml;
    exports com.tiago.democrudtiago to javafx.graphics;
}