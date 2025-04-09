package modern.ex02.quiz.strategy;

import modern.ex01.appleExample.Apple;

public class AppleSimpleFormatter implements AppleFormatter<Apple> {
    @Override
    public String accept(Apple apple) {
        return "두번째 동작 함수";
    }
}
