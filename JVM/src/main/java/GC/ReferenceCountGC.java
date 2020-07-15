package GC;

public class ReferenceCountGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;
    // 每个对象中包含2M的成员，方便观察
    private byte[] bigSize = new byte[2 * _1MB];
    public static void main(String[] args) {
        ReferenceCountGC objA = new ReferenceCountGC();
        ReferenceCountGC objB = new ReferenceCountGC();
        objA.instance = objB.instance;
        objB.instance = objA.instance;

        //取消对对象的引用
        objA = null;
        objB = null;
        System.gc();
    }
}
