package java_oop;

import java.util.Scanner;

public class Animal_GetterSetter {
	
	private String name; 
	private int age;
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = scan.nextLine();
		
		System.out.println("Enter Age");
		int age = scan.nextInt();
		
		
		Animal_GetterSetter dog = new Animal_GetterSetter();
		
		Animal_GetterSetter dog2 = new Animal_GetterSetter();
		
		dog.setName(name);
		dog.setAge(age);
		
		System.out.println("Name is "+dog.getName());
		System.out.println("Age is "+dog.getAge());
		
		scan.nextLine();
		
		System.out.println("Enter Name");
		String name1 = scan.nextLine();
		
		System.out.println("Enter Age");
		int age1 = scan.nextInt();
		
		dog2.setName(name1);
		dog2.setAge(age1);
		
		System.out.println("Name is "+dog2.getName());
		System.out.println("Age is "+dog2.getAge());

	}

}
