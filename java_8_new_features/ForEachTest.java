import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * The forEach method was introduced in Java 8. It provides programmers a new, concise way of iterating over a collection.
 *
 * The forEach method performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
 *
 * void forEach(Consumer<? super T> action);
 * */

public class ForEachTest {
    public static void main(String[] args) {
        System.out.println("Print data list with Iterator");
        List<String> data = new ArrayList<>();
        data.add("ND");
        data.add("NY");
        data.add("M");
        data.add("L");

        Iterator<String> itr = data.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Print data list with ForEach using the Consumer<String> interface");

        data.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("Print data list with ForEach using an anonymous interface");

        data.forEach((String name) -> {
            System.out.println(name);
        });

        System.out.println("Print data list with ForEach and Lambda expression (shorter way)");

        data.forEach(i -> System.out.println(i));

        System.out.println("Print data list with enhancement loop");

        for (String s : data){
            System.out.println(s);
        }

        System.out.println("Print data2 (int[]) list with for loop");

        int[] data2 = {3, 23, 51};
        for (int i=0; i < data2.length; i++) {
            System.out.println(data2[i]);
        }

        System.out.println("Print data2 (int[]) with enhancement loop");

        for (int d: data2) {
            System.out.println(d);
        }
    }
}
