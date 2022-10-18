package lesson6;

public class HomeWork6_Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Бобик",500,10);
        Animal cat = new Cat("Мурка", 200,0);


       dog.printInfo();
       cat.printInfo();

        dog.doAction();
        cat.doAction();
    }

}
