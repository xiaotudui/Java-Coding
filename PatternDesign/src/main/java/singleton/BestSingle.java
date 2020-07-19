package singleton;


public class BestSingle {
    private BestSingle(){
        System.out.println("Best single constructor");
    }

    private static class SingleHolder{
        private static BestSingle instance = new BestSingle();
    }

    public static BestSingle getInstance(){
        return SingleHolder.instance;
    }
}
