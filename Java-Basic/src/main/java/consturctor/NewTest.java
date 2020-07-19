package consturctor;

public class NewTest {
    String name = "father";
    NewTest(){
        System.out.println("Father");
    }

    protected void test(){
        System.out.println("father test method");
    }
}

class NewTestChild extends NewTest{

    String name = "child";

    public NewTestChild() {
        System.out.println("Child");
    }

    @Override
    public void test() {
        System.out.println("child test method");
    }

    public void childtest(){
        System.out.println("child only method");
    }

    public static void main(String[] args) {
        NewTest newTestChild = new NewTestChild();
        newTestChild.test();
        System.out.println(newTestChild.name);

        System.out.println(newTestChild instanceof NewTest);
        System.out.println(newTestChild instanceof NewTestChild);
        System.out.println(newTestChild instanceof Object);

        String tudui = new String("tudui");
        String tudui1 = new String("tudui");
        String tudui2 = "tudui";
        System.out.println(tudui == tudui1);
        System.out.println(tudui == tudui2);
        System.out.println(tudui.hashCode());
        System.out.println(tudui1.hashCode());
        System.out.println(tudui.equals(tudui2));

        float f = 5.13f;
        System.out.println(String.valueOf(f));

        Object o1 = true? new Integer(1): new Double(2.0);
        System.out.println(o1);

        Integer integer = new Integer(1);
        Integer integer1 = new Integer(1);
        System.out.println(integer == integer1);

        Integer i1 = 2;
        Integer i2 = 2;
        System.out.println(i1 == i2);

    }
}
