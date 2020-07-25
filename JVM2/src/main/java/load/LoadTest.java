package load;


import org.openjdk.jol.info.ClassLayout;

//加载 连接（验证，准备，解析）  初始化  使用 卸载
public class LoadTest {
    static int value = 123;
    static String str = "hello world";
    static{
        System.out.println(str);
    }
    public static void main(String[] args) {
//        LoadTest loadTest = new LoadTest();
//        System.out.println(ClassLayout.parseInstance(LoadTest.class).toPrintable());
//        System.out.println(ClassLayout.parseClass(LoadTest.class).toPrintable());
//        System.out.println(loadTest.getClass().hashCode());
//        System.out.println(LoadTest.class.hashCode());


//        System.out.println(ClassLayout.parseInstance(LoadTest.class).toPrintable());

//        System.out.println(ChildLoadValidate.value);
        ChildLoadValidate childLoadValidate = new ChildLoadValidate();
        ChildLoadValidate childLoadValidate1 = new ChildLoadValidate();
        System.out.println(childLoadValidate.getClass().hashCode());
        System.out.println(childLoadValidate1.getClass().hashCode());
        System.out.println(ClassLayout.parseInstance(childLoadValidate.getClass()).toPrintable());
    }
}

class LoadValidate{
    static int value = 123;
    public LoadValidate() {
        value = 144;
        printValue();
    }
    public void printValue(){
        System.out.println("Parents "+value);
    }
}

class ChildLoadValidate extends LoadValidate{
    static int value = 321;
    public ChildLoadValidate() {
        printValue();
    }

    @Override
    public void printValue() {
        System.out.println("Child "+ value);
    }
}
