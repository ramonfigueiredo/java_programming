interface A {
    void show();
}

interface B {
    void printIntegerParameter(Integer i);
}

class AC implements A {
    public void show(){
        System.out.println("1) Concrete class implementation of the interface A");
    }
}

/**
 * A lambda expression is a short block of code which takes in parameters and returns a value.
 * Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
 */

public class LambdaExpressionTest {
    public static void main(String[] args) {
        A a = new AC();
        a.show();

        A a2;
        a2 = new A() {
            // Anonymous inner class
            @Override
            public void show() {
                System.out.println("2) Anonymous inner class implementation of the interface A");
            }
        };
        a2.show();

        A a3;

        a3 = () -> {
            System.out.println("3) Lambda expression implementation of the interface A");
        };
        a3.show();

        // If you have only one line in the implementation, you can do like this:
        A a4 = () -> System.out.println("4) Lambda expression implementation of the interface A (shorter implementation).");
        a4.show();

        // Using a parameter
        B b1 = new B(){
            @Override
            public void printIntegerParameter(Integer i) {
                System.out.println("5) Anonymous inner class implementation of the interface B. Parameter:" + i);
            }
        };
        b1.printIntegerParameter(10);

        // If you have only one line in the implementation, you can do like this:
        // It use consumer interface
        B b2 = (Integer i) -> System.out.println("6.1) Lambda expression implementation of the interface A (shorter implementation). (Integer i) -> System.out.println(). Parameter:" + i);
        b2.printIntegerParameter(20);

        B b3 = (i) -> System.out.println("6.2) Lambda expression implementation of the interface A (shorter implementation). (i) -> System.out.println(). Parameter:" + i);
        b3.printIntegerParameter(30);

        B b4 = i -> System.out.println("6.3) Lambda expression implementation of the interface A (shorter implementation). i -> System.out.println(). Parameter:" + i);
        b4.printIntegerParameter(40);
    }
}
