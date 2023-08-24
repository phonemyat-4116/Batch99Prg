package method;

import java.lang.Math;

public class Overloading {
	
	public static void Sum() {
		int a = 20;
		int b = 10;
		
		System.out.println("Sum is "+(a+b)); 
	}
	
	public static int Sum(int a) {
		int b = 12;
		
		return a+b;
	}
	
	public static void Sum(int a, int b) {
		System.out.println("Int Sum is "+(a+b));
	}
	
	public static void Sum(float a, float b) {
		System.out.println("Float Sum is "+(a+b));
	}
	
	public static int Sum(int a, int b, float c) {
		return (int)(a+b+c);
	}
	
	public static void repChar() {
		for(int i=1; i<=45; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	public static void repChar(char ch) {
		for(int i=1; i<=45; i++) {
			System.out.print(ch+" ");
		}
		
		System.out.println();
	}
	
	public static void repChar(char ch, int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(ch+" ");
		}
		
		System.out.println();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum();
		System.out.println(Sum(4));
		Sum(5,9);
		Sum(5.6f,7.9f);
		
		System.out.println(Sum(2,4,3.5f));
		
		repChar();
		
		repChar('=');
		
		repChar('+',45);
		
	

	}

}
