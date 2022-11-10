package less1;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void done(Team team){
        Players [] teamMembers = team.getTeamMembers();
        if(teamMembers.length >= 0){
            for(Players c: teamMembers){
                for(Obstacle o: obstacles){
                    o.done(c);
                    if(!c.isOnDistance())
                        break;
                }
            }
        }
        else {
            System.out.println("Участники сошли с дестанции");
        }

    }
}
