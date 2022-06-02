package com.aiite.programs;

public class Palindrome {

	public static void main(String[] args) {

		//reverse a number
		long number= 1200003405; //why is this not working? :(
		int number1= 1200003405;
		//5 - 50+0 -> 50 -> 500+4 - 504 --> 5040+0 - 5040 --> 5043 50430
		long reverse=0;//9 - 90 - 98
		int reverse1=0;
		System.out.println("Enterd number: "+number1);
		while(number>0) {
			int test = number1%10;
			long reminder = number%10;
			System.out.println("Number:"+number1+" Test :"+test +" remd :"+reminder);
			reverse= (reverse*10)+reminder;
			reverse1 = (reverse1*10)+test;
			number = number/10;
			number1 = number1/10;	
		}
			
		System.out.println("Using long: "+reverse);
		System.out.println("using int: "+ reverse1);
	
		System.out.println("-----------------------------------------------------------------------");
		
		//print the palindrome numbers from 1 to 100
		
	for(int i=1; i<=100; i++) {
		
		
		
	}
		
		
		
		
		
		
		
		
	}//main ends here

}
