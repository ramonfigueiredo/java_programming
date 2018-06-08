/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Iterator;

import java.util.List;

public class ConcreteIterator implements IteratorIF {

	private List list;
	private int index;

	public ConcreteIterator(CollectionIF param) {
		list = (List) param.elements();
		index = 0;
	}

	@Override
	public Object next() throws RuntimeException {
		try {
			return list.get(index++);
		} catch (IndexOutOfBoundsException ioobe) {
			throw new RuntimeException("No Such Element");
		}
	}

	@Override
	public boolean hasNext() {
		return (index < list.size()) ? true : false;
	}

}
