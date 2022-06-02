package com.aiite.strings;

public class ReverseString {

	public static void main(String[] args) {
	String name = "Zendeya Tom Holland";
String reverse="";
	//Split the String
	String[] nameArray = name.split(" ");
	
	for(String oneName : nameArray) {
		
		System.out.println(oneName);
	}
	
	//reverse a string
	for(int i=name.length()-1; i>=0; i--) {
		char c = name.charAt(i);
		reverse = reverse+c;
		
	}
	
System.out.println(reverse);
	}

}
