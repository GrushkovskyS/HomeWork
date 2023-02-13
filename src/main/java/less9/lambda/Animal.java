package less9.lambda;

public class Animal {

    private String name;
    private boolean canJump;
    private boolean camRun;

    public Animal(String name, boolean canJump, boolean camRun) {
        this.name = name;
        this.canJump = canJump;
        this.camRun = camRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    public boolean isCamRun() {
        return camRun;
    }

    public void setCamRun(boolean camRun) {
        this.camRun = camRun;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", canJump=" + canJump +
                ", camRun=" + camRun +
                '}';
    }
}
