package java_oop;

class Calculation{
	
	protected int a, b;
	
	public void sum() {
		System.out.println("Sum is "+(a+b));
	}
	
}

public class MyCalculation extends Calculation {
	
	public void mutiply() { 
		System.out.println("Multiply is "+(a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculation myCal = new MyCalculation();
		
		myCal.a = 12;
		myCal.b = 5;
		
		myCal.mutiply();

	}

}
