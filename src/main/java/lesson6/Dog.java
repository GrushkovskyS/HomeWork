package lesson6;

public class Dog extends Animal{

    public Dog(String name, int run, int swimming){
        super(name, run, swimming,"Сабакен");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void doAction() {
        System.out.printf("Сабакен %s пробегает 150 метров!%n",getName());
    }
}
