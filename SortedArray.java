import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedArray {

    public static void sortedArray() {
        String[] array = new String[]{"1, 2, 0", "4, 5"};
        String join = String.join(", ", array);
        String[] string = join.split(", ");

        String result = Arrays.stream(string)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}