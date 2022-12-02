package lesson5;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Player player1 =new Player("Александра",1000,80,777);
        System.out.println("Всегоо игроков" + Player.playersCount);
        Player player2 =new Player("Владимир",1200,70,55);
        Player player3 = new Player("Артём");
        System.out.println("Всегоо игроков" + Player.playersCount);

/*        player1.nickname = "Test";
        player2.level = 80;
        player1.many = 30;
*/
//        System.out.println(player2.nickname.toUpperCase());

        player2.setNickname("Вася");
        player1.setMany(1);

        Player[] players = {player1, player2, player3};

        for (Player player : players){
            player.printInfo();
        }
        player1.action();
        player1.action();

       player1.printInfo();
   //     player2.printInfo();
     //   player3.printInfo();
    }

}
