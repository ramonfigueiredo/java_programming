import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceTest {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(11);
        values.add(1);
        values.add(3);

        System.out.println("Lambda expression using the Consumer interface (shorter version)");
        values.forEach(i -> System.out.println(i)); // Lambda expression using the Consumer interface

        System.out.println("Lambda expression using the Consumer interface");
        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
