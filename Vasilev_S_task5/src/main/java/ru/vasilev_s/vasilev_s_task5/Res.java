package ru.vasilev_s.vasilev_s_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField pText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        try {
            double p = Double.parseDouble(pText.getText());

            if (p <= 0 || p >= 50) {
                resLabel.setText("Число не входит в необходимый промежуток");
                return;
            }

            int k = 0;
            double s = 0;
            double d = 10;

            while (s <= 200) {
                k++;
                s += d;
                d += d * (p / 100);
            }
            resLabel.setText("дни: " + k + "\nпробег: " + s + " км");
        } finally {
        }
        }
    }






