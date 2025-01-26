package ru.vasilev_s.vasilev_s_task7;

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
        int N = Integer.parseInt(numText.getText());
        String result = "";
        String[] units = { "", "одно", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять" };
        String[] tens = { "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
        String[] tens1 = { "", "", "двадцать", "тридцать", "сорок" };
        if (N >= 10 && N <= 19){
            result += tens[N % 10];
        }
        else {
            result += tens1[N / 10];
            result += " " + units[N % 10];
        }
        if (N % 10 == 1 && N != 11){
            result += " учебное задание";
        } else {
            result += " учебных заданий";
        }
        resLabel.setText(result);

    }

}
