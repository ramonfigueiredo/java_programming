/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Observer;

public interface SubjectIF {
	public void addObserver(ObserverIF param);

	public void removeObserver(ObserverIF param);

	public void notifyObservers();
}
