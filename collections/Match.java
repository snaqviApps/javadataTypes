package collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Match {
    public static void main(String[] args) {
        String search = "loop";
        String[] words = {"loop", "pool", "lopo", "book", "kobo"};

        Arrays.stream(words)
                .forEach(
                        s -> {
                            if (s.equals(search)) System.out.println(s.concat(" exists"));
                        }
                );

                Arrays.stream(words)
                        .filter(s -> s.equals(search))
                        .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}