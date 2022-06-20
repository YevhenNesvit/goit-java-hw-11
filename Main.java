import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        OddNames.oddNames();
//
//        SortedList.sortedList();
//
//        SortedArray.sortedArray();
//
//        InfiniteRandomDigits.infiniteRandomDigits(2L, 25214903917L, 11L, (long) Math.pow(2, 48))
//                .limit(20L)
//                .forEach(System.out::println);

        Shuffle.zip(Stream.of("a", "b", "c", "d"), Stream.of("A", "B", "C", "D", "E", "F", "G"))
                .forEach(System.out::print);
    }
}