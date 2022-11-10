package less1;

public class Water extends Obstacle{
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void done(Players players) {
        players.swim(distance);
    }
}
