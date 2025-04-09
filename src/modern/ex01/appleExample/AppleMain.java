package modern.ex01.appleExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleMain {
    public static void main(String[] args) {
        List<Apple> inventory = List.of(new Apple("green",12), new Apple("red",12), new Apple("green",12));


        List<Apple> green1 = filterItems(inventory, a -> a.getColor().equals("green"));

        List<Apple> green = inventory.stream()
                .filter(a -> a.getColor().equals("green"))
                .toList();

    }

    public static <T, R> List<T> filterItems(
            List<T> inventory,
            Predicate<T> predicate
    ) {
        List<T> result = new ArrayList<>();
        for (T item : inventory) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

}
