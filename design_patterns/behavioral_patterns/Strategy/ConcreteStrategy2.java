/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Strategy;

public class ConcreteStrategy2 implements StrategyIF {

	@Override
	public void algorithmInterface(String param) {
		System.out.println(
				(param.toLowerCase().startsWith("the ")) ? param.substring(4) + ", " + param.substring(0, 4) : param);
	}
}
