package lesson2;

import java.util.concurrent.ThreadLocalRandom;
// While для не определённого количества итераций.
public class WhileTest {
    public static void main(String[] args) {

        int countApples =20;
         while (countApples > 0){
             countApples -= eatSomeApples();

             System.out.println("Яблок стало меньше. Осталось: " + countApples + "штук");

         }

    }

    private static int eatSomeApples(){
        return ThreadLocalRandom.current().nextInt(1,6);
    }
}

