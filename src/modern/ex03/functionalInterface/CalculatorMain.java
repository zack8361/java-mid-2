package modern.ex03.functionalInterface;

import java.util.function.Supplier;

public class CalculatorMain {
    public static void main(String[] args) {

        // 1. 익명 클래스 사용
        MyCalculator myCalculator = new MyCalculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };


        // 2. 람다식 사용
        MyCalculator myCalculator2 = (a, b) -> a + b;


        // 3. 메서드 레퍼런스 사용
        MyCalculator myCalculator3 = Integer::sum;


        int calculate = myCalculator.calculate(1, 2);// 3
        int calculate2 = myCalculator2.calculate(1, 2);// 3
        int calculate3 = myCalculator3.calculate(1, 2);// 3

        System.out.println(calculate);
        System.out.println(calculate2);
        System.out.println(calculate3);

        // supplier 사용

    }

}
