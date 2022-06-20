import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNames {

    public static void oddNames() {
        List<String> names = Arrays.asList("Sofia", "Ivan", "Anna", "Petro", "Yevhen", "Oleksandr", "Dmytro", "Mykola", "Oleh", "Olena", "Galyna");

        String namesString = IntStream
                .iterate(1, i -> i < names.size(), i -> i + 2)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
        System.out.println(namesString);
    }
}