package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Cavalier implements AbstractEconomyCarIF {

	@Override
	public void driveSlow() {
		System.out.println("Cavalier.driveSlow() called.");			
	}

}
