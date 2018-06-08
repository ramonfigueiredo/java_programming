/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.behavioral_patterns.TemplateMethod;

public class ConcreteClass2 extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("ConcreteClass2.primitiveOperation1() called.");
	}

	@Override
	public void primitiveOperationN() {
		System.out.println("ConcreteClass2.primitiveOperationN() called.");
	}

}
