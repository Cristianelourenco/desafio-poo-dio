module com.example.diopoo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.diopoo to javafx.fxml;
    exports com.example.diopoo;
}