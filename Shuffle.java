import com.google.common.collect.*;

import java.util.stream.Stream;

public class Shuffle {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        return (Stream<T>) Streams.zip(first, second, (x, y) -> x + " " + y + " ");
    }
}