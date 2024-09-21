module com.memestream.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires com.fasterxml.jackson.databind;

    opens com.memestream.desktop.controller to javafx.fxml;
    opens com.memestream.desktop.model to com.fasterxml.jackson.databind;
    exports com.memestream.desktop;
}