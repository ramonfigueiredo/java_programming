/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Command;

public class Invoker {
	private CommandAbstract command;

	public void storeCommand(CommandAbstract cmd) {
		this.command = cmd;
	}

	public void invoke() {
		command.execute();
	}
}
