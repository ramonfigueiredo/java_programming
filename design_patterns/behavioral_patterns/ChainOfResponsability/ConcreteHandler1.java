/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.ChainOfResponsability;

public class ConcreteHandler1 implements HandlerIF {

	@Override
	public void processRequest(Request param) {
		// Start the processing chain here...
		switch (param.getType()) {
			case Request.EQUITY_ORDER: // This object processes equity orders so call the function to handle it.
				handleIt(param);
				break;
			case Request.BOND_ORDER: // Another object processes bond orders so pass request along.
				System.out.println("Creating 2nd handler.");
				new ConcreteHandler2().processRequest(param);
				break;
		}
	}

	private void handleIt(Request param) {
		System.out.println("ConcreteHandler1 has handled the processing.");
	}

}
