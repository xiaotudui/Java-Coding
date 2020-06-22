package Stack;

import javax.sound.midi.Soundbank;

public class stack {
    public static void main(String[] args) {
        stack stack = new stack();
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
