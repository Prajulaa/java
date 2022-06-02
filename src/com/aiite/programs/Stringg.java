package com.aiite.programs;


public class Stringg {

	public static void main(String[] args) {
        
		//reverse the words and characters string
		String value="Knowledge is Power";
		
		for(int i=value.length()-1; i>=0; i--) {
			System.out.print(value.charAt(i));
			
		}
		
		System.out.println();
		
		//let the words remain- reverse only the characters
		String[] valueArray = value.split(" "); //value--> 0 - Knowledge 1-is 3-Power
		
		for(int i=0; i<valueArray.length; i++) {//acccessing the values in the array
			
			int length = valueArray[i].length(); //knowledge
			
			for(int j=length-1; j>=0; j--) {
				System.out.print(valueArray[i].charAt(j));
			}
			System.out.print(" ");
			
		}
		
		System.out.println();
		
		//print the word count of the given string
		String string = "This is a very easy program to understand and explain";
		String[] wordCount = string.split(" ");
		
		System.out.println("The number of words in the string is: "+ wordCount.length);
		
		
		
		//check if the string is a palindrome
		String palindromeOrNot = "Malayalam dood malayalam";
		String reverse = "";
		
		for(int i=palindromeOrNot.length()-1; i>=0; i--) {
	
			reverse= reverse+ palindromeOrNot.charAt(i);
			
		}
	System.out.println("Entered String: "+ palindromeOrNot);
	System.out.println("Reversed String: "+ reverse);
		if(palindromeOrNot.equalsIgnoreCase(reverse)) {
			System.out.println("The entered string is a palindrome");
		}
		else {
			System.out.println("The entered string is NOT a palindrome");
		}
		
		
		
		
	}//main ends here

}//class ends here
