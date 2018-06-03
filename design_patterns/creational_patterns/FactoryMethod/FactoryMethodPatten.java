package design_patterns.creational_patterns.FactoryMethod;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class FactoryMethodPatten {
	public static void main(String[] args) {
		System.out.println("FactoryMethod Pattern Demonstration.");
		System.out.println("------------------------------------");
		// Create creator, which uses the FactoryMethod
		CreatorIF creator = new ConcreteCreator();
		// Create trade via factory method
		TradeIF trade = creator.factoryMethod();
		// Call trade action method
		trade.action();
		System.out.println();
	}
}