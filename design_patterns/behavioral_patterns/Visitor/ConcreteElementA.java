/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.Visitor;

public class ConcreteElementA implements ElementIF {

	@Override
	public void accept(VisitorIF param) {
		param.visitConcreteElementA(this);
	}

	public void operationA() {
		System.out.println("ConcreteElementA.operationA() called.");
	}

}
