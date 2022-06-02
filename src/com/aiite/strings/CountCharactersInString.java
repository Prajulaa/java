package com.aiite.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharactersInString {

	public static void main(String[] args) {

		String name = "Prajula and her sister Vilasini and her buddy are going out tonite";

		Map<String, Integer> nameMap = new LinkedHashMap<>();
		String nameLowerCase = name.toLowerCase();

		String[] nameArray = nameLowerCase.split(" ");
		for(int i=0; i<nameArray.length; i++) {

			if(nameMap.containsKey(nameArray[i])) {
				nameMap.put( nameArray[i] , nameMap.get(nameArray[i])+1);
			}
			else {
				nameMap.put(nameArray[i], 1);
			}
		}
		System.out.println(nameMap);	


	}//main ends here

}
