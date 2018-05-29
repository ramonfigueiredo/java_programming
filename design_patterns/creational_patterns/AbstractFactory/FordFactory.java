package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class FordFactory implements AbstractFactoryIF {

	@Override
	public AbstractSportsCarIF createSportsCar() {
		return new Mustang();
	}

	@Override
	public AbstractEconomyCarIF createEconomyCar() {
		return new Focus();
	}

}
