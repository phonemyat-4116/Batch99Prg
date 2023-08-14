package sample_program;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=0; i<10; i++) {
			for(int j=9; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=0; i<=10; i++) {
			for(int j=10; j>i; j--) {
				System.out.print("*");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<=10; i++) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j=10; j>i; j--) {
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}

	}

}
