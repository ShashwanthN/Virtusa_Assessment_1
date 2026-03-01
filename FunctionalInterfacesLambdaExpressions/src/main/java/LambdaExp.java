@FunctionalInterface
interface Calc {
    int calculate(int a, int b);
}
public class LambdaExp {
    public static void main(String[] args) {
        Calc add = (a, b) -> a + b;
        System.out.println("add: " + add.calculate(2, 3));
        Calc multiply = (a, b) -> a * b;
        System.out.println("multiply: " + multiply.calculate(2, 3));
    }
}