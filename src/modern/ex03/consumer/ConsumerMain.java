package modern.ex03.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerMain {
    public static void main(String[] args) {


        List<String> fruits = List.of("Apple", "Banana", "Cherry");
        List<String> dataCleaningConsumer = processFruits(fruits);


        System.out.println("정제된 데이터 : " + dataCleaningConsumer);


    }

    private static List<String> processFruits(List<String> fruits) {
        List<String> result = new ArrayList<>();

        // 내가 원하는 consumer를 만들어서 사용
        Consumer<String> consumer = fruit -> {
            result.add(fruit.trim().toUpperCase());
        };

        for (String fruit : fruits) {
            consumer.accept(fruit);
        }


        // Supplier 사용하여 정제된 리스트를 공급
        Supplier<List<String>> cleanedDataSupplier = () -> result;

        return cleanedDataSupplier.get();
    }

}
