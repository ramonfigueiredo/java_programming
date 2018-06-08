/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Observer;

public class ConcreteObserver implements ObserverIF {

	private ConcreteSubject subject; // Reference to subject

	@Override
	public void update() {
		if (subject == null) {
			subject = new ConcreteSubject();
		}
		System.out.println("\t\tYes");
	}

}
