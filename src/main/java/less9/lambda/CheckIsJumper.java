package less9.lambda;

public class CheckIsJumper implements CheckAble {
    public boolean test (Animal animal){
        return animal.isCanJump();
    }
}
