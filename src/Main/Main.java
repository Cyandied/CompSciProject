package Main;

public class Main {
    public static void main(String[] args) {
        JavaFXApp.main(args);
        RobotsGame game = new RobotsGame(10, 10); // Initialize the game with a 5x5 world
        game.startGameLoop();
    }
}