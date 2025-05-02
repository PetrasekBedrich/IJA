module ija.project.lightbulbgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens ija.project.lightbulbgame to javafx.fxml;
    exports ija.project.lightbulbgame;
}