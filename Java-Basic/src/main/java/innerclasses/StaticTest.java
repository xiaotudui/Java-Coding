package innerclasses;

public class StaticTest {
    static class InnerClass{
        static{
            System.out.println("InnerClass Loading");
        }
    }

    public static void main(String[] args) {
        final StaticTest staticTest = new StaticTest();
    }
}
