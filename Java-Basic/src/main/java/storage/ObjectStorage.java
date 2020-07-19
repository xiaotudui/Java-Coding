package storage;


import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

class Hello{
    String name = "Hello Class";
    int version = 1;

    void say(){
        String method = "say() method";
        System.out.println("hello");
    }

    void printNum(Byte num){
        System.out.println("Byte " + num);
    }

    void printNum(Long num){
        System.out.println("Long " + num);
    }

    void varArgs(String s){
        System.out.println("One var");
    }

    void varArgs(String... args){
        System.out.println("varArgs method");
        for(String arg: args)
            System.out.println(arg);
    }

    void method(Integer a, Integer b){
        a = 100;
        b = 200;
    }
}

public class ObjectStorage {

    public static void main(String[] args) {
        int number = 211;
        Integer number212 = new Integer(212);
        System.out.println(ClassLayout.parseInstance(number).toPrintable());
        System.out.println(ClassLayout.parseInstance(number212).toPrintable());

        Hello hello = new Hello();
        hello.say();
        System.out.println(ClassLayout.parseInstance(hello).toPrintable());
    }

    @Test
    public void test01(){
        Hello time = new Hello();
        System.out.println(time.getClass().getCanonicalName());
        System.out.println(time.getClass().getSimpleName());

        System.out.println(new Hello().getClass().getName());
    }

    @Test
    public void test02(){
        Hello hello = new Hello();
        hello.varArgs("hello", "my", "args");
        hello.varArgs("hello");
    }

    @Test
    public void test03(){
        int a = 10;
        int b = 20;
        Hello hello = new Hello();
        hello.method(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test04(){
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr);

        char[] arr1 = new char[]{'a', 'b', 'c'};
        System.out.println(arr1);
    }






}
