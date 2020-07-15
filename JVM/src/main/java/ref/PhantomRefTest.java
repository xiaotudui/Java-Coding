package ref;


import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomRefTest {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<String> refQueu = new ReferenceQueue<>();

        PhantomReference<String> refPhantom = new PhantomReference<>(new String("Hello World"), refQueu);
        System.out.println(refPhantom.get());

        System.gc();
        System.out.println(refQueu.remove());

    }
}
