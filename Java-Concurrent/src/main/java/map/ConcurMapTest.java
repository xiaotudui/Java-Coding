package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("hello", "world");
        System.out.println(map.get("hello"));
    }
}
