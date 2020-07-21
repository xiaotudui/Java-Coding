package juc;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (o){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1");


        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o) {
                System.out.println("Two get the lock");
            }
        }, "t2");

        t1.start();
        t2.start();
        Thread.sleep(1000);
        while(true){
            Thread.sleep(1000);
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        }

    }
}
