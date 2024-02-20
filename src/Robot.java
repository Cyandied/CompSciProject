public class Robot {
    String name;
    int id;
    src.World world;
    int x;
    int y;
    // direction (optional)

    public Robot(String name, int id, src.World world, int x, int y) {
        this.name = name;
        this.id = id;
        this.world = world;
        this.x = x;
        this.y = y;
    }

    // 4 methods for movements
    public void goLeft() {
        src.Tile tile = world.getTile(x - 1, y);
        if (tile != null && tile.isClear()) {
            x--;
        }
    }

    public void goRight() {
        src.Tile tile = world.getTile(x + 1, y);
        if (tile != null && tile.isClear()) {
            x++;
        }
    }

    public void goUp() {
        src.Tile tile = world.getTile(x, y - 1);
        if (tile != null && tile.isClear()) {
            y--;
        }
    }

    public void goDown() {
        src.Tile tile = world.getTile(x, y + 1);
        if (tile != null && tile.isClear()) {
            y++;
        }
    }

    // robot censor (don't return void)
    public int sense(Direction direction) {
        int newX = x, newY = y;
        switch (direction) {
            case RIGHT: newX++; break;
            case LEFT: newX--; break;
            case UP: newY--; break;
            case DOWN: newY++; break;
        }
        src.Tile tile = world.getTile(newX, newY);
        if (tile == null) {
            return -1; // Wall or outside of bounds
        }
        return tile.getDirtinessLevel();
    }

    // Robot cleaning method
    public void clean() {
        src.Tile tile = world.getTile(x, y);
        if (tile != null && tile.isClear()) { // Check if it's a clear tile
            tile.cleanTile();
        }
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public src.World getWorld() { return world; }
    public void setWorld(src.World world) { this.world = world; }
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
}
