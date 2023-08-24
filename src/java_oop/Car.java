package java_oop;

class Vehical{
	protected String brand = "Ford";
	
	public void honk() {
		System.out.println("Tutu Tutu...");
	}
}

public class Car extends Vehical {
	
	private String modelName = "Mustang";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.honk();
		
		System.out.println(myCar.brand+" "+myCar.modelName);

	}

}
