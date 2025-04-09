package modern.ex02;

import modern.ex01.appleExample.Apple;
import modern.ex02.strategy.AppleHeavyWeightPredicate;

import java.util.List;
import java.util.stream.Stream;

public class BehaviorParameterization {

    public static void main(String[] args) {
        List<Apple> apples = List.of(new Apple("green", 12), new Apple("red", 12), new Apple("green", 14));

        // 동작 파라미터화
        List<Apple> apples2 = filterApples(apples, new AppleHeavyWeightPredicate());
        List<Apple> apples1 = filterApples(apples, new AppleHeavyWeightPredicate());

        // 람다
        List<Apple> apples3 = filterApples(apples, apple -> apple.getColor().equals("green"));


        Stream<Apple> apples4 = apples.stream()
                .filter(apple -> apple.getColor().equals("green"));


    }
    private static List<Apple> filterApples(
            List<Apple> inventory,
            Predicate<Apple> predicate
    ) {
        List<Apple> result = new java.util.ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
