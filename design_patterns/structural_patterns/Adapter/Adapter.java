/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Adapter;

public class Adapter {

	public Adapter() {
		System.out.println("Adapter constructed.");
	}

	public String oldRequest() {
		return "Adapter.oldRequest() called.";
	}
}
