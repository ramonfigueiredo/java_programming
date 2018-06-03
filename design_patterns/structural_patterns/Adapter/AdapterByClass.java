/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Adapter;

public class AdapterByClass extends Adapter implements TargetIF {

	public AdapterByClass() {
		System.out.println("AdapterByClass constructed.");
	}

	@Override
	public String newRequest() {
		return oldRequest();
	}

}
