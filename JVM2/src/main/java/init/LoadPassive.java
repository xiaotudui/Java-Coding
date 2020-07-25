package init;

class Parent{
    static int value = 321;
    static final int val = 110;
    static {
        System.out.println("Parent class initalize");
    }
}

class Child extends Parent{
    static int value = 123;
    static{
        System.out.println("Child class initalize");
    }
}

public class LoadPassive {
    public static void main(String[] args) {
        System.out.println(Parent.val);
        System.out.println(Child.value);
//        System.out.println(Parent.value);
    }
}
