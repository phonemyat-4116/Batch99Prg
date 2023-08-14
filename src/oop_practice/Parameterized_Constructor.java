package oop_practice;

public class Parameterized_Constructor {
	
	String language;
	
	Parameterized_Constructor(String lang){
		language = lang;
		
		System.out.println("The language is "+language);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameterized_Constructor obj1 = new Parameterized_Constructor("Java");
		
		
		Parameterized_Constructor obj2 = new Parameterized_Constructor("Python");
		
		Parameterized_Constructor obj3 = new Parameterized_Constructor("C");
		
		

	}

}
