package com.aiite.exceptions;

public class UserDefinedException extends Exception {

	@Override
 public String getMessage() {
	 return "You are not eligible to use social media yet";
 }
	
	
	public static void main(String[] args) {
		int age= 12;
		
		try {
			if(age<18) {
				throw new UserDefinedException();
			}
			
		}
		catch(UserDefinedException e){
			System.out.println(e.getMessage());
		
		}
		

	}

}
