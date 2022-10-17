package lesson5;

public class Worker {

    private String name;
    private String profession;
    private String email;
    private int tel;
    private int many;
    private int age;

    public Worker(String name, String profession, String email, int tel, int many, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
        this.many = many;
        this.age = age;
    }
    public void printInfo(){
        System.out.println(String.format(" ФИО: %s Профессия: %s email: %s Телефон: %s Зарплата: %s Воздаст: %s ", name, profession, email, tel, many, age));
    }
}
