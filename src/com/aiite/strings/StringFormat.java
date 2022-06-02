package com.aiite.strings;

public class StringFormat {

	public static void main(String[] args) {
	   
		int salary = 45_000;
		
		System.out.println(salary);
		//System.out.println(String.format( %,d  , salary));
		
		
		//Escape Sequence
		System.out.println("This is an valid example for an escape sequence");
		System.out.println("Your monthly income is:" + salary);
		System.out.println("Your monthly income is:\t " + salary);
		System.out.println("This is Prajula \'Ravichandran\'");
		System.out.println("This is Prajula \''Ravichandran\''");
		System.out.println("She said \\she is \"eating healthy\"");
		
		System.out.println("This is Prajula \r'Ravichandran\'");
		
		
	}

}
