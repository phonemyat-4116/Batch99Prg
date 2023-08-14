package java_oop;

import java.util.Scanner;

public class StudentExercise {
	
	String name;
	int age;
	
	public StudentExercise() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name");
		name = scan.nextLine();
		
		System.out.println("Enter Age");
		age = scan.nextInt();
	}
	
	public StudentExercise(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public static void main(String args[]) {
		
		StudentExercise stu1 = new StudentExercise();
		
		StudentExercise stu2 = new StudentExercise("Ketty",23);
		
		System.out.println("Name is "+stu1.name);
		System.out.println("Name is "+stu1.age);
		
		
		
	}

}
