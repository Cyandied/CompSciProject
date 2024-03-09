package robotgame.newmaven.Util;

import robotgame.newmaven.UIElems.PlayScreen;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class RobotsGameA {
    private World world;
    private Robot robot;
    private Scanner scanner;
    public PlayScreen playArea;

    public RobotsGameA(int width, int height) {
        this.world = new World(width, height);
        this.robot = new Robot("Robot1", "1", world, 0, 0);
        this.scanner = new Scanner(System.in);

        this.playArea = new PlayScreen(world,robot,width,height);
    }

    // Method to display the game state in the terminal
    public void displayGameState() {
        System.out.println("\n\n");
        world.displayWorld(robot);
        // Additional game state here if we need them
    }

    public void step(){
        moveRobotRandomly();
        playArea.draw();
        displayGameState();
    }

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
