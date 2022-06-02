package com.aiite.strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Malayalam";
		String casing = name.toLowerCase();
		String reverse = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			char value = casing.charAt(i);
			reverse=reverse+value;
			
		}
		System.out.println(name);
       System.out.println(reverse);
       if(casing.equals(reverse)) {
    	   System.out.println("The entered string is a Palindrome");
       }
       else {
    	   System.out.println("The entered string is NOT a Palindrome");
       }
	}

}
