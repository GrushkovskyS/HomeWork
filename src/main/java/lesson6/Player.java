package lesson6;

public abstract class Player {
    private String nickname;
    private int points;
    private final String russianProfession;

    public Player(String nickname, int points, String russianProfession) {
        this.nickname = nickname;
        this.points = points;
        this.russianProfession = russianProfession;
    }

    /* public Player() {
    }*/

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("Игрок %s %s имеет %s очков." , nickname,russianProfession, points);
    }

    public void printInfo(){
        System.out.println(this);

    }

    public abstract void doAction();

}
