package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
    }
}
