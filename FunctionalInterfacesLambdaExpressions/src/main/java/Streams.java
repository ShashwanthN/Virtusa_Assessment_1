import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("curr list: " + numbers);
        List<Integer> filter = numbers.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println("Filter: " + filter);
        List<Integer> map = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Map: " + map);
        int add = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("summ: " + add);
    }
}