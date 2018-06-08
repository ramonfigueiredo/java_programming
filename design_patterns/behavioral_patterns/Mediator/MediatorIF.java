/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Mediator;

public interface MediatorIF {
	// Interface for communicating with colleagues
	public void registerColleague1(ColleagueIF param);

	public void registerColleague2(ColleagueIF param);

	public void state1Changed();

	public void state2Changed();
}
