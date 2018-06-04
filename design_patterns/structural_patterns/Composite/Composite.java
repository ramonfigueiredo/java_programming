/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component {

	String name = null;
	List<Component> children = new ArrayList<Component>();

	public Composite(String param) {
		this.name = param;
		System.out.println(param.trim() + " constructed.");
	}

	public String getName() {
		return name;
	}

	public Component getChild(int param) {
		Component child;
		try {
			child = children.get(param);
		} catch (IndexOutOfBoundsException ioobe) {
			child = null;
		}
		return child;
	}

	public void add(Component param) {
		try {
			System.out.println("Adding " + param.getName().trim() + " to " + this.getName().trim());
			children.add(param);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void remove(Component param) {
		try {
			System.out.println("Removing " + param.getName().trim() + " from " + this.getName().trim());
			children.remove(param);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void display() {
		Iterator<Component> iterator = children.iterator();
		System.out.println(this.getName() + (iterator.hasNext() ? " with the following:" : " that is bare."));
		while (iterator.hasNext()) {
			iterator.next().display();
		}
	}

}
