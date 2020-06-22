package heap;

import java.util.ArrayList;

public class CreateObject {
    public static void main(String[] args) {
        ArrayList<byte[]> bigSize = new ArrayList<>();
        while(true){
            try {
                Thread.sleep(1000);
                bigSize.add(new byte[1024 * 1024 * 2]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
