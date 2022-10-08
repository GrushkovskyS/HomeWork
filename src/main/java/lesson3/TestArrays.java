package lesson3;

import java.util.Arrays;

public class TestArrays {

   static final int ARRAY_SIZE =7;

    public static void main(String[] args) {
        testOneArray();
        testTwoArray();
    }

    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];

        data[0] = 5;
        data[3] = 11;
        data[data.length - 1] = 16; //В последней ячейке массива всегда будет 76
// Вывод размера массива.
        System.out.println(data.length);
// Вывод всех значений массива с помощью подключения Arrays.
        System.out.println(Arrays.toString(data));
        System.out.println(convertArrayToString(data));
    }
// Вывод всех значений массива без подключения Array
    public static String convertArrayToString(int[] data) {
      String str = "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
         if (i != data.length -1) {
             str += ", ";
         }
        }
      str += "]";
       return str;
    }
// Двумерный массив.
    private static void testTwoArray() {
        int[][] data = new int[4][3];

        int n = 0;
        for (int i = 0; i < data.length; i++) {
            //           System.out.println(Arrays.toString(data[i]));
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = n++;
            }

        }
        //Упрощённый вариант
 /*       for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%2d " , data[i][j]);
            }
            System.out.println();
        }*/
 //Ешё проще. Цикл for-each Шаблон iter
        for (int[] datum : data) {
            for (int num : datum) {
                System.out.printf("%2d " , num);
                
            }
            System.out.println();
        }

    }
}
