/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Memento;

public class Memento {
	private boolean state;
	private String name;

	public Memento(boolean param1, String param2) {
		this.state = param1;
		this.name = param2;
	}

	boolean getState() {
		return this.state;
	}

	String getName() {
		return this.name;
	}
}
