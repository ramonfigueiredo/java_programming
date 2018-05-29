package design_patterns.creational_patterns.Builder;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class ConcreteBuilder  implements BuilderIF {

	CustomerIF customer;
	@Override
	public void buildCustomer() {
		customer = new ConcreteCustomer();
		// You could add more customer processing here...
	}

	@Override
	public CustomerIF getCustomer() {
		return customer;
	}

}
