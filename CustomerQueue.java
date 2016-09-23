
public class CustomerQueue {
	
	/*private int id;
	private String name;
	private int balance;*/
	private Customer head;
	private Customer tail;
	
	public CustomerQueue() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		
		return false;
		
	}
	
	public void push(Customer c) {
		if(this.isEmpty()) {
			this.head = c;
		}
		else {
			this.tail.setNextCustomer(c);
		}
		
		this.tail = c;
	}
	
	public Customer pop() {
		Customer currentHead = null;
		
		if(this.isEmpty()) {
			System.out.println("------------------");
			System.out.println("The queue is already empty");
		}
		else {
			currentHead = this.head;
			this.head = this.head.getNextCustomer();
			
			if(this.head == this.tail) {
				this.tail = null;
			}
		}
		
		
		return currentHead;
		
		
	}
	

}


