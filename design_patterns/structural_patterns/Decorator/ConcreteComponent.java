/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Decorator;

public class ConcreteComponent implements ComponentIF {

	@Override
	public void action() {
		System.out.println("ConcreteComponent.action() called.");
	}

}
