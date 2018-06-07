/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.State;

public class ConcreteState2 implements StateIF {

	@Override
	public void handle() {
		System.out.println("ConcreteState2.handle() called.");
	}

}
