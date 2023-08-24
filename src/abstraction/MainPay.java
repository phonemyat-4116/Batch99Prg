package abstraction;

public class MainPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary e1 = new Salary("Kelvin","123 Lake",12,3400.0);
		
		Employee em1 = new Salary("Phone","345 Bush",13,345.0); // Employee is same type with Salary
		
		System.out.println("Name : "+e1.getSalary());
		System.out.println("Address : "+e1.getAddress());
		System.out.println("Number : "+e1.getNumber());
		System.out.println("Salary : "+e1.getSalary());

	}

}
