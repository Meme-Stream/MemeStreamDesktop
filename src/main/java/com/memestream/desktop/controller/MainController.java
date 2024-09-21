package com.memestream.desktop.controller;

import com.memestream.desktop.ui.CustomPageFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Pagination;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private VBox root;

    @FXML
    private Pagination pagination;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final var pageFactory = new CustomPageFactory();
        pagination.setPageFactory(pageFactory);
    }
}
