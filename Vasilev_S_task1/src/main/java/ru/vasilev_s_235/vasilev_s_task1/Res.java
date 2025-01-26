package ru.vasilev_s_235.vasilev_s_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField aText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int a = Integer.parseInt(aText.getText().toString());

         switch (a) {
             case 1, 3, 5, 7, 8, 10, 12 -> {
                 a = 31;
             }
             case 4, 6, 9, 11 -> {
                 a = 30;
             }
             case 2 -> {
                 a = 28;
             }
             default -> {
                 a = -1;
             }

         };resLabel.setText(""+a);
    }

}
