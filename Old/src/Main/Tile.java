package Main;

public abstract class Tile {
    public int dirtiness;
    // Determines how dirty the tile is.
    public int type;
    //Tells what type of tile it is to player
    public abstract boolean isClear();

    public int getType(){
        return type;
    };

    // Returns the dirtiness level or indicates an obstacle/wall.
    public int getDirtinessLevel(){
        return dirtiness;
    };

    public abstract void cleanTile();
}
