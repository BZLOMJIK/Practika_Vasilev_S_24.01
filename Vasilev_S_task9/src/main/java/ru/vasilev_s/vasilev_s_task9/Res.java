package ru.vasilev_s.vasilev_s_task9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int a = Integer.parseInt(aText.getText());
        int b = Integer.parseInt(bText.getText());
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        resLabel.setText("" + a);
    }


}


