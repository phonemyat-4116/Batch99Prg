package sample_program;

public class Variable {
	
	static String name = "Jolle";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable age = new Variable();
		
		getName();
		
		age.getAge();

	}
	
	public static void getName() {
		System.out.println(name);
	}
	
	public void getAge() {
		
		int age = 45;
		System.out.println(age);
	}

}
