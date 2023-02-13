package less1;
public class Team {

    String teamName;
    Players[] teamMembers = new Players[3];

    public Team(String teamName, Players[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public void showResult(){
        for (Players c: teamMembers){
            c.showResult();
        }
    }

    public void showFinish(){
        for (Players c: teamMembers) {
            if(c.isOnDistance())
                c.showResult();
        }
    }


    public String getTeamName() {
        return teamName;
    }

    public Players[] getTeamMembers() {
        return teamMembers;
    }
}
