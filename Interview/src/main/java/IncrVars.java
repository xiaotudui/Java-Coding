import org.junit.Test;

public class IncrVars {

    @Test
    public void test1(){
        int i = 1;
        i = ++i;
        System.out.println(i);
    }

    @Test
    public void test2(){
        int i = 1;
        i = i++;
        System.out.println(i);
    }
}
