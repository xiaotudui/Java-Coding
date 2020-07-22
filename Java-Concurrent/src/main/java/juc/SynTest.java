package juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Syn implements Runnable{
    public static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();

        try{
            while(true);
        }finally {
            lock.unlock();
        }
    }
}
public class SynTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Syn());
        Thread thread1 = new Thread(new Syn());
        thread.start();
        Thread.sleep(1000);
        thread1.start();

        System.out.println(thread.getState());
        System.out.println(thread1.getState());

    }
}
