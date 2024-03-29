package Main;

import java.util.Random;
import java.util.Scanner;

public class RobotsGame {
    private World world;
    private Robot robot;
    private Scanner scanner;

    public RobotsGame(int width, int height) {
        this.world = new World(width, height);
        this.robot = new Robot("Robot1", "1", world, 0, 0);
        this.scanner = new Scanner(System.in);
    }

    // Method to display the game state in the terminal
    public void displayGameState() {
        world.displayWorld(robot);
        // Additional game state here if we need them
    }

    // Game loop
    public void startGameLoop() {
        boolean gameRunning = true;
        while (gameRunning) {
            displayGameState();
            System.out.println("Enter 'exit' to quit or press enter to continue...");

            String userInput = scanner.nextLine();
            if ("exit".equals(userInput)) {
                gameRunning = false; // Exit the loop and end the game
            }

            // game logic updates here
            moveRobotRandomly();
        }
        scanner.close();
        System.out.println("Game exited.");
    }


    /** Method that checks if the position is within bounds and not an obstacle,
     * but it's really similar to sense method in robot so we might have to change one of them and it probably should be
     * in the robot class
     *
     * A method like this shouldn't exist, if (can move) is something the users should figure out based on sensor data
     */

//    private boolean canMove(int x, int y) {
//        return world.isWithinBounds(x, y) && world.getTile(x, y).isClear();
//    }

    // Method to Move the robot in a random valid direction
    private void moveRobotRandomly() {
        Direction[] directions = Direction.values();
        Random random = new Random();
        Direction direction = directions[random.nextInt(directions.length)];
        //Senses to see if it is a valid direction, if not, it randomly chooses another one
        while(robot.sense(direction) < 0){
            direction  = directions[random.nextInt(directions.length)];
        }

        //Switch statement could be implemented into the robot movement method which can then just take a
        //Direction enum, robot.move(Direction)
        switch (direction) {
            case UP:
                    robot.goUp();
                break;
            case DOWN:
                    robot.goDown();
                break;
            case LEFT:
                    robot.goLeft();
                break;
            case RIGHT:
                    robot.goRight();
                break;
            }
    }
}
