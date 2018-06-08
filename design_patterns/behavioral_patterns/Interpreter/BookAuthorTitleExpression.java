/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookAuthorTitleExpression extends BookAbstractExpression {

	String title;

	public BookAuthorTitleExpression(String param) {
		title = param;
	}

	@Override
	public String interpret(BookInterpreterContext param) {
		ArrayList<String> authorsAndTitles = param.getAuthorsForTitle(title);
		ListIterator<String> authorsAndTitlesIterator = authorsAndTitles.listIterator();
		StringBuffer authorBuffer = new StringBuffer("");
		boolean first = true;
		while (authorsAndTitlesIterator.hasNext()) {
			if (!first) {
				authorBuffer.append(", ");
			} else {
				first = false;
			}
			authorBuffer.append(authorsAndTitlesIterator.next());
		}
		return authorBuffer.toString();
	}

}
