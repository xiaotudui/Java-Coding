package polymorphism;


class Lunch{
    static int a = 5;
    static{
        System.out.println(a);
        System.out.println("Lunch start");
    }
    Lunch(){
        System.out.println("Lunch initalize");
    }
}
public class Sandwich extends Lunch{
    static{
        System.out.println("Sandwich start");
    }
    public Sandwich() {
        System.out.println("Sandwich initalize");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Sandwich sandwich = new Sandwich();
    }
}
