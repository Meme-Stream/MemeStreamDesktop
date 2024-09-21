package com.memestream.desktop.ui;

import com.memestream.desktop.controller.PageController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.util.Callback;

import java.io.IOException;

public class CustomPageFactory implements Callback<Integer, Node> {

    @Override
    public Node call(Integer index) {
        final var loader = new FXMLLoader(getClass().getResource("/com/memestream/desktop/page-view.fxml"));

        try {
            final var parent = ((Parent) loader.load());
            final var controller = ((PageController) loader.getController());

            controller.setIndex(index);

            return parent;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
