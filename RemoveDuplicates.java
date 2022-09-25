package week1.assignment;

import java.util.Arrays;

public class RemoveDuplicates {

	
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
	private void removeDuplicate() {
		// TODO Auto-generated method stub
		int[] inputNumbers= {90, 60, 40, 60, 10, 78, 78, 78, 80};
		int[] result=new int[inputNumbers.length];
		Arrays.sort(inputNumbers);
		System.out.println(Arrays.toString(inputNumbers));

		int j=0;
		for (int i = 0; i <= inputNumbers.length-1; i++) {
			if(i==inputNumbers.length-1) {
				result[result.length-1]=inputNumbers[inputNumbers.length-1];
				System.out.println(result[result.length-1]);
				break;
			}
			if(inputNumbers[i] != inputNumbers[i+1]) {
				result[j]=inputNumbers[i];
				System.out.println(result[j]);
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates duplicate=new RemoveDuplicates();
		duplicate.removeDuplicate();
	}
	

}
