package sample_program;

public class BasicExample2 {
	
	static String staticName;
	
	int instanceAge;
	String instanceName;
	int instancePhone;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Static Variable 
		
		staticName = "James";
		
		System.out.println(staticName);
		
		
//		Instance Variable (access with object)
		
		BasicExample2 stu1 = new BasicExample2();
		BasicExample2 stu2 = new BasicExample2();
		
		stu1.instanceAge=23;
		stu1.instanceName="John";
		stu1.instancePhone=454454435;
		
		stu2.instanceAge=50;
		stu2.instanceName="Michel";
		stu2.instancePhone=53924759;
		
		System.out.println(stu1.instanceAge);
		System.out.println(stu1.instanceName);
		System.out.println(stu1.instancePhone);
		
		System.out.println();
		
		System.out.println(stu2.instanceAge);
		System.out.println(stu2.instanceName);
		System.out.println(stu2.instancePhone);
		
//		Local variable 
		

	}

}
