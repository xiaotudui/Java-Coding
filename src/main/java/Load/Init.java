package Load;
class SuperClass{
    static {
        System.out.println("Super class");
    }
    static int value = 12;
}

class SubClass extends SuperClass{
    static {
        System.out.println("Sub Class");
    }
}
public class Init {
    public static void main(String[] args) {
//        System.out.println(SuperClass.value);
        SuperClass[] superClasses = new SuperClass[10];
    }

}
