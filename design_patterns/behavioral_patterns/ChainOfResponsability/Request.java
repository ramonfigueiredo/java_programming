/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.ChainOfResponsability;

public class Request {
	// The universe of known requests that can be handled.
	public final static int EQUITY_ORDER = 100;
	public final static int BOND_ORDER = 200;
	// This objects type of request.
	private int type;

	public Request(int param) throws Exception {
		// Validate the request type with the known universe.
		if ((param == EQUITY_ORDER) || (param == BOND_ORDER)) {
			// Store this request type.
			this.type = param;
		} else {
			throw new Exception("Unknown Request type " + param + ".");
		}
	}

	public int getType() {
		return type;
	}
}
