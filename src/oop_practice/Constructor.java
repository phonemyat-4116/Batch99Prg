package oop_practice;

public class Constructor {
	
	private String name;
	
	private Constructor() {
		name = "Su Su";
		System.out.println("The Constructor called");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		when the object is created, the MethodConstructor() is called 
		
		Constructor obj = new Constructor();
		
		System.out.println("The name is "+obj.name);

	}

}
