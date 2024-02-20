import java.util.Random;

public abstract class Tile {
    int dirtiness;
    // Determines if the tile is free of obstacles.
    public abstract boolean isClear();

    // Returns the dirtiness level or indicates an obstacle/wall.
    public abstract int getDirtinessLevel();

    public abstract void cleanTile();
}

