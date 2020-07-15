package heap;

import org.openjdk.jol.info.ClassLayout;

import javax.print.DocFlavor;

public class ObjectHeader {
    public static void main(String[] args) {

//        String str_new = new String("Hello World");
//        System.out.println(ClassLayout.parseInstance(str_new).toPrintable());
//        System.out.println(str_new.hashCode());
//        System.out.println(ClassLayout.parseInstance(str_new).toPrintable());
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(ClassLayout.parseInstance(arr).toPrintable());

    }
}
