package algorithm;

import java.util.Scanner;

public class Linear_Search {
	
	static Scanner scan = new Scanner(System.in);
	
	static int[] arr;
	static int length;
	static int key;
	
	public static void main(String[] args) {
		
		input();
		
		display();

		
	}
	
	public static void input() {
		System.out.print("Enter the length : ");
		length = scan.nextInt();
		
		arr = new int[length];
		
		System.out.println();
		
		for(int i=0; i<length; i++) {
			System.out.println("Enter value");
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println();
		
		System.out.print("Enter key : ");
		key = scan.nextInt();
	}
	
	public static int linearSearch(int[] Arr, int l, int k) {
		for(int i=0; i<length; i++) {
			if(Arr[i]==k) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void display() {
		
		int return_search = linearSearch(arr,length,key);
		
		if(return_search == -1) {
			System.out.println("Element is not found");
		}else {
			System.out.println("The key "+key+" is found at index "+return_search);
		}
	}
	

}
