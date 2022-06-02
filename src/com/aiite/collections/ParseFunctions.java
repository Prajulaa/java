package com.aiite.collections;

import java.time.Period;

public class ParseFunctions {

	public static void main(String[] args) {
		String prajulaMark = "47";
		String percentage ="97";
		
		System.out.println(Integer.parseInt(prajulaMark));
		System.out.println(Byte.parseByte(percentage));
		System.out.println(Short.parseShort(prajulaMark));
		System.out.println(Long.parseLong(prajulaMark));
		
		System.out.println(Double.parseDouble(prajulaMark));
		System.out.println(Float.parseFloat(prajulaMark));
		
		/*
		 * There is no parse method in Character Class but you can get the character value using getNumericValue method
		 */
//		System.out.println(Character.getNumericValue('Z')); 
//		System.out.println(Character.getNumericValue('z')); 
		
		 //this is the parse method in the period class
		 String age = "P17Y9M5D";

	     // Converting strings into period value
	     // using parse() method
	     Period p = Period.parse(age);
	     System.out.println(p.getYears() + "Years");
	     System.out.println(p.getMonths()+ "Months");
	     System.out.println(p.getDays()+ "Days");
	     
	     int a = 13;
	     byte b = (byte) a;
	     System.out.println(b);
	}
	 
    

}
