package com.memestream.desktop.controller;

import com.memestream.desktop.model.Meme;
import com.memestream.desktop.ui.CustomListCellFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import lombok.Setter;

import java.net.URL;
import java.util.ResourceBundle;

public class PageController implements Initializable {

    @FXML
    private ListView<Meme> memeListView;

    @Setter
    private Integer index;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final var listCellFactory = new CustomListCellFactory();
        memeListView.setCellFactory(listCellFactory);

        memeListView.getItems().addAll(
                new Meme("Test 1", "description for test1"),
                new Meme("Test 2", "description for test2"),
                new Meme("Test 3", "description for test3"),
                new Meme("Test 4", "description for test4"),
                new Meme("Test 5", "description for test5")
        );
    }
}
