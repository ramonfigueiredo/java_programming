/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookTitleExpression extends BookAbstractExpression {

	@Override
	public String interpret(BookInterpreterContext param) {
		ArrayList<String> titles = param.getAllTitles();
		ListIterator<String> titlesIterator = titles.listIterator();
		StringBuffer titleBuffer = new StringBuffer("");
		boolean first = true;
		while (titlesIterator.hasNext()) {
			if (!first) {
				titleBuffer.append(", ");
			} else {
				first = false;
			}
			titleBuffer.append(titlesIterator.next());
		}
		return titleBuffer.toString();
	}
}
