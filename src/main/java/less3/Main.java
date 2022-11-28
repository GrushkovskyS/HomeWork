package less3;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Задание1.
        String [] arr = {"one", "two", "three"};
        System.out.println(Arrays.toString(arr));
        swapingElements(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

// Задание2.
        List<String> list = convertToList(arr);


        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox = new Box();
        Box<Apple> appleBoxEmpty = new Box();
        Box<Orange> orangeBox = new Box();
        Box<Orange> orangeBoxEmpty = new Box();

        for (int i = 0; i < 3; i++) {
            appleBox.add(new Apple());
        }

        for (int i = 0; i < 5; i++) {
            orangeBox.add(new Orange());
        }

        appleBox.info();
        appleBoxEmpty.info();
        orangeBox.info();
        orangeBoxEmpty.info();

        Float appleWeight = appleBox.getWeight();
        Float appleEmptyWeight = appleBoxEmpty.getWeight();
        Float orangeWeight = orangeBox.getWeight();
        Float orangeEmptyWeight = orangeBoxEmpty.getWeight();

        System.out.println("Коробка с яблоками весит: " + appleWeight);
        System.out.println("Коробка пустая для яблок весит: " + appleEmptyWeight);
        System.out.println("Коробка с апельсинами весит: " + orangeWeight);
        System.out.println("Коробка пустая для апельсин весит: " + orangeEmptyWeight);
        System.out.println("Сравним вес коробки яблок с коробкой апельсин " + appleBox.compare(orangeBox));
        System.out.println("Сравним вес кобобки для яблок с коробкой для апельсин " + appleBoxEmpty.compare(orangeBoxEmpty));

        appleBox.moveAt(appleBoxEmpty);

        appleBox.info();
        appleBoxEmpty.info();
        orangeBox.info();
        orangeBoxEmpty.info();
    }


    private static <T> void swapingElements(T[] array, int i1, int i2) {
        T i = array[i1];
        array[i1] =array[i2];
        array[i2] =i;
    }
    private static <M> List<M> convertToList(M[] array) {
        return Arrays.asList(array);
    }
}
