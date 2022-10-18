package lesson6;

public abstract class Animal {

    private String name;
    private int run;
    private int swimming;
    private String animal;

    public Animal(String name, int run, int swimming,String animal) {
        this.name =name;
        this.run = run;
        this.swimming = swimming;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    @Override
    public String toString() {
        return String.format("%s %s может пробежать %s метров и проплыть %s метров.", animal, name, run, swimming);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public abstract void doAction();
}

