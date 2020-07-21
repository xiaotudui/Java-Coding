package threadlocal;


public class InheritThreadLocalTest {
    public static void main(String[] args) throws InterruptedException {
        InheritableThreadLocal<String> local = new InheritableThreadLocal<>();
        local.set("hello");
        local.set("world");

        new Thread(()->{
            System.out.println(local.get());
            local.remove();
            System.out.println(local.get());
        }).start();

        Thread.sleep(100);
        System.out.println(local.get());

    }
}
