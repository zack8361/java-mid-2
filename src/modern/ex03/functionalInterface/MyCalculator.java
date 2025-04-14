package modern.ex03.functionalInterface;


/**
 * 함수형 인터페이스
 * - 람다식으로 구현할 수 있는 인터페이스
 * - 즉 람다를 담을 공간. -> 람다도 결국 어딘가의 타입으로 귀속되어야 한다.
 * - Supplier, Consumer, Function, Predicate 과 같은 것들 자바에서 제공해줌
 * - 추상메서드가 오직 하나만 존재해야 한다.
 */
@FunctionalInterface
public interface MyCalculator {
    int calculate(int a, int b);
}
