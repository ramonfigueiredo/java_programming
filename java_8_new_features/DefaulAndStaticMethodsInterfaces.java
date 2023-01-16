/**
 * Default methods enable you to add new functionality to the interfaces of your libraries and
 * ensure binary compatibility with code written for older versions of those interfaces.
 *
 * A static method is a method that is associated with the class in which it is defined rather than with any object.
 * Every instance of the class shares its static methods.
 *
 * Static method in interface are part of the interface class can’t implement or override it whereas class can override the default method.
 */

interface MyInterface{
    default void show(){
        System.out.println("Show method in MyInterface");
    }
    static void display() {
        System.out.println("Display method in MyInterface");
    }
}

class MyConcreteClass implements MyInterface {

}

interface DefaultStaticExampleInterface {
    default void show() {
        System.out.println("In Java 8- default method - DefaultStaticExampleInterface");
    }
    static void display() {
        System.out.println("In DefaultStaticExampleInterface I");
    }
}

class DefaultStaticExampleClass implements DefaultStaticExampleInterface {
}

public class DefaulAndStaticMethodsInterfaces {

    public static void main(String[] args) {
        // Call interface static method on Interface
        DefaultStaticExampleInterface.display();
        DefaultStaticExampleClass defaultStaticExampleClass = new DefaultStaticExampleClass();

        // Call default method on Class
        defaultStaticExampleClass.show();

        MyInterface.display();
        MyInterface mcc = new MyConcreteClass();
        mcc.show();
    }

}
