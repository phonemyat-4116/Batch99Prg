package method;

public class Recursive_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		System.out.println(fact(9));
		
		System.out.println(sum(7));
		

	}
	
	public static int fact(int f) {
		if(f >= 1) {
			return f * fact(f-1);
		}else {
			return 1;
		}
		
	}
	
	public static int sum(int n) {
		if(n > 0) {
			return n + sum(n-1);
		}else {
			return 0;
		}
	}
	
	


}
