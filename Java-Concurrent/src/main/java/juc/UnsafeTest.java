package juc;

import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

public class UnsafeTest {

    @CallerSensitive
    public static void main(String[] args) {
        Class<?> callerClass = Reflection.getCallerClass();
        System.out.println(callerClass.getSimpleName());
    }
}
