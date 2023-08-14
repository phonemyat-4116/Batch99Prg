package oop_practice;

class Student {
	
	String name;
	int age;
	String gender;
	
	void set_data(String _name, int _age) {
		
		name = _name;
		age = _age;	
	}
	
	
	// the return value will be String containing name and age
	String get_data() {
		return name+" "+age;
	}
	
	void set_gender(String _gender) {
		gender = _gender;
	}
	
	String get_gender() {
		return gender;
	}
	


}
