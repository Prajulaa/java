package com.aiite.exceptions;

import java.util.*;

public class ExceptionHandling {
	int randomValue=115;
	

	public static void main(String[] args) {
		
		System.out.println("Please enter your age");
		Scanner sc= new Scanner(System.in);
		int ag = sc.nextByte();
		System.out.println(ag);
		
		try {
		System.out.println("Please enter your age");
		byte age = sc.nextByte();
		System.out.println("Age is: "+ age);
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid age");
			
		}
		finally {
			System.out.println("Please enter a valid age and try again");
			sc.close();
		}
		

	}

}

//
//catch (IOException|SQLException ex) {
//    logger.log(ex);
//    throw ex;
//}
//Note: If a catch block handles more than one exception type, then the catch parameter is implicitly final. 
//In this example, the catch parameter ex is final and therefore you cannot assign any values to it within the catch block.