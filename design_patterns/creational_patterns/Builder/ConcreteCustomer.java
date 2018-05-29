package design_patterns.creational_patterns.Builder;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class ConcreteCustomer implements CustomerIF {

	public ConcreteCustomer() {
		System.out.println("ConcreteCustomer construted.");
	}
	
	@Override
	public void action() {
		System.out.println("ConcreteCustomer.action() called.");
	}

}
