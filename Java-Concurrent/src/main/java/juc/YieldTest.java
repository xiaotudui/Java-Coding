package juc;

public class YieldTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                Thread.yield();
                for (int i = 0; i < 100; i++) {

                }
            }
        }, "t1");

        t1.start();
        while(true){
            Thread.State state = t1.getState();
            if(state != Thread.State.RUNNABLE)
                System.out.println(state);
        }

    }
}
