package robotgame.newmaven.Util;

import robotgame.newmaven.Tiles.Floor;
import robotgame.newmaven.Tiles.Obstacle;
import robotgame.newmaven.Tiles.Wall;

import java.util.Random;

// different views
public class World {
    private Tile[][] tiles; // Grid of tiles (map)
    private int width;
    private int height;

    private double obsacleCoverage = 0.2; //How much (approx) of the room is covered by obstacles
    private Random random = new Random();

    // Initializes the tiles with default values
    private void initializeTiles() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // Directly create Floor instances, which internally assign a random state
                double randomNum = random.nextDouble();
                if(randomNum < obsacleCoverage) {
                    tiles[i][j] = new Obstacle();
                }
                else {
                    tiles[i][j] = new Floor();
                }
            }
        }
    }

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
        initializeTiles();
    }


    // Added method to access a tile at (x, y)
    public Tile getTile(int x, int y) {
        if (isWithinBounds(x, y)) {
            return tiles[x][y];
        }
        return new Wall(); // Return a wall if the requested tile is out of bounds
    }

    public int getWorldDirtyness(){
        int worldDirtyness = 0;
        for(Tile[] tileRow : tiles){
            for(Tile tile : tileRow){
                worldDirtyness += tile.getDirtinessLevel();
            }
        }
        return worldDirtyness;
    }

    // Checks if a given position is within the world bounds
    //This method should return a tile type of wall and should be called by the robots sensor
    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }

    public void displayWorld(Robot robot) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == robot.getX() && i == robot.getY()) {
                    System.out.print("R "); // Display the robot
                } else {
                    Tile tile = tiles[j][i];
                    if (tile.getDirtinessLevel() == 1) {
                        System.out.print(". "); // Clean tile
                    } else if (tile.getDirtinessLevel() > 1) {
                        System.out.print(tile.getDirtinessLevel() + " "); // Display dirtiness level for dirty tiles
                    } else {
                        System.out.print("# "); // Obstacle
                    }
                }
            }
            System.out.println();
        }
    }
}