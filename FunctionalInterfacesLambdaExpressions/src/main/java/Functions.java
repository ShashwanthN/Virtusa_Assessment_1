// Task 4: Built-in Functional Interfaces
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Functions {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println("even" + isEven.test(10));
        Function<String, Integer> getLength = (str) -> str.length();
        System.out.println("len " + getLength.apply("shash"));

        Supplier<Double> randomNum = () -> Math.random();
        System.out.println("get random" + randomNum.get());
        Consumer<String> printMessage = (msg) -> System.out.println("msg: " + msg);
        printMessage.accept("hiii");
    }
}