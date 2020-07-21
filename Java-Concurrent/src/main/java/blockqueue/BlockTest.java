package blockqueue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BlockQ<E>{
    private int capacity;
    private int count;
    private int inputIndex;
    private int takeIndex;
    Lock lock = new ReentrantLock();
    final Object[] items;
    Condition notEmpty;
    Condition notFull;

    BlockQ(int capacity){
        this.capacity = capacity;
        this.items = new Object[capacity];
        this.notEmpty = this.lock.newCondition();
        this.notFull = this.lock.newCondition();
        this.count = 0;
    }

    public void put(E e) throws InterruptedException {
        final Lock lock = this.lock;
        lock.lockInterruptibly();
        try{
            if(count == items.length)
                notFull.await();
            enqueu(e);
        }finally {
            lock.unlock();
        }

    }

    private void enqueu(E e) {
        items[inputIndex] = e;
        if(++inputIndex == items.length)
            inputIndex = 0;
        count++;
        notEmpty.signal();
    }


}

public class BlockTest {
}
