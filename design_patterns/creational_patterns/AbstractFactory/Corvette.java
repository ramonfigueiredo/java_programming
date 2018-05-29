package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Corvette implements AbstractSportsCarIF {

	@Override
	public void driveFast() {
		System.out.println("Corvette.driveFast() called.");		
	}

}
