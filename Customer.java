
public class Customer {
	
	private int id;
	private String name;
	private int balance;
	private Customer next;
	
	public Customer(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.next = null;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("------------------");
		System.out.println("Deposited " + amount + " euros");
		System.out.println("Current balance: " + this.balance);
	}
	
	public void withdraw(int amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			System.out.println("------------------");
			System.out.println("Withdrawn " + amount + " euros");
			System.out.println("Current balance: " + this.balance);
		}
		else {
			System.out.println("------------------");
			System.out.println("Current balance is not adequate");
		}
	}
	
	public void balance() {
		System.out.println("------------------");
		System.out.println("Current balance: " + this.balance);
	}
	
	public void setNextCustomer(Customer c) {
		this.next = c;
	}
	
	public Customer getNextCustomer() {
		return this.next;
	}
	
	public int getId(){
		return this.id;
	}
	
	
	//Subject 2
	public void printInfo() {
		System.out.println("-----------");
		System.out.println("Customer name: " + this.name);
		System.out.println("Customer id: " + this.id);
		System.out.println("Customer balance: " + this.balance);
	}
	
	//Subject 2
	public boolean isGreaterThan(Customer other) {
		if(this.balance > other.balance) {
			return true;
		}
		
		return false;
	}

}
