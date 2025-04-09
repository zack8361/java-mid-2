package modern.ex02.quiz;

import modern.ex01.appleExample.Apple;
import modern.ex02.quiz.strategy.AppleFancyFormatter;
import modern.ex02.quiz.strategy.AppleFormatter;
import modern.ex02.quiz.strategy.AppleSimpleFormatter;

import java.util.List;
import java.util.stream.Stream;

public class QuizMain {

    public static void main(String[] args) {
        List<Apple> inventory = List.of(
                new Apple("green", 12),
                new Apple("red", 12),
                new Apple("green", 12)
                );

        prettyPrintApple(inventory, new AppleSimpleFormatter());
        prettyPrintApple(inventory, new AppleFancyFormatter());

    }
    private static void prettyPrintApple(
            List<Apple> inventory,
            AppleFormatter formatter
    ) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
