package polymorphism;

import org.openjdk.jol.info.ClassLayout;

class Super{
    public int field = 0;
}

class Sub extends Super{
    public int field = 1;
}

public class FieldAccess {
    public static void main(String[] args) {
        Super aSuper = new Sub();
        System.out.println(aSuper.field);
        System.out.println(ClassLayout.parseInstance(aSuper).toPrintable());

        Sub sub = new Sub();
        System.out.println(sub.field);
        System.out.println(ClassLayout.parseInstance(sub).toPrintable());
    }
}
