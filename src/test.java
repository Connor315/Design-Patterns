import java.util.Observable;
import java.util.Observer;

public class test {
    public static int num = 10;
    final int num1 = 20;
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}

