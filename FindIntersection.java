package week1.assignment;

import java.util.Arrays;

public class FindIntersection {

	
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		
	private void FindIntersectionMethod() {
		// TODO Auto-generated method stub
	int[] number1= {1, 2, 7, 5};
	int[] number2= {1, 7, 9, 0};
	System.out.println(Arrays.toString(number1));
	System.out.println(Arrays.toString(number2));
	System.out.println("Intersection is as follows,");
	for(int i=0;i<=number1.length-1;i++) {
		for (int j = 0; j < number2.length; j++) {
			if(number1[i]==number2[j]) System.out.println(number1[i]);
		}
	}
	}
		public static void main(String[] args) {
			FindIntersection obj=new FindIntersection();
			
			obj.FindIntersectionMethod();
		}
	
	
	

}
