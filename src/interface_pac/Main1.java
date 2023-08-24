package interface_pac;

class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("Hunt small fish");
		
	}

	@Override
	public void flee() {
		System.out.println("Flee from big fish");
		
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rabbit rab = new Rabbit();
		
		rab.flee();
		
		Tiger tig = new Tiger();
		
		tig.hunt();
		
		Fish fish = new Fish();
		
		fish.flee();
		fish.hunt();

	}

}
