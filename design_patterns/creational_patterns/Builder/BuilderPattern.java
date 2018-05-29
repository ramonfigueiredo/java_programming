package design_patterns.creational_patterns.Builder;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class BuilderPattern {
	public static void main(String[] args) {
		System.out.println("Builder Pattern Demonstration.");
		System.out.println("------------------------------");
		// Create builder
		System.out.println("Constructing builder.");
		BuilderIF builder = new ConcreteBuilder();
		// Create director
		System.out.println("Constructing director.");
		Director director = new Director(builder);
		// Construct customer via director
		System.out.println("Constructing customer.");
		
		director.construct();
		// Get customer via builder
		CustomerIF customerIF = builder.getCustomer();
		// Use customer method
		System.out.println("Calling action on the customer.");
		customerIF.action();
		System.out.println();
	}
}
