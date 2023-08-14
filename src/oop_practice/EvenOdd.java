package oop_practice;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findEvenOdd(5);

	}
	
	public static void findEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}
	
	

}
