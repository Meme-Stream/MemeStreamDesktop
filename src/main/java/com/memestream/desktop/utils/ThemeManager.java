package com.memestream.desktop.utils;

import javafx.scene.Scene;

public class ThemeManager {

    public static void setTheme(Scene scene, Theme theme) {
        final var styleSheets = scene.getStylesheets();

        if (styleSheets.isEmpty())
            styleSheets.add(theme.getPath());
        else
            styleSheets.set(0, theme.getPath());
    }
}
