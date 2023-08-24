package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter value ");
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Enter Key To Search : ");
		int key = scan.nextInt();
		
		Arrays.sort(arr);
		
		int F = 0;
		int L = arr.length-1;
		int mid;
		
		while(F <= L) {
			mid = (F+L)/2;
			
			if(key == arr[mid]) {
				System.out.println(key+" is found at index "+mid);
				break;
				
			}else if(key > arr[mid]) {
				F = mid + 1;
				
			}else if(key < arr[mid]) {
				L = mid - 1;
				
			}
		}
		
		
		if(F > L) {
			System.out.println("Key is not found");
		}

	}

}
