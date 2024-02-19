package src;

public class Robot {
    String name;
    int id;
    World world;

    int x;
    int y;
    // direction (optional)

    // 4 methods for movements
    public void goLeft () {
        if (world.isClear(x-1, y)) {
            x--;
        }

    }

    public void goRight () {

    }
    public void goUp () {

    }
    public void goDown () {

    }

    // robot censor (don't return void)
    public int sense(Enum) {

    }
    // clean method for robot

}
