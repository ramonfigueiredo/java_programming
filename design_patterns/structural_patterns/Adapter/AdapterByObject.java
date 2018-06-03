/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Adapter;

public class AdapterByObject implements TargetIF {

	private Adapter adapter;
	
	public AdapterByObject() {
		System.out.println("AdapterByObject constructed.");
	}
	@Override
	public String newRequest() {
		// Create an Adapter object if it desn't exist yet
		if (adapter == null) {
			adapter = new Adapter();
		}
		return adapter.oldRequest();
	}

}
