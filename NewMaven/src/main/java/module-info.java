module robotgame.newmaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens robotgame.newmaven to javafx.fxml;
    exports robotgame.newmaven;
    exports robotgame.newmaven.UIElems;
}