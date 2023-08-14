package oop_practice;

public class Uni_Student {
	
	static String name; // static variable
	
	int age; // instance variable
	
	
	public Uni_Student(){ // Constructor
		
	}
	
	public void scan() { // instance method
		
	}
	
	public static void scan1() {  // static method
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Uni_Student stu1 = new Uni_Student();
		Uni_Student stu2 = new Uni_Student();
		
		stu1.age = 12; // instance
		
		stu1.scan();
		
		
		
		// static 
		
		Uni_Student.scan1();
		
		scan1();
		
		Uni_Student.name = "John";
		
		System.out.println(name);
		

	}

}
