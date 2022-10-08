package lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        invertArray();
        masstArray();
        mainArray();
        sixArray();
        int[] newArray = getLen(6,3);
        System.out.println(Arrays.toString(newArray));
    }
    // Задание 1.
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }


//Задание2.
    public static void masstArray() {
        int n = 1;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
//Задание3.
    public static void mainArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
//Задание4.
    private static void sixArray() {
        int[][] data = new int[6][6];
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = n;
                if (i == j){
                    data[i][i] = 1;
                }
                 if (i + j == 5){
                     data [i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(data[i]));
        }
        System.out.println();
    }
//Задание5
    private static int[] getLen (int len, int initialValue) {
        int[] data = new int [len];
        Arrays.fill(data, initialValue);
        return data;

    }
}