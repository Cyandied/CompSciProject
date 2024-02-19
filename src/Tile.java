package src;

public abstract class Tile {
    public abstract boolean isClear();
}

// Floor should be in a different file
class Floor extends Tile {
    @Override
    public boolean isClear() {
        return true;
    }
}
