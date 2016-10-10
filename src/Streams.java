import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Streams {
    public static void main(String[] args) {
        String[] strings = new String[]{"bar", "snowbear", "sizzle", "foo", "streak"};

//        Arrays.sort(strings, Comparator.comparing(String::length));

//        Stream.of(strings).forEach(System.out::println);

        List<String> s1 = Stream.of(strings).filter(s -> s.startsWith("s")).collect(Collectors.toList());
        s1.get(s1.size() - 1);
    }
}

