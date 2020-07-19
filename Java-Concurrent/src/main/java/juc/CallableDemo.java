package juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("Call method");
        Thread.sleep(4000);
        return 1024;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        FutureTask futureTask = new FutureTask(myThread);
        FutureTask<Integer> integerFutureTask = new FutureTask<>(myThread1);
        Thread thread = new Thread(futureTask);
        Thread thread1 = new Thread(integerFutureTask);
        thread1.start();
        thread.start();
        System.out.println(futureTask.isDone());
        System.out.println(futureTask.get());

    }
}
