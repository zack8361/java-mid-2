package modern.ex03.functional;

public class MyFunctionMain {
    public static void main(String[] args) {
        MyFunction<String,Integer> myFunction = String::length;
        MyFunction<String,String> myFunction2 = String::toUpperCase;
        MyFunction<String,String> myFunction3 = String::toLowerCase;


        System.out.println(myFunction.apply("Hello World")); // 11
        System.out.println(myFunction2.apply("Hello World")); // HELLO WORLD
        System.out.println(myFunction3.apply("Hello World")); // hello world

    }
}
