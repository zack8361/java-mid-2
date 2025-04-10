package modern.ex02;

import modern.ex01.appleExample.Apple;
import modern.ex02.strategy.AppleColorPredicate;
import modern.ex02.strategy.AppleHeavyWeightPredicate;
import modern.ex02.strategy.Predicate;

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


        
        // 익명 클래스 사용.
        // 다양한 동작을 구현할 수 잇찌만 만족할 만큼 코드가 깔끔하지는 않음.
        filterApples(apples,new AppleColorPredicate(){
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });


        // 람다 사용
        // 1. 코드가 깔끔해짐
        // 2. 동작을 값으로 다루기 위해서 -> 즉 함수를 변수처럼 넘기고, 저장하고 리턴하기 위함 -> 함수형 프로그래밍 지향 시대.


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
