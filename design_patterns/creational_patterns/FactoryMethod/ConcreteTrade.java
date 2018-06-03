/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.creational_patterns.FactoryMethod;

public class ConcreteTrade implements TradeIF {

	@Override
	public void action() {
		System.out.println("ConcreteTrade.action() called.");
	}
	
}
