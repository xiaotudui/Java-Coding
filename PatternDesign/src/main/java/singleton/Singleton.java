package singleton;

class OneInstance{

    private static OneInstance instance = null;
    private OneInstance(){
    }

    public static synchronized OneInstance getInstance(){
        if(instance == null)
            instance = new OneInstance();
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {

    }

}
