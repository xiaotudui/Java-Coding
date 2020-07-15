package Allocation;

public class LocalVarGC {
    public void locaVarGC(){
        {
            byte[] buffer = new byte[10*1024*1024];
        }
        int num = 10;
        System.gc();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC test = new LocalVarGC();
        test.locaVarGC();
    }
}
