package classloader;

import org.openjdk.jol.info.ClassLayout;

public class ClassLoaderTest {
    public static void main(String[] args) {
//        ClassLoaderTest test = new ClassLoaderTest();
//        System.out.println(ClassLayout.parseInstance(test).toPrintable());
//
//        Class<? extends ClassLoaderTest> aClass = test.getClass();
//        System.out.println(ClassLayout.parseInstance(aClass).toPrintable());
//        Class<ClassLoaderTest> classLoaderTestClass = ClassLoaderTest.class;
//        System.out.println(ClassLayout.parseInstance(classLoaderTestClass).toPrintable());

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
//        System.out.println(ClassLayout.parseInstance(systemClassLoader).toPrintable());
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}
