package less4;

import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)){
                numbers.add(number);
                System.out.printf("Добавлен дополнительный номер %s для фамилия %s %n", number, surname);
            }else {
                System.out.printf("Номер %s для фамилии %s уже существует %n", number, surname);
            }
        }else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.printf("В справочник добавлены новй номер %s и фамилия %s %n", number, surname);
        }
    }

    public List<String> get(String surname){
        if (book.containsKey(surname)){
            return book.get(surname);
        }else {
            System.out.printf("Нет записи для фамилии %s %n", surname);
            return new  ArrayList<>();
        }
    }
}
