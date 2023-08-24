package abstraction;

public class Salary extends Employee{
	
	private double salary;

	Salary(String name, String address, int number, double salary){
		super(name,address,number);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		
		if(salary > 0.0) {
			this.salary = salary;
		}
	}
	
	public double computePay() {
		System.out.println("Computing salary pay for "+getName());
		return salary/52;
	}
	
}
