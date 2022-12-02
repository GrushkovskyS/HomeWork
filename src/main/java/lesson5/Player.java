package lesson5;


public class Player {

    public static int playersCount;
   private String nickname;
    private int point;
    private int level;
    private int many;

//Конструктор через genereyt
    public Player(String nickname, int point, int level, int many) {
        setNickname(nickname); //все ники будус большими буквами
        this.point = point;
        this.level = level;
        this.many = many;

        playersCount ++;
    }
//перегруженный конструктор в ручную
    public Player(String nickname){
        this(nickname,10,80,300);
    }
    //второй перегруженный конструктор в ручную
    public Player(){
     this("");
    }
    public void printInfo(){
        System.out.println(String.format("Игрок %s(lvl %s) имеет %s очков и %s монет.", nickname, level,point, many));
    }

    public void action(){
        System.out.printf("Пользователь %s выполняет действие и получает 100 очков %n", nickname);
        point += 100;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname.toUpperCase();
    }

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        if (many <0){
            many = Math.abs(many);
        }
        this.many = many;
    }
}
