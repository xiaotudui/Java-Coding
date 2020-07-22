package stream;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3, 4, 6, 7, 2, 3, 5};
        Arrays.stream(iArr).forEach(System.out::println);
    }
}
