package lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args){
// Задание 1
        boolean isNumber = correctNumber(10,20);
        System.out.println(isNumber);
        System.out.println();
// Задание 2
        boolean isInteger = integerNumber(-1);
        System.out.println();
// Зфдание 3
        boolean isPositiv = positiveNumber(5);
        System.out.println(isPositiv);
        System.out.println();
// Задание 4
        positiveFor("Word", 5);
    }
    // Задание 1
    private static boolean correctNumber(int a, int b) {
        System.out.println(a + b);
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
         else {
             return false;
        }

    }
    // Задание 2
    private static boolean integerNumber(int a) {
        System.out.println(a);
        if (a >=0 ) {
            System.out.println("Число положительное");
            return true;
        }
        else {
            System.out.println("Число отрицательное");
            return false;
        }
    }
    // Задание 3
    private static boolean positiveNumber(int i) {
        System.out.println(i);
        if (i <=0 ) {
            return true;
        }
        else {
            return false;
        }
    }
    // Задание 4
    private static void positiveFor(String name, int a) {
         for (int j = 0; j < a; j++) {
             System.out.println(name);

         }

    }
}
