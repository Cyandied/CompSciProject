package Tiles;

import Main.Tile;

public class Wall extends Tile {

    public Wall() {
        this.dirtiness = 0;
        this.type = -2;
    }
    @Override
    public void cleanTile() {
    }
    @Override
    public boolean isClear() {
        return false;
    }
}
