package less1;

import com.sun.security.jgss.GSSUtil;

public abstract class Animal implements Players {

    protected String viev;
    protected String name;
    protected int maxRunDistance ;
    protected int maxSwimDistance;
    protected int maxJumpDistance;

    boolean onDistance;


    public Animal(String viev, String name, int maxRunDistance, int maxSwimDistance, int maxJumpDistance) {
        this.viev = viev;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.onDistance =true;
    }

    public void run (int distance){
        if (distance <= maxRunDistance){
            System.out.printf("%s по кличке %s успешно прошёл забег %n",viev,name);
        }else {
            System.out.printf("%s по кличке %s не справился с забегом %n",viev,name);
            onDistance =false;
        }
    }
    public void swim (int distance){
        if (maxSwimDistance == 0){
            System.out.printf("%s по кличке %s не умеет плавать %n",viev,name);
            onDistance =false;
            return;
        }
        if (distance < maxSwimDistance){
            System.out.printf("%s по кличке %s успешно прошёл заплыв %n",viev,name);
        }else {
            System.out.printf("%s по кличке %s не справился с заплывом %n",viev,name);
            onDistance =false;
        }
    }
    public void jump (int distance){
        if (maxJumpDistance == 0){
            System.out.printf("%s по кличке %s не умеет прыгать %n",viev,name);
            onDistance =false;
            return;
        }
        if (distance <= maxJumpDistance){
            System.out.printf("%s по кличке %s успешно перепрыгнул препядствие %n",viev,name);
        }else {
            System.out.printf("%s по кличке %s не справился с препядствием %n",viev,name);
            onDistance =false;
        }
    }

    public void showResult() {
        if (onDistance) {
            System.out.println(viev + " " + name + " : " + "Финишировал!");
        }else {
            System.out.println(viev + " " + name + " : " + "Сошёл с дистанции!");
        }
    }
    public boolean isOnDistance() {
        return onDistance;
    }
}
