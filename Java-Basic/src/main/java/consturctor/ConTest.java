package consturctor;

public class ConTest {
    private String name = "name";

//    private ConTest(){
//        System.out.println("Private");
//    }

    ConTest(int i){
        System.out.println("Default");
    }

    protected ConTest(int i, int j){
        System.out.println("Protected");
    }

    public ConTest(int i, int j, int k){
        System.out.println(name);
        System.out.println("Public");
    }

}
