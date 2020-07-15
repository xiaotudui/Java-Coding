package OOM;

import java.util.ArrayList;

public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<OOMObject>();
        int i = 0;
        while(true){
            list.add(new OOMObject());
            i++;
            System.out.println(i);
        }
    }
}
