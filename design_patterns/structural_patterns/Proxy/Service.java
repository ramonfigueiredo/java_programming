/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Proxy;

public class Service implements ServiceIF {

	// Service to be proxied
	public Service() {
		System.out.println("Service constructed.");
	}

	@Override
	public void action() {
		System.out.println("Service.action() called.");
	}

}