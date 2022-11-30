package less4;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
// Задание1
        List<String> color = Arrays.asList(
        "red", "orange", "yellow", "green", "blue", "blue", "purple", "white", "black", "yellow", "white"
        );

        Set<String> uniqueColor = new HashSet<String>(color);

        System.out.println("Уникальные цвета: " + uniqueColor.toString());

        for (String key : uniqueColor){
            System.out.println("Цвет " + key + " повторяется : " + Collections.frequency (color, key));
            System.out.println();
        }
// Задание2
        Phonebook phonebook = new Phonebook();
        System.out.println("Добавдение записей в справочник :");
        phonebook.add("Иванов","222333");
        phonebook.add("Иванов","222444");
        phonebook.add("Петров","222555");
        phonebook.add("Сидоров","222666");
        phonebook.add("Бубнов","222777");
        phonebook.add("Бубнов","222777");
        System.out.println();

        System.out.println("Получение номера по фамилии :");
        System.out.println("Иванов " + phonebook.get("Иванов"));
        System.out.println("Дружков " + phonebook.get("Дружков"));
    }
}
