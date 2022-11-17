package less2;


import java.sql.SQLOutput;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "2", "2", "2"},
                {"3", "3", "5", "3"},
                {"3", "2", "2", " Привет!",}
        };
        try {
            try {
                int result = method(arr);
               System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println(" Не верный размер массива!");
            }
       }
       catch (MyArrayDataException e){
            System.out.println(" Не правильное значение массива!");
            System.out.println(" Ошибка в ячейке " + (e.i + 1 )  + " X " + (e.j + 1));
        }
    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
       int n = 0;
        if (arr.length != 4) {
            throw new  MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
               try {
                    n = n + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return n;
    }
}

