package modern.ex03.functional;

@FunctionalInterface
public interface MyFunction <T,R>{
    R apply(T t);
}
