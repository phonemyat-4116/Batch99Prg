package method;

import java.util.Scanner;

public class Call_by_Reference {
	
	int A, B;
	
	public Call_by_Reference(int a, int b) {
		this.A = a;
		this.B = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Call_by_Reference s1 = new Call_by_Reference(10,20);
		
		System.out.println("A = "+s1.A);
		System.out.println("B = "+s1.B);
		
		swap(s1);
		
		System.out.println();
		
		System.out.println("A = "+s1.A);
		System.out.println("B = "+s1.B);

	}
	
	public static void swap(Call_by_Reference S1) {
		int temp = S1.A;
		
		S1.A = S1.B;
		
		S1.B = temp;
		
		System.out.println("After swapping ");
		
		System.out.println("A = "+S1.A);
		System.out.println("B = "+S1.B);
	}

}
