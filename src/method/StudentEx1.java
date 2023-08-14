package method;

public class StudentEx1 {
	
	String name;
	int age;
	
	static String module = "Unit 1: Programming";
	
	public void createStudent() {
		System.out.println("Create Student object = "+name+" "+age);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentEx1 stu1 = new StudentEx1();
		
		StudentEx1 stu2 = new StudentEx1();
		
		stu1.name = "Su Su";
		stu1.age = 23;
		
		stu2.name = "Aung Aung";
		stu2.age = 19;
		
		stu1.createStudent();
		
		System.out.println(StudentEx1.module);
		
		StudentEx1.display();
		
		

	}
	
	
	public static void display() {
		System.out.println("Course is "+module);
		
	}

}
