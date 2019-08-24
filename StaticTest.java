public class StaticTest {
    public void hello() {
    System.out.println("nonstatic");
    // I can call static
    helloS();
    }

    public static void helloS() {
    System.out.println("stati00c");
    }

    public static void main(String[] args) {
    helloS();
    //I cannot call static
    //hello();
    }
}