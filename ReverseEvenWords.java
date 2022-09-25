package week1.assignment;

import java.util.Arrays;

public class ReverseEvenWords {

	
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		
		
	private void reverseEvenWords() {
		// TODO Auto-generated method stub
	 String input="I like Ice Cream I love it";
	 System.out.println("Input given is: "+ input);
	 String[] strings = input.split(" ");
	 System.out.println(Arrays.toString(strings));
	 System.out.println("Reversed even words in the input as follows,");
	 //Get even words
	 char[] str;
	 for(int i=0;i<strings.length-1;i++) {
		 if(i%2==0) {
			 //System.out.println(strings[i+1]);
			 str=strings[i+1].toCharArray();
			 for(int j=str.length-1;j>=0;j--)
			 System.out.print(str[j]);
		 }
		 System.out.println();
	 }
	}
	public static void main(String[] args) {
		ReverseEvenWords reverse=new ReverseEvenWords();
		reverse.reverseEvenWords();
	}
	

}
