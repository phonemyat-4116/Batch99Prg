package exercise;

public class Person extends Hero {
	
	public int age;
	
	public void getPerson() {
		super.getHero("RDJ", "iron man");
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		p1.getPerson();

	}

}
