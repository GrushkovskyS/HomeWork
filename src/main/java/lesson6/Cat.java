package lesson6;

public class Cat extends Animal {
    public Cat(String name, int run, int swimming){
        super(name, run, swimming,"Кошка");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void doAction() {
        System.out.printf("%s ФАЛЬШСТАРТ!", getName());
    }
}
