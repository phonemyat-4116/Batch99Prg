package abstraction;

abstract class Language{
	
	String name = "Java";
	
	public void web() {
		System.out.println("Languge for website");
	}
	
	abstract void mobile();
	abstract void game();
	
}

class Programming extends Language{

	@Override
	void mobile() {
		System.out.println("Language for Mobile");
		
	}

	@Override
	void game() {
		System.out.println("Language for Game");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programming lan = new Programming();
		
		System.out.println(lan.name);
		
		lan.mobile();
		lan.game();
		

	}

}
