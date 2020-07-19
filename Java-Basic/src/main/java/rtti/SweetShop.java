package rtti;

import org.openjdk.jol.info.ClassLayout;

// typeinfo/SweetShop.java
// 检查类加载器工作方式
class Cookie {
    static { System.out.println("Loading Cookie"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}

class Candy {
    static { System.out.println("Loading Candy"); }
}

public class SweetShop {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");

        Candy candy = new Candy();
        System.out.println(candy);
        Class<? extends Candy> aClass = candy.getClass();
        System.out.println(ClassLayout.parseClass(aClass).toPrintable());
        System.out.println(aClass);

    }
}

