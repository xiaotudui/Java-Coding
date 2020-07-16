package chapter3;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;
    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
//            lock.lock();
            lock.lock();
            i++;
            lock.unlock();
            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock reenterLock = new ReenterLock();
        Thread thread = new Thread(reenterLock);
        Thread thread1 = new Thread(reenterLock);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(i);
    }
}
