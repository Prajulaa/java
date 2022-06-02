package com.aiite.exceptions;

import java.util.Scanner;

public class CustomException extends Exception{
	

	public String getMessage() {
		return "Please enter a age between 15 to 50";
	}
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			
			if((age<15)||(age>50)) {
				throw new CustomException();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			count++;
		}
		finally {
			if(count==0) {
				System.out.println("Your data is saved successfully");
				sc.close();
			}
			else {
			sc.close();
			System.out.println("Please try again");
			}
		}
		
		
		
	}
	
	

}
