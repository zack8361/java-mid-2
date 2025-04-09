package modern.ex02.strategy;

import modern.ex01.appleExample.Apple;
import modern.ex02.Predicate;

public class AppleHeavyWeightPredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
