package modern.ex02.strategy;

import modern.ex01.appleExample.Apple;

public class AppleHeavyWeightPredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
