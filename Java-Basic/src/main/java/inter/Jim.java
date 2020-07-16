package inter;

// interfaces/Jim.java
import java.util.*;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }

    static void test(){
        System.out.println("Jim1 test");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        System.out.println(Jim2.class.getClass().getName());
//        System.out.println(Jim2.class.getSuperclass().getName());
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
        Jim1.test();
    }
}
