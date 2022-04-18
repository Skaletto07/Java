module ru.gb.chat {
    requires javafx.controls;
    requires javafx.fxml;



    exports ru.gb.chat;
    opens ru.gb.chat to javafx.fxml;
}