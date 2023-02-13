package lesson6;

public class Knight extends Player{

    private String swordTitle;
    public Knight(String nickname, int points, String swordTitle){
        super(nickname, points, "Рыцарь");
        this.swordTitle = swordTitle;
    }

    public Knight(String nickname, int points) {
        this(nickname,points,"Эскалибур");
    }
    public void saddleHors(){
        System.out.println("Вперёд платва");
    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }

 /*   public void printInfo(){
        super.printInfo();
        System.out.printf("Его меч %s%n", swordTitle);

    }*/

    @Override
    public String toString() {
        return super.toString() + " " + String.format("Его меч %s%n", swordTitle);
    }

    @Override
    public void doAction() {
        System.out.printf("%s машет мечём %s%n", getNickname(), getSwordTitle());

    }
}
