package chapter2;


public class BadLockOnInteger implements Runnable{
    public static Long i = 0L;
    static BadLockOnInteger instance = new BadLockOnInteger();

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            synchronized (i){
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(instance);
        Thread thread1 = new Thread(instance);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(i);
    }
}
