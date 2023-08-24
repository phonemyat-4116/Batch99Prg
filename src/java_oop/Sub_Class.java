package java_oop;

class Super_Class{
	
	int num = 20;

	// display method of superclass
	
	public void display() {
		System.out.println("Super_Class Method");
	}
	
}

public class Sub_Class extends  Super_Class{
	
	int num = 10;
	
	public void display() {
		System.out.println("Sub_Class Method");
	}
	
	public void myMethod() {
		
//		Sub_Class sub = new Sub_Class();
		
		display();
		
		super.display();
		
		System.out.println("Sub num : "+num);
		
		System.out.println("Sub num : "+super.num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub_Class obj = new Sub_Class();
		
		obj.myMethod();
		

	}

}
