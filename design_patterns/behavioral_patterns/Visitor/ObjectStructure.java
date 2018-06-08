/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Visitor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
	private List<ElementIF> objectStruct;
	private VisitorIF visitor;

	public ObjectStructure(ElementIF[] param) {
		objectStruct = Arrays.asList(param);
	}

	public void visitElements() {
		if (visitor == null) {
			visitor = new ConcreteVisitor();
		}

		for (Iterator<ElementIF> i = objectStruct.iterator(); i.hasNext();) {
			i.next().accept(visitor);
		}
	}
}
