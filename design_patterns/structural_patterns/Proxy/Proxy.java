/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Proxy;

public class Proxy implements ServiceIF {

	// Proxy to be the service
	private Service service = new Service();

	@Override
	public void action() {
		service.action();
	}

}
