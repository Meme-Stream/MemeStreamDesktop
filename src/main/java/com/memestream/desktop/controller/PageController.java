package com.memestream.desktop.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.memestream.desktop.model.Meme;
import com.memestream.desktop.ui.CustomListCellFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import lombok.Setter;

import java.net.URL;
import java.util.List;
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

        final var json = """
                [
                        {
                            "id": "68519958-deec-462a-975f-195ecbdeb37a",
                            "title": "charming",
                            "description": "This is not a text meme",
                            "type": "IMAGE_JPEG",
                            "chef": {
                                "name": "Chef2",
                                "roles": [
                                    "USER"
                                ]
                            },
                            "likes": 0
                        },
                        {
                            "id": "fd17ba13-6221-4249-84ed-c3f29d59bb96",
                            "title": "Baba fereydoon",
                            "description": "This is a text meme",
                            "type": "TEXT",
                            "chef": {
                                "name": "Dumb Chef",
                                "roles": [
                                    "USER"
                                ]
                            },
                            "likes": 2
                        }
                    ]
                """;
        final var objectMapper = new ObjectMapper();
        try {
            final var listOfMemes = objectMapper.readValue(json, new TypeReference<List<Meme>>(){});

            memeListView.getItems().addAll(listOfMemes);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
