package heap;

import org.openjdk.jol.info.ClassLayout;

public class TestTenuringThreshold {
    private static final int _1MB = 1024 * 1024;
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
//        System.out.println(ClassLayout.parseInstance(allocation1).toPrintable());
        Thread.sleep(2000);
        allocation2 = new byte[_1MB * 4];
        Thread.sleep(2000);
        allocation3 = new byte[_1MB * 4];
        Thread.sleep(2000);
        allocation3 = null;
        Thread.sleep(2000);
        allocation3 = new byte[_1MB * 4];
//        System.out.println(ClassLayout.parseInstance(allocation1).toPrintable());
    }
}
