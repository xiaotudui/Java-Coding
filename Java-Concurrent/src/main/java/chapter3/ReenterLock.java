package chapter3;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    static {
        System.out.println(lock.tryLock());
        System.out.println(lock.getQueueLength());
    }
    public static int i = 0;
    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            System.out.println(lock.tryLock());
            System.out.println(lock.isLocked());
            System.out.println(lock.getQueueLength());
            lock.lock();
            i++;
            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ReenterLock());
        Thread thread1 = new Thread(new ReenterLock());
        System.out.println(new Date());
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(new Date());
        System.out.println(i);
    }
}
