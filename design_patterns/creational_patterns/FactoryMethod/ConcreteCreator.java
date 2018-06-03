/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.creational_patterns.FactoryMethod;

public class ConcreteCreator implements CreatorIF {

	@Override
	public TradeIF factoryMethod() {
		return new ConcreteTrade();
	}
	
}
