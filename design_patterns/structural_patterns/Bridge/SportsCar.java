/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Bridge;

public class SportsCar implements AbstractionIF {

	ImplementorIF implementor = new SportsCarImplementor();
	
	public SportsCar() {
		System.out.println("SportsCar constructed.");
	}
	
	@Override
	public void action() {
		implementor.actionImplemented();
	}

}
