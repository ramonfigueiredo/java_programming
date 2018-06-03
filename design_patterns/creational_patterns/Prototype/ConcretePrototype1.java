/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.creational_patterns.Prototype;

public class ConcretePrototype1 implements PrototypeIF {

	public ConcretePrototype1() {
		System.out.println("ConcretePrototype1 constructed.");
	}
	
	@Override
	public PrototypeIF getClone() {
		// if required put deep copy code here
		return new ConcretePrototype1();
	}

	@Override
	public void action() {
		System.out.println("ConcretePrototype1.action() called.");
	}

}
