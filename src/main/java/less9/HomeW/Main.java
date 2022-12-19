package less9.HomeW;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", Arrays.asList(new Course("Математика"), new Course("Биология") , new Course("История"))));
        students.add(new Student("Петров", Arrays.asList(new Course("Математика"), new Course("География") , new Course("Физика"), new Course("Химия"))));
        students.add(new Student("Сидоров", Arrays.asList(new Course("Геометрия"), new Course("Биология") , new Course("История") ,new Course("Информатика"))));

        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));
        System.out.println();

        System.out.println(students.stream()
                .sorted((s1, s2)->s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));
        System.out.println();

        Course course = new Course("Химия");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));

    }

}
