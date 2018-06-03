/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.creational_patterns.Prototype;

public class ConcretePrototype2 implements PrototypeIF {

	public ConcretePrototype2() {
		System.out.println("ConcretePrototype2 constructed.");
	}
	
	@Override
	public PrototypeIF getClone() {
		// if required put deep copy code here
		return new ConcretePrototype2();
	}

	@Override
	public void action() {
		System.out.println("ConcretePrototype2.action() called.");
	}

}
