package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Mustang implements AbstractSportsCarIF {

	@Override
	public void driveFast() {
		System.out.println("Mustang.driveFast() called.");
	}

}
