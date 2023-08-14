package java_oop;

public class Animal {
	
	public String name;
	public int height;
	
	public void getAnimal() {
		name = "Aung Net";
		height = 4;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Animal();
		
		System.out.println(dog.name); // null value
		
		dog.getAnimal(); // invoke method
		
		System.out.println(dog.name); // Aung Netx

	}

}
