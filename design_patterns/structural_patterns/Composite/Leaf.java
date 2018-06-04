/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Composite;

public class Leaf extends Component {

	private String name;

	public Leaf(String param) {
		this.name = param;
		System.out.println(param.trim() + " constructed.");
	}

	@Override
	public void display() {
		System.out.println(this.getName());
	}

	public String getName() {
		return name;
	}
}
