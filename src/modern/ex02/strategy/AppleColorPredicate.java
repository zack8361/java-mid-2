package modern.ex02.strategy;

import modern.ex01.appleExample.Apple;
import modern.ex02.Predicate;

public class AppleColorPredicate implements Predicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(apple.getColor());
    }
}
