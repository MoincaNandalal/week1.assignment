package week1.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
	private void isPalindrome() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner objScan=new Scanner(System.in);
		System.out.println("Please enter the number: ");
		String inputNumber = objScan.next();

		char[] arr=inputNumber.toCharArray();

		//System.out.println(inputNumber.toCharArray());
		int length=arr.length, divLength_i, divLength_j;
		int mid=(int)length/2;
		char[] arr1=new char[(int)mid];
		char[] arr2=new char[(int)mid];
		if(length%2!=0) {
			divLength_i= (int) Math.floor(mid)-1;
			divLength_j= (int) Math.ceil(mid)+1;
		}
		else {
			divLength_i=(int)mid-1; //mid-1 
			divLength_j= (int)mid;
		}

		for (int i = 0; i <= divLength_i; i++) {
            arr1[i]=arr[i];
		}
		String left=Arrays.toString(arr1);
		//System.out.println(left);
		int k=0;
		for (int j = length-1; j >= divLength_j; j--) {
			arr2[k]=arr[j];;
			k++;
		}
		String right=Arrays.toString(arr2);
		//System.out.println(right);

		boolean isPalindrome=false;
		String resultMessage=null;
        if(left.equals(right)) {
        	isPalindrome=true;
        }
        resultMessage=isPalindrome?"Its a Palindrome":"Its not a Palindrome";
    	System.out.println(resultMessage);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Palindrome objPalindrome=new Palindrome();
		objPalindrome.isPalindrome();
	}
	
	
	
		
	

}
