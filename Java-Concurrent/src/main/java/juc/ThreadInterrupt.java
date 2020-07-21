package juc;

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (o){
                while (true) {

                    System.out.println("I am alive");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }
            }
        }, "t1");

        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
//        while(true){
//            System.out.println(t1.isInterrupted());
//        }

    }
}
