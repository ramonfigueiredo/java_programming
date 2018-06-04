/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Decorator;

public class Decorator implements ComponentIF {

	ComponentIF component = new ConcreteComponent();

	@Override
	public void action() {
		component.action();
	}

}
