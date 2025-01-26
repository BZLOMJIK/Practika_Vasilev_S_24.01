package ru.vasilev_s_235.vasilev_s_task2;

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
        int des = a / 10;
        int edi = a % 10;
        String t = "";
        String r = "";
        if (a > 20 || a < 69) {
            switch (des) {
                case 2:
                    t = "Двадцать";
                    break;
                case 3:
                    t = "Тридцать";
                    break;
                case 4:
                    t = "Сорок";
                    break;
                case 5:
                    t = "Пятьдесят";
                    break;
                case 6:
                    t = "Шестьдесят";
                    break;
            }
            switch (edi) {
                case 1:
                    r = " Один год";
                    break;
                case 2:
                    r = " Два года";
                    break;
                case 3:
                    r = " Три года";
                    break;
                case 4:
                    r = " Четыре года";
                    break;
                case 5:
                    r = " Пять лет";
                    break;
                case 6:
                    r = " Шесть лет";
                    break;
                case 7:
                    r = " Семь лет";
                    break;
                case 8:
                    r = " Восемь лет";
                    break;
                case 9:
                    r = " Девять лет";
                    break;
            }
            resLabel.setText(t+r);
            }

        }
    }

