import java.util.Random;

// different views
public class World {
    private Tile[][] tiles; // Grid of tiles (map)
    private int width;
    private int height;
    private Random random = new Random();

    // Initializes the tiles with default values
    private void initializeTiles() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // Directly create Floor instances, which internally assign a random state
                tiles[i][j] = new Floor();
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
        return null; // Return null if the requested tile is out of bounds
    }

    // Checks if a given position is within the world bounds
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