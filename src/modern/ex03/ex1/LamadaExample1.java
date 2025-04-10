package modern.ex03.ex1;

import modern.ex01.appleExample.Apple;

import java.util.Comparator;

public class LamadaExample1 {
    public static void main(String[] args) {


        // 1. 익명 클래스 사용
        Comparator<Apple> comparator1 = new Comparator<>() {
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        // 2. 람다식 사용
        Comparator<Apple> comparator2 = (o1, o2) -> o1.getWeight().compareTo(o2.getWeight());

        // 3. 메소드 레퍼런스 사용 -> 람다 응용
        Comparator<Apple> comparator3 = Comparator.comparing(Apple::getWeight);

    }
}
