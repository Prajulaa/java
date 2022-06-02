package com.aiite.basics;

import java.util.Scanner;

public class NumberPyramid {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		//1 to userInput 
		for(int i=1; i<=userInput; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		//userInput to 1
for(int i=userInput; i>=1; i--) {
			
			for(int j=userInput; j<=i; j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		



	}

}

/*

1
12
123
1234
12345

*/