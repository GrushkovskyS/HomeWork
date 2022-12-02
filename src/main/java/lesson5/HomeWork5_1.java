package lesson5;

public class HomeWork5_1 {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Вася", "Директор", "dir@mail.ru", 413060,3000,40);
        Worker worker2 = new Worker("Света", "Бухгалтер","buh@mail.ru", 609865, 2500,54);
        Worker worker3 = new Worker("Петя", "Манагер", "mai@mail.ru", 687457, 2220,32);
        Worker worker4 = new Worker("Эдик", "Аналитик", "an@mail.ru", 439433, 2000,23);
        Worker worker5 = new Worker("Антон", "Дворник", "dv@mailru", 777777,1500,66);

        Worker[] workers = {worker1, worker2, worker3, worker4, worker5};
        for (Worker worker : workers){
            worker.printInfo();
        }
    }
}
