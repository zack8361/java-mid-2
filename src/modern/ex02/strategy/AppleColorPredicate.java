package modern.ex02.strategy;

import modern.ex01.appleExample.Apple;

public class AppleColorPredicate implements Predicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(apple.getColor());
    }
}
