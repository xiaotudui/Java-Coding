package lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockInterrupt {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {
            try {
                lock.lockInterruptibly();
                while (true) ;
            } catch (Exception e) {
                System.out.println("Interrupt");
                e.printStackTrace();
            }
        }, "t1");

        t1.start();
        t1.interrupt();

    }
}
