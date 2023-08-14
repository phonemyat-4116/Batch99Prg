package sample_program;

public class LoopingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		boolean done = false;
		
		for( ; !done ; ) {
			System.out.println(i);
			
			if(i == 10) {
				done = true;
				
				System.out.println("Loop Done True");
			}
			
			i++;
			
		}
		

	}

}
