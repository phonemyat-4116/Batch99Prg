package java_oop;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
		name = "Aung Aung";
		age = 30;
		
	}
	
	public Person(String n, int a) {
		
		this.name = n;
		this.age = a;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		Person p2 = new Person("Su Su",45);
		
		
		System.out.println(p1.name+" is "+p1.age);
		
		System.out.println(p2.name+" is "+p2.age);

	}

}
