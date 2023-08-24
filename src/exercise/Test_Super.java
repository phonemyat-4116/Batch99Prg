package exercise;

class Animal{
	
	protected String color;
	protected String name;
	protected int age;
	
	Animal(String color){
		this.color = color;
	}
	
	public void sound() {
		System.out.println("Animal created sound");
	}
}

class Dog extends Animal{
	
	Dog(String color, String name, int age){
		super(color);
		this.name = name;
		this.age = age;
	}
	
	public void getDog() {
		System.out.println("Name is "+name+", "+"Color is "+color+", "+"Age is "+age);
	}
	
//	@Overriden
	public void sound() {
		System.out.println("Bow Bow...");
	}
	
	public void behaviour() {
		
		
//		display method of Animal sound 
		super.sound();
		
//		display method of Dog sound
		sound();
	}
}

public class Test_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Brown","AungNet",34);
		
//		dog1.behaviour();
		
		dog1.getDog();
		
		System.out.println(dog1.color);

	}

}
