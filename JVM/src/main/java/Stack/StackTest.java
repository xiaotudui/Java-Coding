package Stack;


public class StackTest {
    static int a = 1;
    public static void main(String[] args) {
        System.out.println(a);
        StackTest stack = new StackTest();
        stack.method1();
    }

    public void method1(){
        System.out.println("Method1 begin");
        method2();
        System.out.println("Method1 end");
    }

    private void method2() {
        System.out.println("Method2 begin");
        method1();
        System.out.println("Method2 end");
    }


}
