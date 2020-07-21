package countdown;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownTest implements Runnable{
    static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        CountDownTest countDownTest = new CountDownTest();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            executorService.submit(countDownTest);
        }
        countDownLatch.await();
        System.out.println("Fire");


    }

    @Override
    public void run() {
        try{
            Thread.sleep(new Random().nextInt(10)*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Complete");
        countDownLatch.countDown();
    }
}
