package buffer;

import org.junit.Test;

import java.nio.ByteBuffer;

public class BufferTest {
    @Test
    public void test2(){
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(new String("abcd").getBytes());
        byteBuffer.mark();
        System.out.println(byteBuffer.position());
        byteBuffer.put(new String("avc").getBytes());
        byteBuffer.reset();
        System.out.println(byteBuffer.position());
    }

    @Test
    public void test1(){
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        String s = "abcde";
        buffer.put(s.getBytes());


        buffer.flip();

        byte[] bytes = new byte[1024];
        buffer.get(bytes, 0, buffer.limit());
        System.out.println(new String(bytes));

        buffer.rewind();

        System.out.println(buffer.mark());
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

    }
}
