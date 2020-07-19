package juc;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket {
    private int num = 10000000;
    Lock lock = new ReentrantLock();
    public void sale(){
        if(Thread.currentThread().getState() != Thread.State.RUNNABLE)
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
        lock.lock();
        if(num > 0){
//            System.out.println(Thread.currentThread().getName() + " sales, and has " + --num);
        }
        lock.unlock();
    }
}

public class SaleTicket {
    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket();
//        Thread a = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(true)
//                    ticket.sale();
//            }
//        }, "A");
//
//        Thread b = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true)
//                    ticket.sale();
//            }
//        }, "B");

        Thread a = new Thread(() -> {
            while (true)
                ticket.sale();
        }, "A");

        Thread b = new Thread(() -> {
            while (true)
                ticket.sale();
        }, "B");

        System.out.println(a.getState());
        a.start();
        b.start();
        System.out.println(a.getState());
        a.join();
        b.join();


    }
}
