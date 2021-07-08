package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.*;

public class MyStreaming {

    public static void main(String... args){

        IntStream.range(1, 10)
                .skip(4)
                .map(x -> x * x)                    // input: x; output: (x)-square
                .forEach(System.out::println);
        System.out.println("=============== ");

        List<String> people = Arrays.asList("Hi", "how are", "you", "I am fine");
        people.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("h"))
                .forEach(System.out::println);
        System.out.println("=============== ");

        try {
            Stream<String> stream = Files.lines(Paths.get("C:\\Users\\naqvi\\IdeaProjects\\DataStructuresandAlgorithms\\src\\streams\\Data.txt"));
            Map<String, Integer> map = new HashMap<>();
            map = stream
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .collect(Collectors.toMap(
                            x -> x[0],
                            x -> Integer.parseInt(x[1]))
                    );
            stream.close();

            map.entrySet().forEach(
                    e -> System.out.println("using forEach() approach " + e.getKey() +  ":" + e.getValue())
            );
            System.out.println("\n===============");

            map.forEach((key, value) -> System.out.print("\nusing stream: (k, v) approach: " + key + ":" + value));
            System.out.println("\n===============");

            for(String key : map.keySet()){
                System.out.println("using enhanced-for loop: " + key + " : " + map.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n===============");
        System.out.println("Using 'reducers' ");
        double change = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.00, Double::sum);
        System.out.println("change: " + change);

        System.out.println("\n===============");
        System.out.println("Reduction: Summary-Stats");
        IntSummaryStatistics summaryStatistics = IntStream.of(7, 1, 4)
                .summaryStatistics();
        System.out.println(summaryStatistics);

    }

}
