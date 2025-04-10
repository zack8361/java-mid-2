package modern;

import modern.ex01.appleExample.Apple;

import java.util.List;

public class MyExample {
    public static void main(String[] args) {

        List<Apple> apples = List.of(
                new Apple("green", 100),
                new Apple("red", 200),
                new Apple("yellow", 300)
        );

        apples.stream().
                map(Apple::getWeight)
                .filter(weight -> weight > 150)
                .forEach(System.out::println);
    }

}
