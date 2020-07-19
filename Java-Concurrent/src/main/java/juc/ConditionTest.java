package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Order{
    private int num = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final Condition condition2 = lock.newCondition();
    private final Condition condition3 = lock.newCondition();

    public void print_1_5() throws InterruptedException {
        lock.lock();
        try {
            while(num != 1){
                condition.await();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + num);
            }

            num = 2;
            condition2.signal();
        }finally {
            lock.unlock();
        }

    }
    public void print_2_10() throws InterruptedException {
        lock.lock();
        try {
            while(num != 2){
                condition.await();
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + num);
            }

            num = 3;
            condition3.signal();
        }finally {
            lock.unlock();
        }

    }
    public void print_3_15() throws InterruptedException {
        lock.lock();
        try {
            while(num != 3){
                condition.await();
            }

            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + " " + num);
            }

            num = 1;
            condition.signal();
        }finally {
            lock.unlock();
        }

    }
}
public class ConditionTest {
    public static void main(String[] args) {
        Order order = new Order();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    order.print_1_5();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    order.print_2_10();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    order.print_3_15();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
    }
}
