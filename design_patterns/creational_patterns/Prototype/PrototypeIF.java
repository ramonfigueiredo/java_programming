/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.creational_patterns.Prototype;

public interface PrototypeIF {
	public PrototypeIF getClone(); // as opposed to Object.clone()
	public void action();
}
