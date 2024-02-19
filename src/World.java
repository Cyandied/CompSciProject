package src;

// different views
public class World {
    Tile [][] map;
    public boolean isClear (int x, int y){
        return map[x][y].isClear();
    }
}
