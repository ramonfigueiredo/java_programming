/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Visitor;

public class ConcreteElementB implements ElementIF {

	@Override
	public void accept(VisitorIF param) {
		param.visitConcreteElementB(this);
	}

	public void operationB() {
		System.out.println("ConcreteElementB.operationB() called.");
	}
}
