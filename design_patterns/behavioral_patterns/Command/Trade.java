/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Command;

public class Trade implements ReceiverIF {

	@Override
	public void action() {
		System.out.println("Trade.action() called.");
	}

}
