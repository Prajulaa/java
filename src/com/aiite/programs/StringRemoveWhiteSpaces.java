package com.aiite.programs;

import java.util.Scanner;

public class StringRemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		
		//method 1
		String[] words = input.split(" ");
		for(String word:  words) {
			System.out.print(word);
		}
		 System.out.println();
		
		//method 2
		String removeSpace = input.replace(" ", "");
		System.out.println(removeSpace);
		
		

	}

}
