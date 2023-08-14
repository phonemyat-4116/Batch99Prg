package oop_practice;

public class Constructor_Overloading {
	
	String language;
	
	Constructor_Overloading(){
		language = "Java";
	}
	
	Constructor_Overloading(String lang){
		language = lang;
	}
	
	void getName() {
		System.out.println("The programming language is "+language);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		constructor with no parameter / Java
		Constructor_Overloading obj1 = new Constructor_Overloading();
		
//		constructor with parameter / Python
		Constructor_Overloading obj2 = new Constructor_Overloading("Python");
		
		obj1.getName();
		obj2.getName();

	}

}
