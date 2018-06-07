/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Flyweight;

public class State {
	private boolean state;

	public State(boolean param) {
		this.state = param;
	}

	public boolean getState() {
		return state;
	}
}
