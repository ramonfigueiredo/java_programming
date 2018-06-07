/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Command;

public class ConcreteCommand extends CommandAbstract {

	// The binding between action and receiver
	private ReceiverIF receiver;

	public ConcreteCommand(ReceiverIF receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
