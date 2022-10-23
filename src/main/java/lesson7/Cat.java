package lesson7;

import java.util.Random;

public class Cat {
     String name;//имя кота
     int appetite; //сколько кот съедает за раз
        int catFull;//сколько коту нужно сьесть до полного насыщени
      int startFull; //насыщение кота

     boolean fullness;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.catFull = 0;
        this.startFull = appetite;
        this.fullness = false;
    }
    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getCatFull() {
        return catFull;
    }

    public int getStartFull() {
        return startFull;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void eat(Plate plate) {
       if (this.fullness){
           return;
       }
       if (plate.decreaseFod(appetite)) {
           System.out.printf("Котик %s съел %s корма%n", name, appetite);
          catFull += appetite;
           if (catFull == appetite) {
               fullness = true;

           }

       }
    }
}
