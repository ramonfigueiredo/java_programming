/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Strategy;

public class ConcreteStrategy1 implements StrategyIF {

	// Switch text to all upper case.
	@Override
	public void algorithmInterface(String param) {
		System.out.println(param.toUpperCase());
	}

}
