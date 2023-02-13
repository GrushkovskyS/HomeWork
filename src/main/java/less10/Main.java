package less10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n);
        String s = new String("Newcompany");
        System.out.println(s);
        String str = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                str = "B";
            } else {
                str = "Y";
            }
            str +="";
            System.out.print(str);
        }
    }
}
