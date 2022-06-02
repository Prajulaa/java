package com.aiite.strings;

public class CharNumCount {

	public static void main(String[] args) {
		String userName = "Ra65";
		String charValue = "";
		String numValue ="";
		String specialCharValue="";

		for(int i=0; i<userName.length(); i++) {
			char character = userName.charAt(i);
			if(character>='0')
				if(character<='9') {
					numValue = numValue+character;
				}

			if(character>='a')
				if(character<='z') {
					charValue = charValue+character;

				}
			if(character>='A')
				if(character<='Z') {
					charValue = charValue+character;
				}
			
		}
		System.out.println(charValue);
		System.out.println(numValue);

	}

}
