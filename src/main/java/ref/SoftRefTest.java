package ref;

import java.lang.ref.SoftReference;

public class SoftRefTest {

    public static void main(String[] args) {
        SoftReference<String> softReference = new SoftReference<>(new String("Hello World"));
        System.out.println(softReference.get());

        System.gc();
        // 根据 老年代 大小进行设置，占满内存
        byte[] bigSize = new byte[1024 * 7168 - 354 * 1024];
        System.out.println(softReference.get());
    }
}
