package modern.ex03.consumer;

@FunctionalInterface
public interface MyConsumer <T> {
    void accept(T t);
}
