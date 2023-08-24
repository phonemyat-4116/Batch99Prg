package inherientence;

public class Account {
	
	String name;
	private double amount;
	protected double withdraw; // can be access by inherited classes
	
	protected Account() {
		System.out.println("Constructor without Param");
	}
	
	protected Account(String name) {
		this.name = name;
		System.out.println("Constructor with Param");
	}
	
	protected void setAmount(double amount) { // update private amount with setter
		if(amount > 0.0) {
			this.amount = amount;
		}
	}
	
	protected double getAmount() { // get private amount with getter
		return this.amount;
	}

}
