package P11_Account;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Account {

	private String id;
	private Customer customer;
	private double balance = 0.0;

	public Account(String id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(String id, Customer customer) {
		this.id = id;
		this.customer = customer;
		this.balance = 0;
	}

	public String getID() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return customer.toString() + " balance=" + String.format("%.2f", balance);
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public Account deposit(int amount) {
		this.balance += amount;
		return this;
	}

	public Account withdraw(double amount) {
		if (balance >= amount)
			this.balance -= amount;
		else
			System.out.println("amount withdrawn exceeds the current balance!");

		return this;
	}
}
