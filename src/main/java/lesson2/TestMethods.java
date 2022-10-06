package lesson2;

public class TestMethods {

    public static void main(String[] args){

        boolean isReward = rewardEmployee("Вася",0);
        System.out.println(isReward);
        System.out.println(rewardEmployee("Петя",300));
        System.out.println(rewardEmployee("Ксюша",500));

        int result = aad(3,5);
        System.out.println(result);
        System.out.println(aad(5,7));
    }

    private static boolean rewardEmployee(String name, int premium) {

        if (premium <=0) {
            System.out.println("Не верное значение премии");
            return false;
        }

        System.out.println("Подготовить бумаги для премитования " + name);
        System.out.println("Зачистяем на карточку срезства для " + name + " на сумму " + premium);
        System.out.println("Процесс заверщён");
        System.out.println();
        return true;
    }

    private static int aad(int a, int b) {
        return a + b;
    }
}
