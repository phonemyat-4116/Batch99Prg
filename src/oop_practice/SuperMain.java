package oop_practice;

class Person_1{
	String name;
	int age;
	
	public Person_1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

class Hero extends Person_1{
	
	String power;
	
	public Hero(String name, int age, String power) {
		super(name,age);
		this.power = power;
	}
	
}

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h1 = new Hero("John",23,"everything");
		
		System.out.println(h1.age);
		

	}

}
