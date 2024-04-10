module com.example.moreexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.moreexample to javafx.fxml;
    exports com.example.moreexample;
    exports com.example.moreexample.Controller;
    opens com.example.moreexample.Controller to javafx.fxml;
}