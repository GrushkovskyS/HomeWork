package lesson7;

public class Plate {
    private int food;
    private boolean falce;

    public Plate(int food) {

        this.food = food;
    }

    public void printInfo() {
        System.out.printf("В миске осталось %s еды%n", food);
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFod(int catEatRandom) {
        if (catEatRandom > food) {
            return falce;
        }
        else {
            food -= catEatRandom;
            return true;
        }
    }

}
