module com.memestream.desktop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.memestream.desktop.controller to javafx.fxml;
    exports com.memestream.desktop;
}