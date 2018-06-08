/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteSubject implements SubjectIF {

	List<ObserverIF> observers = new ArrayList<ObserverIF>();

	@Override
	public void addObserver(ObserverIF param) {
		observers.add(param);
	}

	@Override
	public void removeObserver(ObserverIF param) {
		observers.remove(observers.indexOf(param));
	}

	@Override
	public void notifyObservers() {
		for (Iterator<ObserverIF> i = observers.iterator(); i.hasNext();) {
			i.next().update();
		}
	}

	public void doSomething() {
		double d = Math.random();
		if (d < 0.25 || d > 0.75) {
			System.out.println("\tYes");
			notifyObservers();
		} else {
			System.out.println("\tNo");
		}
	}
}
