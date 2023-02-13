package lesson2;

public class ForTest {
    public static void main(String[] args) {
// Цыкл
        for (int i = 0; i < 10; i++){
          System.out.println(i);
        }
// Внешний и внутрений цыкл.
        final int LIMIT_OF_CYCLE = 10;
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            System.out.println("Внешний цикл " + i);
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                System.out.println("Внутренний цикл " + j);
            }
            System.out.println("Конец цикла ввнешней итерации");
            System.out.println();
        }
// Вывести смайлики на экран 1, 2, ...10.
  /*      String str = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            str +="☺";
            System.out.println(str);
        } */
// Вывод смайликов разного цвета через один.
 /*             String str = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                str += "☺";
            } else {
                str += "☻";
            }
                str +="";

            System.out.println(str);
        } */
 // Вывод смайликов разного чвета через один, и добивание пустой строки сердечками.
      /* String str = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                str += "☺ ";
            } else {
                str += "☻";
            }
            str +=" ";
            System.out.print(str); // убираем ln

            for (int j = 0; j < LIMIT_OF_CYCLE - (i + 1); j++) {
                System.out.print("♥ "); // убираем ln
            }
            System.out.println();
        }*/
// Остановка всего и продолжение цикла.
        for (int i = 0; i < 20; i++) {
           if (i == 16){
               break;
           }
           if (i % 2 ==0){
               continue;
           }
            System.out.print("i:" + i);
        }
        System.out.println("\nEnd");
    }
}
