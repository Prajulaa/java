package com.aiite.evaluation;

import java.util.Set;
import java.util.TreeSet;

public class PrintEvenAndOdd{

	public static void main(String[] args) {	
		
		Set<Integer> evenNumbers = new TreeSet<Integer>();
		Set<Integer> oddNumbers = new TreeSet<Integer>();		

for(int i=1; i<=10; i++) {
	if(i%2==0) {
		evenNumbers.add(i);
	}
	else {
		oddNumbers.add(i);
	}

}
System.out.println("The even numbers from 1 to 10 are: ");
System.out.println(evenNumbers);

System.out.println("The odd numbers from 1 to 10 are: ");
System.out.println(oddNumbers);




	}

}
