package staticuse;

public class StaticTest {
    static{
        name = "test";
        System.out.println("static code area");
    }

    static String name = "Static";

    {
        System.out.println("no static code area");
    }

    public static void test(){
        System.out.println("static method");
        StaticTest staticTest = new StaticTest();
    }
}

class Test{
    public static void main(String[] args) {
//        System.out.println(StaticTest.name);
//        StaticTest staticTest = new StaticTest();
//        staticTest.name = "name";
//        System.out.println(staticTest.name);
//        staticTest.test();
        System.out.println(StaticTest.name);
//        StaticTest staticTest = new StaticTest();
    }
}

class A{
    String name = "A method";
    static {
        System.out.println("A method");
    }
    void test(){
        System.out.println("A method");
    }

//    abstract void test01();
}

class B extends A{

    @Override
    public void test() {
        super.test();
    }

    public static void main(String[] args) {
        final A a = new A();
//        a = new B();


    }
}

class C{
    public C() {
        System.out.println("C");
    }
}

class D{
    public static void main(String[] args) {
        C c = new C();
    }
}


