/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Bridge;

public class SportsCarImplementor implements ImplementorIF {

	public SportsCarImplementor() {
		System.out.println("SportsCarImplementor constructed.");
	}
	
	@Override
	public void actionImplemented() {
		System.out.println("SportsCarImplementor.actionImplementor() called.");
	}

}
