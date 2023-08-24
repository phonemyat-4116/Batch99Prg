package method;

public class Recursive_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,4,6,8,10};
		
		System.out.println(arrSum(A,A.length));

	}
	
	public static int arrSum(int[] a, int b) {
		
		if(b == 0) {
			return 0;
		}else {
			return a[b-1] + arrSum(a,b-1);
			 
		}
		
		
	}

}
