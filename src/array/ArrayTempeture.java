package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTempeture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int temperature_Day[] = new int[7];
		
		int totalDay_temperature = 0;
		
		for(int i=0; i<temperature_Day.length; i++) {
			System.out.println("Enter temperature for day "+(i+1));
			temperature_Day[i] = scan.nextInt();
			
			totalDay_temperature = totalDay_temperature+temperature_Day[i];
		}
		
		int average_temperature =  totalDay_temperature/temperature_Day.length;
		
		
		System.out.println("Average temp = "+average_temperature);
		
		
		int aboveAverage = 0;
		int belowAverage = 0;
		
		for(int i=0; i<temperature_Day.length; i++) {
			if(temperature_Day[i] > average_temperature) {
				aboveAverage++;
			}else {
				belowAverage++;
			}
		}
		
		System.out.println(aboveAverage+" days were above average");
		System.out.println(belowAverage+" days were above average");
		
		
		System.out.println("Temperature : "+Arrays.toString(temperature_Day));
		
		Arrays.sort(temperature_Day);
		System.out.println("Sorting Temperature : "+Arrays.toString(temperature_Day));
		
		System.out.println("Two coldest days : "+temperature_Day[0]+", "+temperature_Day[1]);
		System.out.println("Two hottest days : "+temperature_Day[temperature_Day.length-1]+", "+temperature_Day[temperature_Day.length-2]);
		
		System.out.println();
		
		
		int anotherDay_temperature[] = new int[7];
		
		for(int i=0; i<anotherDay_temperature.length; i++) {
			System.out.println("Enter temperature for day "+(i+1));
			anotherDay_temperature[i] = scan.nextInt();
			
		}
		
		Arrays.sort(anotherDay_temperature);
		
		if(Arrays.equals(temperature_Day, anotherDay_temperature)) {
			System.out.println("Equal Temperature");
		}else {
			System.out.println("Not Equal Temperature");
		}
		
		Arrays.fill(anotherDay_temperature, 34);
		
		System.out.println("Another Day Temperature : "+Arrays.toString(anotherDay_temperature));
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
