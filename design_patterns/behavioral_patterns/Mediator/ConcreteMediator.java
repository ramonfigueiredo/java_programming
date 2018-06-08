/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Mediator;

public class ConcreteMediator implements MediatorIF {

	ColleagueIF colleague1;
	ColleagueIF colleague2;

	@Override
	public void registerColleague1(ColleagueIF param) {
		this.colleague1 = param;
	}

	@Override
	public void registerColleague2(ColleagueIF param) {
		this.colleague2 = param;
	}

	@Override
	public void state1Changed() {
		String s = (colleague2.toString().equals("true")) ? "false" : "true";
		((ConcreteColleague2) colleague2).setState(s);
	}

	@Override
	public void state2Changed() {
		boolean b = (colleague1.toString().equals("true")) ? false : true;
		((ConcreteColleague1) colleague1).setState(b);
	}

}
