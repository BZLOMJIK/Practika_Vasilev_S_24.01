package ru.vasilev_s.vasilev_s_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField numText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        try {
            String numStr = numText.getText();

            int num = Integer.parseInt(numStr);

            boolean isPowerOfThree = isPowerOfThree(num);
            resLabel.setText(isPowerOfThree ? "true" : "false");

        } catch (NumberFormatException e) {
            resLabel.setText("Некорректный ввод. Введите целое число.");
        }
    }

    private boolean isPowerOfThree(int num) {
        while (num % 3 == 0) {
            num /= 3;
        }
        return num == 1;
    }
}



