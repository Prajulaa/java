package com.aiite.programs;

public class PrimeNumber {

	public static void main(String[] args) {

		//to check if the given number is prime
	int number = 15; 
	Boolean isPrime= true;
	
	for(int i=2; i<number; i++) {
		
		if(number%i==0) {//divisible so not prime
			isPrime=false;
			break;
		}
		
	}
	if(isPrime==true) System.out.println("The number is prime");
	else System.out.println("The number is NOT prime");
	
	//to print the prime nos. from 1 to 500
	Boolean isItPrime=true;
	
	for(int i=2; i<=500; i++) {//numbers to be checked 
		
		for(int j=2; j<i; j++) {
			
			if(i%j==0) {//divisible so not prime
				isItPrime=false;
				break;
			}	
		
	}
		if(isItPrime==true) System.out.print(i+" ");
		isItPrime= true;
	
	
	}
	System.out.println();
	
	//printing the prime number count from 1 to 500
Boolean isItReallyPrime =true;
int count=0;
	
	for(int i=2; i<=500; i++) {//numbers to be checked 
		
		for(int j=2; j<i; j++) {
			
			if(i%j==0) {//divisible so not prime
				isItReallyPrime=false;
				break;
			}	
		
	}
		if(isItReallyPrime==true) count++;
		isItReallyPrime= true;
	
	
	}
	System.out.println("The prime number from 1 to 500 is: "+ count);

}//main ends here
	}//class ends here
