package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//       testConsoleInput();
       testRandom();
    }
// Ввод в консоль.
/*    private static void testConsoleInput() {
        int a = in.nextInt();
        int b = in.nextInt();
        TestsMethods.multiplyAndPrint(a, b);
    }*/
//Ввод в консоль целых чисел с зыцикливанием.
 /*   private static void testConsoleInput() {
    int a = GetValueFromScanner();
    int b = GetValueFromScanner();
    TestsMethods.multiplyAndPrint(a, b);
}

    private static int GetValueFromScanner() {
      while (true) { //Зацикливание
          System.out.print("Введите целое число ");
          if (in.hasNextInt()) {
              return in.nextInt();
          }
              System.out.println(in.next() + " - не число");
      }
    }*/

    private static void testRandom() {
        int[] data = new int[40];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {

            data [i] = random.nextInt(); //
            data [i] = random.nextInt(10); // от 0 до 9
            data [i] = random.nextInt(8) + 3; // от 3 до 10
            data [i] = random.nextInt(13) - 5; // от -5 до 7
            // Или можно по другому
            data [i] = random.nextInt(3,11); // от 3 до 10
            data [i] = random.nextInt(-5,8); // от -5 до 7
        }
        System.out.println(Arrays.toString(data));
    }
}
