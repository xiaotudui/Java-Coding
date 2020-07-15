package ref;

import java.lang.ref.WeakReference;

public class WeakRefTest {
    public static void main(String[] args) {
        WeakReference<String> weakReference = new WeakReference<>(new String("Hello World"));
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
    }
}
