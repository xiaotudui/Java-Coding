package juc;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" Start");
            lock.lock();
            try{
                condition.await();
                System.out.println(Thread.currentThread().getName()+" get the lock");
                while(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" Start");
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName()+" get the lock");
                while(true);
            }finally {
                lock.unlock();
            }
        }, "t2");

        t1.start();
        t2.start();

        Thread.sleep(1000);
        t1.stop();
        while(true){
            Thread.sleep(1000);
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        }


    }
}
