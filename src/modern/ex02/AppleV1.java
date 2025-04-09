package modern.ex02;

import modern.ex01.appleExample.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleV1 {
    public static void main(String[] args) {
        List<Apple> inventory = List.of(new Apple("green", 12), new Apple("red",12), new Apple("green",14));

        // V1 -> 
        List<Apple> apples = filterGreensApplesV1(inventory);
        System.out.println(apples);
    }

    // V1 -> 색을 하드코딩으로 수정해야하는 불편함.
    private static List<Apple> filterGreensApplesV1(
            List<Apple> inventory
    ) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }


    // V2 -> 색을 파라미터화 하여 유연하게 수정할 수 있도록 개선.
    private static List<Apple> filterGreensApplesV2(
            List<Apple> inventory,
            String color
    ) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }


    // V3 -> 가능한 모든 속성으로 필터링 -> 필요한 속성값을 파라미터화 해서 코드가 지저분해짐
    // 유연하게 대응하기 힘들어진다. -> 요구사항이 바뀔때마다 파라미터를 수정할것인가?
    private static List<Apple> filterGreensApplesV3(
            List<Apple> inventory,
            String color,
            int weight,
            boolean flag
    ) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}























