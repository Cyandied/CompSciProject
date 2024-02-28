package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXApp extends Application {

    public void init() {

    }

    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Robot game");
        Scene scene = new Scene(new Pane(),200,200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void stop(){

    }

    public static void main(String[] args) {
        launch(args);
    }

}
