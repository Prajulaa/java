package com.aiite.programs;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		//		1
		//		2 3
		//		4 5 6
		//		7 8 9 10 - console output
		Scanner sc = new Scanner(System.in);

		//to print a number pyramid till n rows
		int rowsToBePrinted = sc.nextInt();
		int value=1;

		for(int i= 1; i<=rowsToBePrinted;i++) {

			for(int j=1; j<=i; j++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}

		//to print a number pyramid till a particular number
		int tillThisNumber = sc.nextInt();
		int num = 1;

			for(int i=1; i<tillThisNumber; i++) {
				
				System.out.println(num);
				for(int j=1; j<=i; j++){
					System.out.print(num);
					num++;
				}
				System.out.println();
				if(num>=tillThisNumber) break;
			}

		}
	}

