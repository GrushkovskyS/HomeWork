package less1;

public class Main {

    public static void main(String[] args) {
        Players[] players = {new Cat(), new Turtle(), new Wolf()};
        Obstacle [] obstacles ={new Cross(100), new Water(50),new Jump(5)};

        Team team = new Team("Доходяги", players);

        System.out.println("Готовится новая команда:");
        System.out.println(team.getTeamName());


        Course course = new Course(obstacles);
        System.out.println("На старт! Внимание! МАРШ!");
        course.done(team);
        System.out.println("Результаты команды:");
        team.showResult();

    }
}
