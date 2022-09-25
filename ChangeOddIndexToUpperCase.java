package week1.assignment;

public class ChangeOddIndexToUpperCase {

	
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
//		String test = "changeme";
//		char[] charArray = test.toCharArray();
//		for (int i = 0; i < charArray.length; i++) {
//			
//			//System.out.println(charArray[i]);
//			if (i%2 == 0) { 
//				test = test + charArray[i].toUpperCase(); 
//			} 
//			else { 
//				test = test + charArray[i].toLowerCase(); 
//			} 
//		}
		
		
		private void changeToUpperCase() {
			// TODO Auto-generated method stub
			String inputStr="changeme";
			;
			char[] inputStrArr=inputStr.toCharArray();
			for (int i = 0; i <= inputStrArr.length-1; i++) {
				if(i%2!=0) 
					System.out.println(Character.toUpperCase(inputStrArr[i]));

				else 
					System.out.println(inputStrArr[i]);

				inputStrArr[i]=Character.toUpperCase(inputStrArr[i]);
			}
		}
		public static void main(String[] args) {
			ChangeOddIndexToUpperCase obj=new ChangeOddIndexToUpperCase();
			obj.changeToUpperCase();
		}
		
		
		
		
		
		

	}


