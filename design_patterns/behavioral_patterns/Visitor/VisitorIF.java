/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Visitor;

public interface VisitorIF {
	public void visitConcreteElementA(ConcreteElementA param);

	public void visitConcreteElementB(ConcreteElementB param);
}
