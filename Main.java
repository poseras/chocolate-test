
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		b.addCustomer(new Customer(1, "A A", 35000));
		b.addCustomer(new Customer(2, "A B", 5000));
		b.addCustomer(new Customer(3, "D C", 15000));
		
		b.sortCustomers();
		b.printCustomers();
		
		b.customerArrival(2);
		b.customerArrival(1);
		b.customerArrival(4);
		
		b.serveCustomer(1);
		b.serveCustomer(2);
		b.serveCustomer(3);

	}

}
