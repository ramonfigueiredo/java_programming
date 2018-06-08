/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ConcreteCollection implements CollectionIF {

	// Builds an iterable list of elements
	private List list = new ArrayList();

	public ConcreteCollection(Object[] objectList) {
		for (int i = 0; i < objectList.length; i++) {
			list.add(objectList[i]);
		}
	}

	@Override
	public IteratorIF iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public Collection elements() {
		return Collections.unmodifiableList(list);
	}

}
