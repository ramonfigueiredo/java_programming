/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Iterator;

import java.util.Collection;

public interface CollectionIF {

	// Interface for creating a collection that needs iterating.
	public IteratorIF iterator();

	public Collection elements();
}
