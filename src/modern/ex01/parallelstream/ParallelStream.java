package modern.ex01.parallelstream;

import modern.ex01.appleExample.Apple;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        List<Apple> apples = List.of(
                new Apple("green",12),
                new Apple("red",12),
                new Apple("green",12)
        );

        long start = System.currentTimeMillis();
        stream(apples);
        long end = System.currentTimeMillis();
        System.out.println("✅ stream() duration: " + (end - start) + " ms");

        System.out.println("==================================");

        start = System.currentTimeMillis();
        parllelStream(apples);
        end = System.currentTimeMillis();
        System.out.println("✅ parallelStream() duration: " + (end - start) + " ms");

    }

    private static void parllelStream(List<Apple> apples) {
        apples.parallelStream()
                .forEach( s->{
                    heavyCalculation();
                    System.out.println(s + "_" + Thread.currentThread().getName());
                });
    }

    private static void stream(List<Apple> apples) {
        apples.stream()
                .forEach(s -> {
                    heavyCalculation();
                    System.out.println(s + "_" + Thread.currentThread().getName());
                });
    }

    private static void heavyCalculation() {
        long sum = 0;
        for (long i = 0; i < 500_000_000L; i++) {
            sum += i % 3;
        }
    }
}
