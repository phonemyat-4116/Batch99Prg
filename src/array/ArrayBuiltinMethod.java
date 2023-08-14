package array;

import java.util.Arrays;

public class ArrayBuiltinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {54,2,8,4,7};
		
		Arrays.sort(A);
		
		System.out.println("A is "+Arrays.toString(A));
		
		int num = 5;
		
		int index = Arrays.binarySearch(A, num);
		
		if(index < 0) {
			System.out.println("Not Found");
		}else {
			System.out.println(num+" is found at index "+index);
		}
		
		
//		Arrays.copyOf(null, length of array)
		
		int B[] = Arrays.copyOf(A, A.length);
		
		System.out.println("B is "+Arrays.toString(B));
		
		int C[] = {2,4,8,7,54};
		
		
//		return true if the two arrays contains same element and in same order 
		System.out.println(Arrays.equals(A, C));
		
		
		
//		Arrays.fill(null, value);
		
		Arrays.fill(B, 100);
		
		System.out.println(Arrays.toString(B));
		
//		Arrays.fill(null, start index, end index but not included, value);
		
		Arrays.fill(B, 1, 4, 99);
		
		System.out.println(Arrays.toString(B));
		
		
		
	

	}

}
