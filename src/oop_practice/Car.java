package oop_practice;

class Vehical{
	protected String brand = "BMW";
	
	public void honk() {
		System.out.println("Ar.. Ar..");
	}
}

public class Car extends Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		System.out.println(myCar.brand);
		
		myCar.honk();
	}

}
