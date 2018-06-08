/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookTitleAuthorExpression extends BookAbstractExpression {

	String title;

	public BookTitleAuthorExpression(String param) {
		title = param;
	}

	@Override
	public String interpret(BookInterpreterContext param) {
		ArrayList<String> titlesAndAuthors = param.getTitlesForAuthor(title);
		ListIterator<String> titlesAndAuthorsIterator = titlesAndAuthors.listIterator();
		StringBuffer titleBuffer = new StringBuffer("");
		boolean first = true;
		while (titlesAndAuthorsIterator.hasNext()) {
			if (!first) {
				titleBuffer.append(", ");
			} else {
				first = false;
			}
			titleBuffer.append(titlesAndAuthorsIterator.next());
		}
		return titleBuffer.toString();
	}
}
