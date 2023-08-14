package array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {4,6,2,5,3,6};
		
		int[] B = A;
		
		if(A.equals(B)) {
			System.out.println("is equal");
		}else {
			System.out.println("is not equal");
		}
		
		System.out.println(Arrays.toString(B));
	}

}
