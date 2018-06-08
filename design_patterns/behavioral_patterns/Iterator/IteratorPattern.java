/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Iterator;

public class IteratorPattern {
	public static void main(String[] args) {
		System.out.println("Iterator Pattern Demonstration.");
		System.out.println("-------------------------------");
		System.out.println("Building string array of books.");
		String[] books = new String[8];
		books[0] = "Introduction to Algorithms, 1989";
		books[1] = "Design Patterns: Elements of Reusable Object-Oriented Software, 1994";
		books[2] = "Compilers: Principles, Techniques and Tools, 1986";
		books[3] = "Computer Networking: A Top-Down Approach, 2000";
		books[4] = "Database System Concepts, 1986";
		books[5] = "Artificial Intelligence: A Modern Approach, 1994";
		books[6] = "Introduction to the Theory of Computation, 1996";
		books[7] = "Modern Operating Systems, 1992";

		// Turn the string array into a collection.
		System.out.println("Turning string array into a collectin.");
		CollectionIF collection = new ConcreteCollection(books);
		// Get an iterator for the collection.
		System.out.println("Getting an iterator for the collection.");
		IteratorIF iterator = collection.iterator();
		// Iterator through and print each object in the list.
		System.out.println("Iterate through the list.");
		int i = 0;
		while (iterator.hasNext()) {
			System.out.println((++i) + " " + iterator.next());
		}
		System.out.println();
	}
}
