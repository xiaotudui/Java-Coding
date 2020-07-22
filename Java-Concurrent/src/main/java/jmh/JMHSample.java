package jmh;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)

public class JMHSample {

    @Test
    public void measureName() {
        System.out.println("hello");
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Test
    public void wellHello() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(JMHSample.class.getSimpleName())
                .forks(1).build();
        new Runner(opt).run();

    }
}

