import consturctor.ConTest;
import consturctor.ThisConstructor;
import hiding.HideTest;

public class Test extends ThisConstructor {
    @org.junit.Test
    public void main(String[] args) {
//        HideTest hideTest = new HideTest();
//        System.out.println(hideTest.s1);
//        ConTest conTest = new ConTest(1, 2, 4);
        System.out.println(super.name);

    }

    @org.junit.Test
    public void test01(){
//        System.out.println(super.s2);
    }
}
