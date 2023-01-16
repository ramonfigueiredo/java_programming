import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Introduced in Java 8, the Stream API is used to process collections of objects.
 * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 *
 * Streams bring functional programming to Java.
 *
 * Advantages of Streams:
 * - Will make a more efficient Java programmer
 * - Make heavy use of lambda expressions
 * - ParallelStreams make it very to multi-thread operations
 *
 * JAVA STREAM PIPELINE:
 * Given a stream of elements (source), he source can be filtered or sorted or mapped. At the end, the stream of elements can be collected or reduced.
 *
 * Stream source: Streams can be created from Collections, List, Sets, ints, longs, doubles, arrays, lines of a file
 *
 * Stream operations are either intermediate or terminal
 * - Intermediate operations such as filter, map, or sort return a stream so we can chain multiple intermediate operations.
 * - Terminal operations such as forEach, collect or reduce are either void or return a non-stream result.
 *
 * Intermediate operations:
 * - Zero or more intermediate operations are allowed.
 * - Order matters for large datasets: filter list, then sort or map.
 * - For very large datasets use ParallelStream to enable multiple threads.
 * - Intermediate operations include: anyMatch(), distinct(), filter(), findFirst(), flatmap(), map(), skip(), sorted()
 *
 * Terminal operations: One terminal operation is allowed.
 * - forEach applies the same function to each element.
 * - collect saves the elements into a colletion.
 * - other options reduce the stream to a single summary element: count(), max(), min(), reduce(), summaryStatistics()
 *
 *
 * The features of Java stream are:
 *
 * A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
 * - Streams don't change the original data structure, they only provide the result as per the pipelined methods.
 * - Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined.
 * Terminal operations mark the end of the stream and return the result.
 */

public class JavaStreamAPITest {
    public static void main(String[] args) throws IOException {
        System.out.println("0) Printing 100 integers values using Java Streams: values.parallelStream().forEach(System.out::println)");
        List<Integer> values = new ArrayList<>();
        for(int i=1; i<=100; i++) {
            values.add(i);
        }
        values.parallelStream().forEach(System.out::println);
        System.out.println();

        System.out.println("1) Integer stream");
        IntStream
                .range(1, 10)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("2) Integer stream with skip");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("3) Integer stream with sum");
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );
        System.out.println();

        System.out.println("4) Stream.of, sorted and findFirst");
        Stream.of("Canada", "Brazil", "USA", "France")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println("5) Stream from Array, sort, filter and print");
        String[] countries = {"Venezuela", "Peru", "Brazil", "Ecuador", "Bolivia", "Chile",
                "Paraguay", "Argentina", "Uruguay", "Colombia", "French Guyana", "Suriname"};
        Arrays.stream(countries)
                .filter(x -> x.startsWith("B"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("6) Stream from Array, sort, filter and print");
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x) // {2, 4, 6, 8, 10} -> {4, 16, 36, 64, 100}
                .average() // sum(4, 16, 36, 64, 100) = 220 / 5 = 44
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println("7) Stream from list, filter and print");
        List<String> countriesList = Arrays.asList("Peru", "Brazil", "Ecuador", "Bolivia", "Chile");
        countriesList
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("b"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("8) Stream rows from text file, sort, filter, and print");
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "countries.txt";
        System.out.println(filePath);
        Stream<String> countriesInfile = Files.lines(Paths.get(filePath));
        countriesInfile
                .sorted()
                .filter(x -> x.length() > 8)
                .forEach(System.out::println);
        countriesInfile.close();
        System.out.println();

        System.out.println("9) Stream rows from text file, sort, filter, and print");
        filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "countries.txt";
        System.out.println(filePath);
        List<String> countriesInfile2 = Files.lines(Paths.get(filePath))
                .filter(x -> x.contains("B"))
                .collect(Collectors.toList());
        countriesInfile2.forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("10) Stream rows from CSV file and count");
        String csvFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "data.csv";
        System.out.println(csvFilePath);
        Stream<String> validCSVRows = Files.lines(Paths.get(csvFilePath));
        int rowCount = (int) validCSVRows
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        validCSVRows.close();
        System.out.println();

        System.out.println("11) Stream rows from CSV file and parse data from row");
        csvFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "data.csv";
        System.out.println(csvFilePath);
        Stream<String> validCSVRows2 = Files.lines(Paths.get(csvFilePath));
        validCSVRows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        validCSVRows2.close();
        System.out.println();

        System.out.println("12) Stream rows from CSV file and store fields in HashMap");
        csvFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "data.csv";
        System.out.println(csvFilePath);
        Stream<String> rows3 = Files.lines(Paths.get(csvFilePath));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        rows3.close();
        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        // Another way to print values using forEach and Lambda
//        map.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

        System.out.println("13) Sum using Reduction");
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total: " + total);
        System.out.println();

        System.out.println("14) Reduction - summary statistics. This only works for Integers.");
        IntSummaryStatistics summaryStatistics = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summaryStatistics);
        System.out.println("Count: " + summaryStatistics.getCount());
        System.out.println("Sum: " + summaryStatistics.getSum());
        System.out.println("Min: " + summaryStatistics.getMin());
        System.out.println("Average: " + summaryStatistics.getAverage());
        System.out.println("Max: " + summaryStatistics.getMax());
        System.out.println();

        System.out.println("15) Given a list of integers, print the squared values");
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(squares);
        System.out.println();

        System.out.println("16) Printing strings starting with 'J'");
        List<String> names = Arrays.asList("Paul", "John", "Mary", "Jack");
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
        System.out.println(filteredNames);
        System.out.println();

        System.out.println("17) Sorting String array");
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        System.out.println();

        System.out.println("18) Given a list of integers, created a squared set without duplicated values.");
        // create a list of integers
        List<Integer> numbers2 = Arrays.asList(2, 3, 4, 5, 2);
        Set<Integer> squareSet = numbers2.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);
        System.out.println();

        System.out.println("19) Given a list of integers, get the even values and sum the values");
        int even = numbers2.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);
        System.out.println();
    }
}
