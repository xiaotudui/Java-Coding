package jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Threads(4)
public class MapTest {
    static Map hashmap = new HashMap<String, String>();
    static Map syncHashMap = Collections.synchronizedMap(new HashMap<String, String>());
    static Map concurMap = new ConcurrentHashMap<String, String>();

    @Setup
    public void setup(){
        for (int i = 0; i < 10000; i++) {
            hashmap.put(Integer.toString(i), Integer.toString(i));
            syncHashMap.put(Integer.toString(i), Integer.toString(i));
            concurMap.put(Integer.toString(i), Integer.toString(i));
        }
    }

    @Benchmark
    public void hashMapGet(){
        hashmap.get("4");
    }

    @Benchmark
    public void syncMapGet() {
        syncHashMap.get("4");
    }

    @Benchmark
    public void concurMapGet() {
        concurMap.get("4");
    }

    @Benchmark
    public void getHashSize() {
        hashmap.size();
    }

    @Benchmark
    public void syncSize() {
        syncHashMap.size();
    }

    @Benchmark
    public void concurSize() {
        concurMap.size();
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(MapTest.class.getSimpleName())
                .forks(1).build();
        new Runner(opt).run();

    }
}
