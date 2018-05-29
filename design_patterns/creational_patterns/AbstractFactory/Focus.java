package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Focus implements AbstractEconomyCarIF {

	@Override
	public void driveSlow() {
		System.out.println("Focus.driveSlow() called.");		
	}

}
