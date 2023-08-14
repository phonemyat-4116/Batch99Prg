package oop_practice;

class Person{
	private String name;
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		p1.setName("John");
		
		System.out.println(p1.getName());

	}

}
