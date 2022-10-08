package lesson3;

import java.util.Arrays;

public class TestsMethods {
    public static void main(String[] args) {
        multiplyAndPrint(3, 4);
        multiplyAndPrint(44.66, 33.22);
        multiplyAndPrint(2);
        multiplyAndPrint(11.2, 22.3);
    }

    public static void multiplyAndPrint(int a, int b) {
        int multiply = a * b;
        System.out.printf("Произведение %d и %d равно %d(целые)%n", a, b, multiply);
    }
//Перегрузка метода на вычисление дробных чисел.
    public static void multiplyAndPrint(double a, double b) {
        double multiply = a * b;
        System.out.printf("Произведение %.2f и %.2f равно %.4f(дробные)%n", a, b, multiply);
    }
    private static void multiplyAndPrint(int a) {
        int multiply = a * a;
        System.out.printf("Квадрат числа %d равно %d%n", a, multiply);
    }
    private static void multiplyAndPrint(double a) {
        multiplyAndPrint(a, a);
    }
}
