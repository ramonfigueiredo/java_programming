/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Bridge;

public class EconomyCar implements AbstractionIF {

	ImplementorIF implementor = new EconomyCarImplementor();

	public EconomyCar() {
		System.out.println("EconomyCar constructed.");
	}

	@Override
	public void action() {
		implementor.actionImplemented();
	}

}
