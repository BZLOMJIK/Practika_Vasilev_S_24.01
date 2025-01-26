module ru.vasilev_s_235.vasilev_s_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev_s_235.vasilev_s_task2 to javafx.fxml;
    exports ru.vasilev_s_235.vasilev_s_task2;
}