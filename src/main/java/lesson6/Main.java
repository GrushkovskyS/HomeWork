package lesson6;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   Player player = new Player();
        Player wizard = new Wizard("Толик", 100);
        Player knight = new Knight("Конан", 300);
        Player knight2 = new Knight("Володя", 300);


/*        wizard.printInfo();
        knight.printInfo();

        wizard.doAction();
        knight.doAction();
*/
        Player[] players = {wizard, knight, knight2};

        for (Player player : players){
            player.printInfo();
            player.doAction();
            if (player instanceof Knight k){
                k.saddleHors();
            }
        }

    }

}
