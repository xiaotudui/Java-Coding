package semaphore;

import java.util.concurrent.Semaphore;

public class SemTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        Thread t1 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName());
                while (true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName());
                while (true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }, "t2");

        t1.start();
        t2.start();
        while(true){
            Thread.sleep(1000);
            System.out.println(t2.getState());
        }


    }
}
