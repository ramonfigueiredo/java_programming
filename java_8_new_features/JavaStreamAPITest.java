import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
 *  JAVA STREAM PIPELINE:
 *  Given a stream of elements (source), he source can be filtered or sorted or mapped. At the end, the stream of elements can be collected or reduced.
 *
 * A stream pipeline consists of a source, followed by zero or more intermediate operations; and a terminal operation.
 *
 * The features of Java stream are:
 *
 * A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
 * - Streams don't change the original data structure, they only provide the result as per the pipelined methods.
 * - Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined.
 * Terminal operations mark the end of the stream and return the result.
 */

public class JavaStreamAPI {
    public static void main(String[] args) {
        System.out.println("Printing 100 integers values using Java Streams: values.parallelStream().forEach(System.out::println)");
        List<Integer> values = new ArrayList<>();
        for(int i=1; i<=100; i++) {
            values.add(i);
        }
        values.parallelStream().forEach(System.out::println);

        System.out.println("\n");
        System.out.println("Different Operations On Streams: Stream > Filter > Sort > Map Collect > Reduce");
        System.out.println("JAVA STREAM PIPELINE: Given a stream of elements (source), he source can be filtered or sorted or mapped. At the end, the stream of elements can be collected or reduced.");
        System.out.println("\n");
        /*
         * Different Operations On Streams
         * Intermediate Operations:
         *
         * map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
         * List number = Arrays.asList(2,3,4,5);
         * List square = number.stream().map(x->x*x).collect(Collectors.toList());
         *
         * filter: The filter method is used to select elements as per the Predicate passed as argument.
         * List names = Arrays.asList("Reflection","Collection","Stream");
         * List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
         *
         * sorted: The sorted method is used to sort the stream.
         * List names = Arrays.asList("Reflection","Collection","Stream");
         * List result = names.stream().sorted().collect(Collectors.toList());
         */
    }
}
