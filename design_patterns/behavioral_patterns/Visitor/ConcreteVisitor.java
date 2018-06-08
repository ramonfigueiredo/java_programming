/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Visitor;

public class ConcreteVisitor implements VisitorIF {

	@Override
	public void visitConcreteElementA(ConcreteElementA param) {
		param.operationA();
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB param) {
		param.operationB();
	}
}
