package juc;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("I am alive");
            while (true){
                Thread.yield();
            }
        }, "t1");

        thread.start();
        thread.join();

//        while(true){
//
//            System.out.println(thread.getState());
//            System.out.println(Thread.currentThread().getState());
//        }


    }
}
