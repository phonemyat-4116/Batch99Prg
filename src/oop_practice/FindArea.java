package oop_practice;

class Rectangle{
	int length;
	int height;
	
	void set_length(int l) {
		length = l;
	}
	
	void set_height(int h) {
		height = h;
	}
	
	void get_rectangle_area() {
		System.out.println("The area is "+(length*height));
	}
}

public class FindArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle();
		
		rec.set_length(5);
		rec.set_height(9);
		
		rec.get_rectangle_area();

	}

}
