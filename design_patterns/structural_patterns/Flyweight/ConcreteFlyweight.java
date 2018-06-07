/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Flyweight;

public class ConcreteFlyweight implements FlyweightIF {
	// Add state to the concrete flyweight.
	private boolean state;

	public ConcreteFlyweight(State param) {
		this.state = param.getState();
	}

	public void action(State param) {
		// Display internal state and state passed by client.
		System.out.println("ConcreteFlyweight.action(" + param.getState() + ") called.");
		this.state = param.getState();
		System.out.println("ConcreteFlyweight.state = " + this.state);
	}
}
