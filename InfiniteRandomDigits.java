import java.util.stream.Stream;

public class InfiniteRandomDigits {

    public static Stream<Long> infiniteRandomDigits(long seed, long a, long c, long m) {

        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}