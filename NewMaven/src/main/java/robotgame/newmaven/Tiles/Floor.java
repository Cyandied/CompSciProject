package robotgame.newmaven.Tiles;

import robotgame.newmaven.Util.Tile;

import java.util.Random;

public class Floor extends Tile {

    public Floor() {
        // Randomly assign dirtiness level, including possibility of being an obstacle
        this.dirtiness = new Random().nextInt(1,6); // 0 to 5
        this.type = 1;
    }

    @Override
    public boolean isClear() {
        return true; // If dirtiness is 0, it's considered an obstacle and not clear.
    }
    @Override
    public void cleanTile() {
        // Resetting the dirtiness to 1 instead of decreasing it
        this.dirtiness = 1;
    }
}
