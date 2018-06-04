/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Bridge;

public class EconomyCarImplementor implements ImplementorIF {

	public EconomyCarImplementor() {
		System.out.println("EconomyCarImplementor constructed.");
	}

	@Override
	public void actionImplemented() {
		System.out.println("EconomyCarImplementor.actionImplementor() called.");
	}

}
