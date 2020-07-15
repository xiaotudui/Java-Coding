package GC;

import java.util.ArrayList;

public class SafePoint {
    public static void main(String[] args) {
        while(true){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        }
    }
}
