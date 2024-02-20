package src;

import java.util.Random;
import java.util.Scanner;

public class RobotsGame {
    private src.World world;
    private Robot robot;
    private Scanner scanner;

    public RobotsGame(int width, int height) {
        this.world = new src.World(width, height);
        this.robot = new Robot("Robot1", 1, world, 0, 0);
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
     */

    private boolean canMove(int x, int y) {
        return world.isWithinBounds(x, y) && world.getTile(x, y).isClear();
    }

    // Method to Move the robot in a random direction
    private void moveRobotRandomly() {
        Direction[] directions = Direction.values();
        boolean moved = false;
        Random random = new Random();

        while (!moved) {
            Direction direction = directions[random.nextInt(directions.length)];

            switch (direction) {
                case UP:
                    if (canMove(robot.getX(), robot.getY() - 1)) {
                        robot.goUp();
                        moved = true;
                    }
                    break;
                case DOWN:
                    if (canMove(robot.getX(), robot.getY() + 1)) {
                        robot.goDown();
                        moved = true;
                    }
                    break;
                case LEFT:
                    if (canMove(robot.getX() - 1, robot.getY())) {
                        robot.goLeft();
                        moved = true;
                    }
                    break;
                case RIGHT:
                    if (canMove(robot.getX() + 1, robot.getY())) {
                        robot.goRight();
                        moved = true;
                    }
                    break;
            }
        }
        // the robot cleans the tile it's in
        robot.clean();
    }
}
