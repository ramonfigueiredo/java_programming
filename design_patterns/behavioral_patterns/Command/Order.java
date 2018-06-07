/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Command;

public class Order implements ReceiverIF {

	@Override
	public void action() {
		System.out.println("Order.action() called.");
	}

}
