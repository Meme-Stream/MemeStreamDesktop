package com.memestream.desktop.ui;

import com.memestream.desktop.model.Meme;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class CustomListCellFactory implements Callback<ListView<Meme>, ListCell<Meme>> {
    @Override
    public ListCell<Meme> call(ListView<Meme> param) {
        return new ListCell<>() {
            @Override
            protected void updateItem(Meme item, boolean empty) {
                super.updateItem(item, empty);

                setText(null);
                if (item == null || empty) {
                    setGraphic(null);
                }else {
                    setGraphic(createContent(item));
                }
            }
        };
    }

    private Node createContent(Meme item) {
        final var root = new VBox(3);

        final var titleText = new Text(item.getTitle());
        titleText.setFont(Font.font(Font.getDefault().getName(), FontWeight.BOLD, 16));

        final var descriptionText = new Text(item.getDescription());

        root.getChildren().addAll(titleText, descriptionText);

        return root;
    }
}
