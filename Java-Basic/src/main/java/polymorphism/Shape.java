package polymorphism;

import org.openjdk.jol.info.ClassLayout;

public class Shape {
    public void draw(){
        System.out.println("Shape drawing");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(ClassLayout.parseInstance(c).toPrintable());

        Shape s = new Circle();
        System.out.println(ClassLayout.parseInstance(s).toPrintable());
        s.draw();



    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle drawing");
    }
}
