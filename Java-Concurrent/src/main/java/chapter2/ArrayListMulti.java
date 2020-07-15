package chapter2;

import java.util.ArrayList;

public class ArrayListMulti {
    static ArrayList<Integer> a1 = new ArrayList<Integer>(10);

    public static class AddThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                a1.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new AddThread());
        Thread thread1 = new Thread(new AddThread());
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(a1.size());
    }
}
