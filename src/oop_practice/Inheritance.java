package oop_practice;

class A{
	int i;
	int j;
	
	public void showij() {
		System.out.println("i = "+i+", j = "+j);
	} 
}

class B extends A{
	int k;
	
	public void showk() {
		System.out.println("k = "+k);
	}
	
	public void sum() {
		System.out.println("Sum of i,j,k is "+(i+j+k));
	}
}

// In a class hierarchy, private members remain private to their class.

/* Although a subclass includes all of the members of its superclass, 
it cannot access those members of the superclass that have been declared as private */

class C{
	int num1;
	private int num2;
}

class D extends C{
	
}




public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A sup = new A();
		B sub = new B();
		
		sup.i=10;
		sup.j=20;
		
		sup.showij();
		
		
		sub.i = 7;
		sub.j = 8;
		sub.k = 5;
		
		sub.showk();
		sub.sum();
		
		D sub2 = new D();
		
		sub2.num1 = 12;
		
//		sub2.num2 = 13; // throw error. num2 is private in superclass

	}

}
