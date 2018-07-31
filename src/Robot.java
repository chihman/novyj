public class Robot {
    int x = 0;
    int y = 0;
    Direction q = Direction.UP;

    public Direction getDirection() {
        Direction d;
        d = Direction.UP;

        return d;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (q==Direction.UP)
        {q=Direction.LEFT;}
        if (q==Direction.DOWN){
            q=Direction.RIGHT;
        }
        if (q==Direction.LEFT){
            q=Direction.DOWN;
        }
        if (q==Direction.RIGHT){
            q=Direction.UP;
        }
    }

    public void turnRight() {
        if (q==Direction.UP)
        {q=Direction.RIGHT;}
        if (q==Direction.DOWN){
            q=Direction.LEFT;
        }
        if (q==Direction.LEFT){
            q=Direction.UP;
        }
        if (q==Direction.RIGHT){
            q=Direction.DOWN;
        }
    }

    public void stepForvard() {
        Direction d = Direction.UP;
        if (d == Direction.DOWN) {
            y = y - 1;
        }
        if (d == Direction.UP) {
            y = y + 1;
        }
        if (d == Direction.LEFT) {
            x = x - 1;
        }
        if (d == Direction.RIGHT) {
            x = x + 1;
        }

    }

}
