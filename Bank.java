import java.util.ArrayList;

public class Bank {

	private ArrayList<Customer> customerList;
	private CustomerQueue pendingCustomers;

	public Bank() {
		this.customerList = new ArrayList<Customer>();
		this.pendingCustomers = new CustomerQueue();
	}

	public void addCustomer(Customer c) {
		this.customerList.add(c);
	}

	public void customerArrival(int id) {

		Customer c = this.customerExists(id);
		if (c != null) {
			this.pendingCustomers.push(c);
		} else {
			System.out.println("------------------");
			System.out.println("The customer with id = " + id + " does not exist");
		}

	}

	private Customer customerExists(int id) {
		for (Customer c : this.customerList) {
			if (c.getId() == id) {
				return c;
			}
		}

		return null;
	}

	public void serveCustomer(int transactionType) {
		Customer c = this.pendingCustomers.pop();

		if (c != null) {
			if (transactionType == 1) {
				c.withdraw(1000);
			} else if (transactionType == 2) {
				c.balance();
			} else {
				c.deposit(1000);
			}
		}
		else {
			System.out.println("------------------");
			System.out.println("No more customers to serve");
		}

	}
	
	//Subject 2
	public void sortCustomers() {
		Customer temp;
		int j;
		for(int i = 1; i< this.customerList.size(); i++) {
			temp = this.customerList.get(i);
			j = i;
			
			while(j > 0 && this.customerList.get(j - 1).isGreaterThan(temp)) {
				this.customerList.set(j, this.customerList.get(j - 1));
				this.customerList.set(j - 1, temp);
				j--;
			}
		}
	}
	
	//Subject 2
	public void printCustomers() {
		for(Customer c: this.customerList) {
			c.printInfo();
		}
	}

}
