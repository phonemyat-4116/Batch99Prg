package exercise;

public class Rectangle {
	
	int length, width;
	
	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}
	
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}
	
	public void rec_Area() {
		System.out.println("The area is "+(length*width));
	}
	
	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(5,6);
		
		System.out.println(rec1.length);
		
		
	}

}
