/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Facade;

public class SubSystem1 {
	public void getCustomer() {
		// Place functionality here...
		System.out.println("SubSystem1.getCustomer() called.");
	}

	public void getSecurity() {
		// Place functionality here...
		System.out.println("SubSystem1.getSecurity() called.");
	}

	public void priceTransaction() {
		// Place functionality here...
		System.out.println("SubSystem1.priceTransaction() called.");
	}
}
