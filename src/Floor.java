import java.util.Random;

public class Floor extends Tile {
    private int dirtiness; // 1-5 for dirtiness levels, 0 for obstacles

    public Floor() {
        // Randomly assign dirtiness level, including possibility of being an obstacle
        this.dirtiness = new Random().nextInt(6); // 0 to 5
    }

    @Override
    public boolean isClear() {
        return this.dirtiness != 0; // If dirtiness is 0, it's considered an obstacle and not clear.
    }

    @Override
    public int getDirtinessLevel() {
        return dirtiness;
    }

    @Override
    public void cleanTile() {
        // Resetting the dirtiness to 1 instead of decreasing it
        this.dirtiness = 1;
    }
}
