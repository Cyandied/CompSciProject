package Main;

public class Robot {
    String name;
    //UUID
    String id;
    World world;
    int x;
    int y;
    // direction (optional)

    public Robot(String name, String id, World world, int x, int y) {
        this.name = name;
        this.id = id;
        this.world = world;
        this.x = x;
        this.y = y;
    }

    // 4 methods for movements
    //Methods will throw an error if users try to move out of bounds, since we will try to get a tile that does not exist
    public void goLeft() {
        Tile tile = world.getTile(x - 1, y);
        if (tile != null && tile.isClear()) {
            x--;
        }
    }

    public void goRight() {
        Tile tile = world.getTile(x + 1, y);
        if (tile != null && tile.isClear()) {
            x++;
        }
    }

    public void goUp() {
        Tile tile = world.getTile(x, y - 1);
        if (tile != null && tile.isClear()) {
            y--;
        }
    }

    public void goDown() {
        Tile tile = world.getTile(x, y + 1);
        if (tile != null && tile.isClear()) {
            y++;
        }
    }

    // robot sensor (don't return void)
    public int sense(Direction direction) {
        int newX = x, newY = y;
        switch (direction) {
            case RIGHT: newX++; break;
            case LEFT: newX--; break;
            case UP: newY--; break;
            case DOWN: newY++; break;
        }
        Tile tile = world.getTile(newX, newY);
        if (tile == null) {
            return -1; // Wall or outside of bounds
            //We need to make a distinction between Wall and Obstacle
        }
        return tile.getDirtinessLevel();
    }

    // Robot cleaning method
    public void clean() {
        Tile tile = world.getTile(x, y);
        if (tile != null && tile.isClear()) { // Check if it's a clear tile
            //While it is nice to have fail-safes, the robot cannot ever be on a not_clear or a null tile
            tile.cleanTile();
        }
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public World getWorld() { return world; }
    public void setWorld(World world) { this.world = world; }
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
}
