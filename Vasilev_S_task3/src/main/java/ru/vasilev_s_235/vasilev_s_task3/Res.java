package ru.vasilev_s_235.vasilev_s_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Res {

    @FXML
    private TextField aText;

    @FXML
    private Label res2Label;

    @FXML
    private Label res3Label;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        double a = Float.parseFloat(aText.getText().toString());
        double c = 0, h = 0, s = 0;
        int nomer = 1;
        switch (nomer) {
            case 1:
                c = a * sqrt(2);
                h = c / 2;
                s = c * h / 2;
                resLabel.setText("" + c);
                res2Label.setText("" + h);
                res3Label.setText("" + s);
                break;
            case 2:
                a = c / sqrt(2);
                h = c / 2;
                s = c * h / 2;
                resLabel.setText("" + a);
                res2Label.setText("" + h);
                res3Label.setText("" + s);
                break;
            case 3:
                c = h * 2;
                a = c / sqrt(2);
                s = c * h / 2;
                resLabel.setText("" + c);
                res2Label.setText("" + a);
                res3Label.setText("" + s);
                break;
            case 4:
                h = s / c * 2;
                c = (s / (h * 2)) * 2;
                a = (s / (c * 2)) / sqrt(2);
                resLabel.setText("" + h);
                res2Label.setText("" + c);
                res3Label.setText("" + a);

        }
    }

}
