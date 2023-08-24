package exercise;

class Household{
	int occupants, annual_income;
	
	public int getOccupants() {
		return occupants;
	}
	
	public int getIncome() {
		return annual_income;
	}
	
	public void setOccupants(int o) {
		this.occupants = o;
	}
	
	public void setIncome(int i) {
		this.annual_income = i;
	}
	
	public Household() {
		this.occupants = 1;
		this.annual_income = 0;
	}
	
	public Household(int o) {
		this.occupants = o;
	}
	
	public Household(int o, int i) {
		this.occupants = o;
		this.annual_income = i;
	}
	
	
}

public class TestHousehold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Household h1 = new Household();
		
		Household h2 = new Household(5);
		
		Household h3 = new Household(6,1000);
		
		
		System.out.println(h1.getOccupants()+" "+h1.getIncome());
		
		h1.setIncome(2000);
		
		h1.setOccupants(8);;
		
		System.out.println(h1.getOccupants()+" "+h1.getIncome());
		
		System.out.println(h2.getOccupants()+" "+h2.getIncome());
		
		h2.setOccupants(12);
		
		System.out.println(h2.getOccupants()+" "+h2.getIncome());
		
		System.out.println(h3.getOccupants()+" "+h3.getIncome());

	}

}
