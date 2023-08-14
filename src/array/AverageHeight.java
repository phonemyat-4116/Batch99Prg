package array;

import java.util.Arrays;

public class AverageHeight {
	
	public static void main(String[] args) {
		
		int height[] = {175,167,160,164,183,187,188,179,176,175,169,175,176,178,165};
		
		int totalHeight = 0;
		
		for(int i=0;i<height.length; i++) {
			
			totalHeight = totalHeight+height[i];
			
		}
		
		int averageHeight = totalHeight/15;
		
		System.out.println("The average height is "+averageHeight);
		
		
		int aboveAvearge = 0; int belowAverage = 0;
		
		for(int i=0; i<height.length; i++) {
			
			if(height[i] > averageHeight) {
				aboveAvearge++;
			}else {
				belowAverage++;
			}
			
		}
		
		System.out.println("Above average = "+ aboveAvearge);
		System.out.println("Below average = "+ belowAverage);
		
		int max = height[0];
		int min = height[0];
		
		for(int i=1; i<height.length; i++) {
			
			if(height[i]>max) {
				max = height[i];
				
			}else if(height[i]<min){
				min = height[i];
			}
		}
		
		Arrays.sort(height);
		
		System.out.println(Arrays.toString(height));
		
		System.out.println("The max height is "+max);
		System.out.println("The min height is "+min);
		
		
		
	}

}
