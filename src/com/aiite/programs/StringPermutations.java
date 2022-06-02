package com.aiite.programs;

import java.util.Set;
import java.util.TreeSet;

public class StringPermutations {

	public static void main(String[] args) {
		String object = "bat";
		String temp= "";

		Set<String> permutations = new TreeSet<String>();

		for(int i=0; i<object.length();i++) {
				temp = Character.toString(object.charAt(i));
				temp = temp+object.charAt(i+1)+object.charAt(i+2);
System.out.println(temp);

		}

	}

}
