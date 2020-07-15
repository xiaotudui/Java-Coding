package heap;

import org.openjdk.jol.info.ClassLayout;

public class TestGCAge {
    public static void main(String[] args) {
        Integer integer = new Integer(5);
        System.out.println(ClassLayout.parseInstance(integer).toPrintable());
        System.gc();
        System.out.println(ClassLayout.parseInstance(integer).toPrintable());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
        System.out.println(ClassLayout.parseInstance(integer).toPrintable());


    }
}
