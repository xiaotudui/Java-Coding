package juc;

interface Foo{
    int add(int x, int y);
    default int div(int x, int y){
        return x / y;
    }
}
public class LambdaExpress {
}
