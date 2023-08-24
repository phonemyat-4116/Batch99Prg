package abstraction;


public abstract class Employee {
	
	private String name;
	private String address;
	private int number;
	
	protected abstract double computePay();
	
	Employee(String name, String addr, int num){
		this.name = name;
		this.address = addr;
		this.number = num;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void display() {
		System.out.println(name+" "+address+" "+number);
	}
	
}
