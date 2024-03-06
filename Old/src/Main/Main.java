package Main;

import UIElems.JavaFXApp;

public class Main {
    public static void main(String[] args) {
        JavaFXApp app = new JavaFXApp();
        app.costumStart();
        RobotsGame game = new RobotsGame(10, 10); // Initialize the game with a 5x5 world
        game.startGameLoop();
    }
}