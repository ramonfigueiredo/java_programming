package design_patterns.creational_patterns.AbstractFactory;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public interface AbstractFactoryIF {
	public AbstractSportsCarIF createSportsCar();
	public AbstractEconomyCarIF createEconomyCar();
}
