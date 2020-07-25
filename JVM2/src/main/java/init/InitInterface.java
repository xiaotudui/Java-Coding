package init;
interface hello{
    void printHello();
}

public class InitInterface implements hello{
    @Override
    public void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        InitInterface initInterface = new InitInterface();
        initInterface.printHello();
    }
}
