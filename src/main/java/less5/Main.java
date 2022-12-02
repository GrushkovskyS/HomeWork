package less5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.load("test.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("test1.txt");
    }
}
