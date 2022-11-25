package less2;

public class MyArrayDataException extends Exception {
    int i;
    int j;

 public MyArrayDataException(int i, int j) {
        this.i= i;
        this.j =j;
    }
}
