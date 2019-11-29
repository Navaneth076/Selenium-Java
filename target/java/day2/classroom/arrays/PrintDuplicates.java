package day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int loop=0;

		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		//1334566778 11

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
		Arrays.sort(data);
		for(int i=0; i < data.length-1; i++) {
			loop++;
			if(data[i] == data[i+1]) {
				
				System.out.println(data[i]);
			}
		}
		System.out.println("current loop" + loop);

		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
