package robotgame.newmaven.UIElems;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import robotgame.newmaven.Util.Robot;
import robotgame.newmaven.Util.Tile;
import robotgame.newmaven.Util.World;

public class RobotPOV {

    int robotPaneSize = 700;
    public Pane robotPane = new Pane();
    World robotWorld;
    Rectangle[][] pov;

    Circle robotMarker;
    Robot robot;

    public RobotPOV(World robotWorld, Robot robot) {
        this.robotWorld = robotWorld;
        this.robot = robot;
        pov = new Rectangle[2][2];
        robotMarker = new Circle();

        initPane();
    }

    void initPane(){
        robotPane.resize(robotPaneSize,robotPaneSize);
        int cellSizeWidth = (robotPaneSize - ((3 + 1) * 5))/3;
        int cellSizeHeight = (robotPaneSize - ((3 + 1) * 5))/3;
        int[][] dxdys = {{1,0},{-1,0},{0,1},{0,-1}};
        int[][] xys = {{1,0},{0,1},{2,1},{1,2}};
        for(int i = 0;i < xys.length; i++) {
            int row = xys[i][1];
            int col = xys[i][0];
            int marginVertical = 5 * (row+1) + row*cellSizeWidth;
                int marginHorisontal = 5 * (col+1) + col*cellSizeHeight;
                Rectangle cell = new Rectangle();
                cell.setX(marginHorisontal);
                cell.setY(marginVertical);
                cell.setWidth(cellSizeWidth);
                cell.setHeight(cellSizeHeight);
                int x = robot.getX() + dxdys[i][0];
                int y = robot.getY() + dxdys[i][1];
                Tile tile_info = robotWorld.getTile(x,y);
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
                pov[row][col] = cell;
                robotPane.getChildren().add(cell);
        }
        robotMarker.setFill(Paint.valueOf("Blue"));
        robotMarker.setRadius((double) cellSizeHeight/2);
        robotMarker.setLayoutX(5 * (robot.getX()+1) + robotMarker.getRadius() + (double) (robot.getX() * robotMarker.getRadius()*2) /2);
        robotMarker.setLayoutY(5 * (robot.getY()+1) + robotMarker.getRadius() + (double) (robot.getY() * robotMarker.getRadius()*2) /2);
        robotPane.getChildren().add(robotMarker);
    }

}
