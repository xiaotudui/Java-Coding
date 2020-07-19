package consturctor;

import java.lang.String;


public class ThisConstructor {
    protected String name;
    int version;
    String date;

    public ThisConstructor() {
        name = "No args";
    }

    public ThisConstructor(int version){
        this();
        this.version = version;
    }

    static class Test{
        public static void main(String[] args) {
            ThisConstructor thisConstructor = new ThisConstructor(1);
            System.out.println(thisConstructor.name);
            System.out.println(thisConstructor.version);
            System.out.println(thisConstructor.date);
        }
    }

}

