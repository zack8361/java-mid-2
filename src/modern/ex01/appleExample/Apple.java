package modern.ex01.appleExample;

public class Apple {

    private String color;

    public Integer getWeight() {
        return weight;
    }

    private int weight;

    public Apple(String color,int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public static boolean isGreenApple(Apple apple) {
        return apple.getColor().equals("green");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
