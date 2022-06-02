package com.aiite.programs;

public class BasicPrograms {


	public static void main(String[] args) {

		//		//factorial
		//		//6 - 1 2 3 4 5 6
		//		//720
		//int number = 6;
		//int factorial=1; 
		//		for (int i = 1; i <=number; i++) {
		//			factorial = factorial*i;
		//			
		//		}
		//		System.out.println(factorial);


		//		-------------- count of even numbers from 1 to 100 -------------
		int evencount=0;
		int oddcount=0;
		for(int i=1; i<=6; i++) {

			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}

		}
		System.out.println("evencount "+ evencount);
		System.out.println("oddcount "+ oddcount);


		//even and odd number sum	
		//		1 - 6 -> 2, 4, 6 - even number sum = 2+4+6 = 12
		//		      -> 1, 3, 5 odd number sum = 1+3+5 = 9

		int evensum=0;
		int oddsum=0;
		for(int i=1; i<=6; i++) {

			if(i%2==0) {
				evensum= evensum+i;
			}
			else {
				oddsum= oddsum+i;
			}

		}
		System.out.println("evensum "+ evensum);
		System.out.println("oddsum "+ oddsum);


		//reverse the number
		// - / divide - quo
		//		    % - reminder
		//		//1 2 3 4 - 
		//		4*10= 40+3 - 43*10 - > 430+2 -> 432
		//		value - 4 3 2 1
		//		output -> 4321
		int rem=0;
		int reverse=0;
		int num = 450067000;
		int temp=num;
		String reverseString="";
		
		while(num>0) {
			rem = num%10;
			String value = Integer.toString(rem);
			reverseString=reverseString+value;
			reverse= (reverse*10)+rem;
			num=num/10;

		}
		System.out.println("Reverse String: "+ reverseString);
		System.out.println("reverse "+reverse);
		
		
		//palindrome - malayalam - malayalam //dood - dood
		//1234 - 4321
		
		//print number or not----------------------------------------------
		int oneNumber = 15;
		Boolean isPrime = true;
		//2 3 4 5 6 7 8 9 - must not be divisible
		
		for(int i = 2; i<oneNumber; i++) {
			
			if(oneNumber%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime==true) System.out.println("The number is Prime");
		if(isPrime==false) System.out.println("The number is NOT prime");
	
		
		//print number or not  - LIST OF PRIME NUMBERS
		Boolean isItPrime = true;
		System.out.println("List of prime numbers");
			for(int j=2; j<100; j++)	{ //numbers to be checked
				for(int i = 2; i<j; i++) {
					
					if(j%i==0) {//if 0 it is not prime
						isItPrime= false;
						break;
					}
							
				}
				if(isItPrime==true) System.out.print(j+" ");
				isItPrime=true;
				
			}
				
			






	}//main ends here


}//class ends here
