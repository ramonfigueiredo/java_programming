/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, FlyweightIF> map = new HashMap<String, FlyweightIF>();

	public static FlyweightIF getFlyweight(String param) {
		// Return the Flyweight if it exists
		// or create it if it doesn't.
		FlyweightIF flyweight = null;
		try {
			if (map.containsKey(param)) {
				// Return existing flyweight
				flyweight = map.get(param);
			} else {
				// Create flyweight with a 'true' state
				flyweight = new ConcreteFlyweight(new State(true));
				map.put(param, flyweight);
				System.out.println("Create flyweight " + param + " with state=true");
				System.out.println();
			}
		} catch (ClassCastException cce) {
			System.out.println(cce.getMessage());
		}
		return flyweight;
	}
}
