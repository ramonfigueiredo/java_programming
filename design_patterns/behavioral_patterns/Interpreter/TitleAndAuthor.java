/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Interpreter;

public class TitleAndAuthor {
	private String title;
	private String author;

	public TitleAndAuthor(String param1, String param2) {
		title = param1;
		author = param2;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}
