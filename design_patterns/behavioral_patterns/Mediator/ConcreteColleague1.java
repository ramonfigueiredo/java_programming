/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Mediator;

public class ConcreteColleague1 implements ColleagueIF {
	private MediatorIF mediator;
	// This colleague uses a boolean for it's state.
	private boolean state;

	public ConcreteColleague1(MediatorIF param) {
		this.mediator = param;
		this.mediator.registerColleague1(this);
	}

	public void setState(boolean param) {
		this.state = param;
	}

	public void changeState() {
		state = state ? false : true;
		mediator.state1Changed();
	}

	public String toString() {
		return new Boolean(state).toString();
	}
}
