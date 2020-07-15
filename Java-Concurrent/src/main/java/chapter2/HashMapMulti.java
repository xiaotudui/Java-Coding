package chapter2;

import java.util.HashMap;
import java.util.Map;

public class HashMapMulti {
    static Map<String, String> map = new HashMap<String, String>();

    public static class AddThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                map.put(Integer.toString(i), Integer.toBinaryString(i));
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
        System.out.println(map.size());

    }
}
