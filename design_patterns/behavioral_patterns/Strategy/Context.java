/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Strategy;

public class Context {
	// Reference to the strategy
	StrategyIF strategy;

	// Register reference to strategy on construction.
	public Context(StrategyIF param) {
		this.strategy = param;
	}

	// Call strategy's method.
	public void contextInterface(String param) {
		strategy.algorithmInterface(param);
	}
}
