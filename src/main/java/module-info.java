module com.memestream.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens com.memestream.desktop.controller to javafx.fxml;
    exports com.memestream.desktop;
}