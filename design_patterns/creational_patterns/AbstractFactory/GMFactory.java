package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class GMFactory implements AbstractFactoryIF {

	@Override
	public AbstractSportsCarIF createSportsCar() {
		return new Corvette();
	}

	@Override
	public AbstractEconomyCarIF createEconomyCar() {
		return new Cavalier();
	}

}
