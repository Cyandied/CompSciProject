package robotgame.newmaven.Tiles;

import robotgame.newmaven.Util.Tile;

public class Obstacle extends Tile {

    public Obstacle() {
        this.dirtiness = 0;
        this.type = -1;
    }
    @Override
    public void cleanTile() {
    }
    @Override
    public boolean isClear() {
        return false;
    }
}
