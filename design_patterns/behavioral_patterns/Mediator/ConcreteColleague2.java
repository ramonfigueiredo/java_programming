/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Mediator;

public class ConcreteColleague2 implements ColleagueIF {
	private MediatorIF mediator;
	// This colleague uses a String for it's state.
	private String state = "false";

	public ConcreteColleague2(MediatorIF param) {
		this.mediator = param;
		this.mediator.registerColleague2(this);
	}

	public void setState(String param) {
		this.state = param;
	}

	public void changeState() {
		state = state.equals("false") ? "true" : "false";
		mediator.state2Changed();
	}

	public String toString() {
		return state;
	}
}
