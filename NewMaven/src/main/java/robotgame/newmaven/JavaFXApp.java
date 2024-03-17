package robotgame.newmaven;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import robotgame.newmaven.Util.RobotsGameA;

public class JavaFXApp extends Application {

    private RobotsGameA game;
    public void init() {
        this.game = new RobotsGameA(10, 10); // Initialize the game with a 5x5 world
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Robot game");
        HBox mainPane = new HBox();
        Pane big_pane = game.playArea.robotPane;
        Pane pov_pane = null;
        Button btn = new Button("step");
        mainPane.getChildren().add(btn);
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                game.step();
            }
        });
        primaryStage.setScene(new Scene(mainPane,mainPane.getWidth(), mainPane.getHeight()));
        primaryStage.show();


    }

    public void stop(){

    }

    public static void main(String[] args) {
        launch(args);
    }

}
