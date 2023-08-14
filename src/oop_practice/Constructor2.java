package oop_practice;

class Student_Class{
	
	String name;
	
	public Student_Class() {
		name = "Joe";
	}
	
}



public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Class obj = new Student_Class();
		
		System.out.println("The student is "+obj.name);

	}

}
