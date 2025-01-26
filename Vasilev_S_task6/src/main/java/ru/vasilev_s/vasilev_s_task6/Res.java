package ru.vasilev_s.vasilev_s_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField nText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        try {
            int n = Integer.parseInt(nText.getText());
            if (n <= 0) {
                resLabel.setText("Введено не корекктное число");
                return;
            }

            boolean hasDigitTwo = hasDigitTwo(n);
            resLabel.setText(hasDigitTwo ? "true" : "false");
        } finally {

        }

    }


    private boolean hasDigitTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n > 0) {
            int digit = n % 10;
            if (digit == 2) {
                return true;
            }
            n /= 10;
        }
        return false;
    }


}

