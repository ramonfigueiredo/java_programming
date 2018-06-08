/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.TemplateMethod;

public class ConcreteClass1 extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("ConcreteClass1.primitiveOperation1() called.");
	}

	@Override
	public void primitiveOperationN() {
		System.out.println("ConcreteClass1.primitiveOperationN() called.");
	}

}
