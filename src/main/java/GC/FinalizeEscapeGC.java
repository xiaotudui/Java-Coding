package GC;

import javax.swing.tree.VariableHeightLayoutCache;

public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    private byte[] bigSize = new byte[5*1024*1024];

    public void isAlive(){
        System.out.println("Yes, i am alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
            System.gc();
        }else {
            System.out.println("Dead");
            System.gc();
        }
    }
}
