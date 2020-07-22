public class SingleTon {
    private SingleTon(){
        System.out.println("Complete");
    }

    private static class SingleTonClass{
        private static SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance(){
        return SingleTonClass.instance;
    }

}
