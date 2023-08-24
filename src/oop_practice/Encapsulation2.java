package oop_practice;

class Point{
	private int x;
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(3,5);
		Point p2 = new Point(6,8);
		
		int x = p1.getX()+p2.getX();
		int y = p1.getY()+p2.getY();
		
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
		Point p3 = new Point();
		
		p3.setX(x);
		p3.setY(y);
		
		System.out.println(p3.getX()+" "+p3.getY());
		

	} 

}
