package GC;

public class SafeRegion {
    public static void main(String[] args) throws InterruptedException {
        byte[] bigSize = new byte[10 * 1024 * 1024];
        bigSize = null;
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.gc();
        }).start();
        Thread.sleep(10000);
    }
}
