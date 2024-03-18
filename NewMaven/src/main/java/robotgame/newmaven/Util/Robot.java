package robotgame.newmaven.Util;

public class Robot {
    String name;
    //UUID
    String id;
    World world;
    int x;
    int y;

    int pointsCollected;
    // direction (optional)

    public Robot(String name, String id, World world, int x, int y) {
        this.name = name;
        this.id = id;
        this.world = world;
        this.x = x;
        this.y = y;
        this.pointsCollected = 0;
    }

    // 4 methods for movements
    //Methods will throw an error if users try to move out of bounds, since we will try to get a tile that does not exist
    public void goLeft() {
        move(-1,0);
    }

    public void goRight() {
        move(1,0);
    }

    public void goUp() {
        move(0,-1);
    }

    public void goDown() {
        move(0,1);
    }

    private void move(int xMod, int yMod){
        clean();
        int newX = x + xMod;
        int newY = y + yMod;
        Tile tile = world.getTile(newX,newY);
        if (tile.isClear()) {
            this.x += xMod;
            this.y += yMod;
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
        if (!tile.isClear()) {
            return tile.getType(); // Wall -2 or Obstacle -1 (for now)
        }
        return tile.getDirtinessLevel();
    }

    // Robot cleaning method
    //Should be explicitly called by the user?
    public void clean() {
        Tile tile = world.getTile(x, y);
        if (tile != null && tile.isClear()) { // Check if it's a clear tile
            //While it is nice to have fail-safes, the robot cannot ever be on a not_clear or a null tile
            addPoints(tile);
            tile.cleanTile();
        }
    }

    void addPoints(Tile tile){
        pointsCollected += tile.getDirtinessLevel();
    }

    void addPoints(int toAdd){
        pointsCollected += toAdd;
    }

    void deductPoints(int toRemove){
        pointsCollected -= toRemove;
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
    public int getPointsCollected(){
        return pointsCollected;
    }
}
