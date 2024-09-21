package com.memestream.desktop;

import com.memestream.desktop.utils.Theme;
import com.memestream.desktop.utils.ThemeManager;
import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final var loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("main-view.fxml")));
        final var scene = new Scene(loader.load(), 800, 600);
        stage.setScene(scene);
        stage.setTitle("MemeStream");
        syncIconsAndThemes();
        stage.show();
    }

    private void syncIconsAndThemes() {
        Window.getWindows().addListener((ListChangeListener<? super Window>) change -> {
            while (change.next()) {
                if (change.wasAdded()) {
                    for (Window window : change.getAddedSubList()) {
                        if (window instanceof Stage stage) {
                            stage.getIcons().addAll(
                                    new Image(Objects.requireNonNull(getClass().getResourceAsStream("icon/icon128x128.png"))),
                                    new Image(Objects.requireNonNull(getClass().getResourceAsStream("icon/icon64x64.png"))),
                                    new Image(Objects.requireNonNull(getClass().getResourceAsStream("icon/icon32x32.png")))
                            );

                            ThemeManager.setTheme(stage.getScene(), Theme.LIGHT); // for now
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
