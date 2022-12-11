package less7.Project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private static Controller controller = new Controller();

    public static Object runInterface(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 - для получения прогноза на один день; " + "Введите 5 - для получения прогноза на пять дней; " + "Введите 0 - для выхода");

            String command = scanner.nextLine();

             if ("0".equals(command)) {
                 break;
             }
            if("1".equals(command)) {
                try {
                    controller.getWeather(command, city);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
                else {
                    System.out.printf(" Ошибка!!!%n Введите 1 - для получения прогноза на один день%n Введите 5 - для получения прогноза на пять дней%n Введите 0 - для выхода%n");
                }runInterface();

            if("5".equals(command)){
                try {
                    controller.getWeather(command, city);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            else {
                System.out.printf(" Ошибка!!!%n Введите 1 - для получения прогноза на один день%n Введите 5 - для получения прогноза на пять дней%n Введите 0 - для выхода%n");
            }runInterface();
        }
        return null;
    }
}
