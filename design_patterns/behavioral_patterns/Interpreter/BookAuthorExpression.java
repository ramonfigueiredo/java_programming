/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookAuthorExpression extends BookAbstractExpression {

	@Override
	public String interpret(BookInterpreterContext param) {
		ArrayList<String> authors = param.getAllAuthors();
		ListIterator<String> authorsIterator = authors.listIterator();
		StringBuffer titleBuffer = new StringBuffer("");
		boolean first = true;
		while (authorsIterator.hasNext()) {
			if (!first) {
				titleBuffer.append(", ");
			} else {
				first = false;
			}
			titleBuffer.append(authorsIterator.next());
		}
		return titleBuffer.toString();
	}
}
