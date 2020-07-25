package build;

class Parent{
    static int value = 123;
    static{
        System.out.println("Parent");
    }
    public Parent() {
        showMe();
    }

    public void showMe(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
//    static int value = 123;
    static {
        System.out.println("Child");
    }
    public Child() {
        showMe();
    }

    @Override
    public void showMe() {
        super.showMe();
    }
}
public class BuildTest {
    public static void main(String[] args) {
        System.out.println(Child.value);
    }
}
