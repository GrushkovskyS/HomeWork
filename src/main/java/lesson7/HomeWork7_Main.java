package lesson7;

import java.util.Scanner;

public class HomeWork7_Main {

    public static void main(String[] args) {
        Cat[] animal = {
                new Cat("Смоке", 4),
                new Cat("Васька", 2),
                new Cat("Борис",3)
        };

        System.out.println("Укажите количество еды в миске :");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for(Cat cat : animal) {
            while (!cat.isFullness() && plate.getFood() >= cat.getAppetite()) {
                cat.eat(plate);
                plate.printInfo();
            }
        }
        for(Cat cat : animal) {
            if (cat.isFullness()) {
                System.out.printf("%s наелся%n", cat.getName());
            } else {
                System.out.printf("%s остался голодным%n", cat.getName());
            }
        }
   }
}
