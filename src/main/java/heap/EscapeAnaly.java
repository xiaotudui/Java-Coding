package heap;

import org.junit.Test;

public class EscapeAnaly {

    public int notEscape(){
        byte[] bigSize = new byte[1024 * 1024 * 10];
        return bigSize.length;
    }

    @Test
    public void test(){
        int i = notEscape();
    }
}
