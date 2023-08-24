package oop_practice;

class Animal{ // parent class
	public void sound() {
		System.out.println("wow..");
	}
}

class Cat extends Animal{ // subclass
	public void sound() {
		System.out.println("Meow Meow"); 
	}
}

class Dog extends Animal{ //subclass
	public void sound() {
		System.out.println("Bow Bow");
	}
	
	public void sound(String angry) {
		System.out.println("Agg Agg..");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		
		cat.sound();
		
		Dog dog = new Dog();
		
		dog.sound();
		dog.sound("angry"); // method overloading
		

	}

}
