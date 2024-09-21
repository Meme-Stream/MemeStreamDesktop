package com.memestream.desktop;

import com.memestream.desktop.utils.Theme;
import com.memestream.desktop.utils.ThemeManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final var loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("main-view.fxml")));
        final var scene = new Scene(loader.load(), 800, 600);
        ThemeManager.setTheme(scene, Theme.LIGHT);
        stage.setScene(scene);
        stage.setTitle("MemeStream");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
