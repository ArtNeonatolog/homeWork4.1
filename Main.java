import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        System.out.println("Задание 1");
    }

    private static void task2() {
        System.out.println("Задание 2");
        System.out.println(quantityOfEvenNumbers(List.of(2,3,45,56,128,41,4,23)));
    }

    private static long quantityOfEvenNumbers (List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(e -> e %2 == 0).count();
    }

    private static <T> void findMinMax (Stream<T> stream, Comparator<T> order, BiConsumer<T, T> minMaxConsumer) {
        Optional<T> min = (Optional<T>) stream.min(order).orElseGet(null);
        Optional<T> max = (Optional<T>) stream.max(order).orElseThrow(null);
        minMaxConsumer.accept((T)min, (T)max);
        if (stream == null) {
            minMaxConsumer.accept(null, null);
        }
    }
}
