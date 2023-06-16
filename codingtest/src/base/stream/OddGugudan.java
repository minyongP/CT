package base.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddGugudan {
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 9)
                .forEach(i -> IntStream.rangeClosed(1, 9)
                        .map(j -> i * j)
                        .filter(num -> num % 2 != 0)
                        .forEach(num -> System.out.println(
                                i + " * " + (num / i) + " = " + num)));
    }
}
