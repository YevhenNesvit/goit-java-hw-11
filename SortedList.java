import java.util.*;
import java.util.stream.Collectors;

public class SortedList {

    public static void sortedList() {
        List<String> list = Arrays.asList("Sofia", "Ivan", "Anna", "Petro", "Yevhen", "Oleksandr", "Dmytro", "Mykola", "Oleh", "Olena", "Galyna");

        List<String> sortedList = list.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
