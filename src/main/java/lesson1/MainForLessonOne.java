package lesson1;

public class MainForLessonOne {
    public static void main(String[] args){
  //      System.out.println("Hello, world!");

        /* printHello();
           printHello();
           System.out.println("Вызов метода окончен");*/

        testVars();
    }

    private static void printHello(){
    System.out.println("Привет");
    System.out.println("Мы в методе printHello");
}

    private static void testVars() {
        int varA = 5;
        int varB = 2;
        System.out.println((double)varA / varB);
    }

}

