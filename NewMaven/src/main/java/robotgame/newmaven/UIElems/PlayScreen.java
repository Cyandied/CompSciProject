package robotgame.newmaven.UIElems;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import robotgame.newmaven.Util.Robot;
import robotgame.newmaven.Util.Tile;
import robotgame.newmaven.Util.World;

public class PlayScreen {

    int robotPaneSize = 700;
    int width;
    int height;
    public Pane robotPane = new Pane();
    World robotWorld;
    Rectangle[][] map;

    Circle robotMarker;
    Robot robot;

    public PlayScreen(World robotWorld, Robot robot, int width, int height) {
        this.width = width;
        this.height = height;
        this.robotWorld = robotWorld;
        this.robot = robot;
        map = new Rectangle[width][height];
        robotMarker = new Circle();

        initPane();
    }

    private void initPane(){
        robotPane.resize(robotPaneSize,robotPaneSize);
        int cellSizeWidth = (robotPaneSize - ((width + 1) * 5))/width;
        int cellSizeHeight = (robotPaneSize - ((height + 1) * 5))/height;
        for(int row = 0;row < height; row++) {
            int marginVertical = 5 * (row+1) + row*cellSizeWidth;
            for(int col = 0; col < width; col++){
                int marginHorisontal = 5 * (col+1) + col*cellSizeHeight;
                Rectangle cell = new Rectangle();
                cell.setX(marginHorisontal);
                cell.setY(marginVertical);
                cell.setWidth(cellSizeWidth);
                cell.setHeight(cellSizeHeight);
                Tile tile_info = robotWorld.getTile(col,row);
                switch (tile_info.getType()){
                    case 1:
                        switch (tile_info.getDirtinessLevel()){
                            case 1:
                                cell.setFill(Paint.valueOf("white"));
                                break;
                            case 2:
                                cell.setFill(Paint.valueOf("yellow"));
                                break;
                            case 3:
                                cell.setFill(Paint.valueOf("orange"));
                                break;
                            case 4:
                                cell.setFill(Paint.valueOf("red"));
                                break;
                            case 5:
                                cell.setFill(Paint.valueOf("purple"));
                                break;
                        }
                        break;
                    case -1:
                        cell.setFill(Paint.valueOf("Black"));
                        break;
                }
                map[row][col] = cell;
                robotPane.getChildren().add(cell);
            }
        }
        robotMarker.setFill(Paint.valueOf("Blue"));
        robotMarker.setRadius((double) cellSizeHeight/2);
        robotMarker.setLayoutX(5 * (robot.getX()+1) + robotMarker.getRadius() + (double) (robot.getX() * robotMarker.getRadius()*2) /2);
        robotMarker.setLayoutY(5 * (robot.getY()+1) + robotMarker.getRadius() + (double) (robot.getY() * robotMarker.getRadius()*2) /2);
        robotPane.getChildren().add(robotMarker);
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                Rectangle cell = map[row][col];
                Tile tile_info = robotWorld.getTile(col,row);
                switch (tile_info.getType()) {
                    case 1:
                        switch (tile_info.getDirtinessLevel()){
                            case 1:
                                cell.setFill(Paint.valueOf("white"));
                                break;
                            case 2:
                                cell.setFill(Paint.valueOf("yellow"));
                                break;
                            case 3:
                                cell.setFill(Paint.valueOf("orange"));
                                break;
                            case 4:
                                cell.setFill(Paint.valueOf("red"));
                                break;
                            case 5:
                                cell.setFill(Paint.valueOf("purple"));
                                break;
                        }
                        break;
                    case -1:
                        cell.setFill(Paint.valueOf("black"));
                        break;
                }
            }
        }
        robotMarker.setLayoutX(5 * (robot.getX()+1) + robotMarker.getRadius() + (double) (robot.getX() * robotMarker.getRadius()*2));
        robotMarker.setLayoutY(5 * (robot.getY()+1) + robotMarker.getRadius() + (double) (robot.getY() * robotMarker.getRadius()*2));
    }

}
