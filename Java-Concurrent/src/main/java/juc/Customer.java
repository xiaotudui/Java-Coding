package juc;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class InnerVar{
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int var = 0;

    public synchronized void add() throws InterruptedException {
        lock.lock();

        try {
            while(var > 0)
//                this.wait();
                condition.await();
            var++;
            System.out.println(var + " " + Thread.currentThread().getName());
//            this.notifyAll();
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public synchronized void des() throws InterruptedException {
        lock.lock();
        try {
            while(var < 0)
//                this.wait();
                condition.await();
            var--;
            System.out.println(var + " " + Thread.currentThread().getName());
//            this.notifyAll();
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

    public int getVar() {
        return var;
    }
}

public class Customer {
    public static void main(String[] args) throws Exception {
        InnerVar innerVar = new InnerVar();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    innerVar.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        final Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    innerVar.des();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread1.start();


        thread.join();
        thread1.join();
        System.out.println(innerVar.getVar());

    }
}
