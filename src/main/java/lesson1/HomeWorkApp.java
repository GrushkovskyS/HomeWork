package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args){
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void checkSumSign(){

        int singA = 5;
        int singB = 3;
    System.out.println(singA + singB);
    if (singA + singB > 0) {
        System.out.println("Сумма положительная");
    }
    if (singA + singB < 0) {
        System.out.println("Сумма отрицательная");
    }
}

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-100, 200);
        System.out.println("Значение: " + value);
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        else if (value > 100) {
            System.out.println("Зелёный");
        }
        System.out.println("Цвет по значению определён.");
    }

    private static void compareNumbers() {
        int numberA = 6;
        int numberB = 5;
        System.out.println("Значение: " + numberA);
        if (numberA >= numberB) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
