package juc.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class NonReentrantLock {
    private static class Sync extends AbstractQueuedSynchronizer{
        @Override
        protected boolean isHeldExclusively() {
            return super.isHeldExclusively();
        }


    }
}
