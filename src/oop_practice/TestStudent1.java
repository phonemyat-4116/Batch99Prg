package oop_practice;


public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		
		Student stu2 = new Student();
		
		
		stu1.set_data("Michel", 24);
		
		stu2.set_data("William", 23);
		
		stu1.set_gender("Male");
		
		System.out.println(stu1.get_data());
		
		System.out.println(stu2.get_data());
		
		System.out.println(stu1.get_data()+" is "+stu1.get_gender());
		
		
		

	}

}
