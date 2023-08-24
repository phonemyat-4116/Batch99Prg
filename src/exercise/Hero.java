package exercise;

public class Hero {

	public String name;
	public String power;
	
	public void getHero(String name, String power) {
		this.name = name;
		this.power = power;
		
		System.out.println(name+"\n"+power);
	}

}
