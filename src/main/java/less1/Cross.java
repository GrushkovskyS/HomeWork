package less1;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void done(Players players) {
        players.run(distance);
    }
}
