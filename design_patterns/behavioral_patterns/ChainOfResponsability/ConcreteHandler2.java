/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.ChainOfResponsability;

public class ConcreteHandler2 implements HandlerIF {

	@Override
	public void processRequest(Request param) {
		// You could add on to the processing chain here...
		handleIt(param);
	}
	
	private void handleIt(Request param) {
		System.out.println("ConcreteHandler2 has handled the processing.");
	}

}
