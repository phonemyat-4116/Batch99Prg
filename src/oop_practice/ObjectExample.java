package oop_practice;

class Box{
	
	double height;
	double length;
	double depth;
	
	void volumeDisplay() {
		System.out.println("The volume is "+(height*length*depth));
	}
	
	double volumeReturn() {
		return height*length*depth;
	}
	
}

public class ObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.height=34;
		mybox1.length=45;
		mybox1.depth=14;
		
		mybox2.height=25;
		mybox2.length=13.6;
		mybox2.depth=18.5;
//		Box mybox2 = mybox1;  // it doesn't creat new Box object, just refers to the same object
		
		mybox1.volumeDisplay();
		
		mybox2.volumeDisplay();
		
		System.out.println();
		
		System.out.println("The volume 1 is "+mybox1.volumeReturn());
		System.out.println("The volume 2 is "+mybox2.volumeReturn());

	}

}
