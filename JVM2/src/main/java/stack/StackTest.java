package stack;

import java.util.ArrayList;

public class StackTest {
    static int a = 1;

    public StackTest() {

    }

    private int method1(int d){
        int b = d;
        System.out.println(a);
        method2();
        return b+d;
    }

    private void method2(){
        System.out.println("Mathod2 print");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
