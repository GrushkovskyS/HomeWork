package less1;

public class Jump extends Obstacle {
    private int distance;

    public Jump(int distance) {
        this.distance = distance;
    }

    @Override
    public void done(Players players) {
        players.jump(distance);
    }
}
