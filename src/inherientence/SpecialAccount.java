package inherientence;

public class SpecialAccount extends Account {
	
//	public SpecialAccount() {
//		super();
//	}
	
	public SpecialAccount(String name, double withdraw) {
		super(name);
		this.withdraw = withdraw;
	}
	
	public void getResult() {
		System.out.println("Username : "+this.name); 
		System.out.println("Total Amount : "+getAmount());
		System.out.println("Withdraw Amount : "+this.withdraw);
		System.out.println("Remaining Amount : "+(getAmount()-this.withdraw));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialAccount sp = new SpecialAccount("Phone Myat Thu",4000);
		
		sp.setAmount(5000);
		
		sp.getResult();
		

	}

}
