package method;

import java.util.Scanner;

public class TimeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		

		while(true) {
			
			System.out.println("Enter time in Hr:Min:Sec format");
			int hour = scan.nextInt();
			int minute = scan.nextInt();
			int second = scan.nextInt();
			
			System.out.println("Time is "+hour+":"+minute+":"+second);
			
			System.out.println("Total second : "+hms_to_secs(hour,minute,second)+"sec"); // actual parameter
			
			System.out.println();
			
		}

	}
	
	public static long hms_to_secs(int hr, int min, int sec) {  //formal parameter
		long total_sec = (hr*3600)+(min*60)+sec;
		return total_sec;
	}

}
