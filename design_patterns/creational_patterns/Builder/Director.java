package design_patterns.creational_patterns.Builder;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Director {

	BuilderIF builder;
	public Director(BuilderIF parm) {
		this.builder = parm;
	}
	public void construct() {
		builder.buildCustomer();
	}
}
