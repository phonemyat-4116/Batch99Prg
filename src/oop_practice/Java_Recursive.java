package oop_practice;

public class Java_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(10));
		
		System.out.println(sum(5,10));

	}
	
	
	public static int sum(int num) {
		if(num > 0) {
			return num + sum(num - 1);
		}else {
			return num;
		}
	}
	
	public static int sum(int start, int end) {
		if(end > start) {
			return end + sum(start,end-1);
		}else {
			return end;
		}
	}
	

}
