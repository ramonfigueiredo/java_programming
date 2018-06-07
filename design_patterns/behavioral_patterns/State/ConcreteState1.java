/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.State;

public class ConcreteState1 implements StateIF {

	@Override
	public void handle() {
		System.out.println("ConcreteState1.handle() called.");
	}

}
