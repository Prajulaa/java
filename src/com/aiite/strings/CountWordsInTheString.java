package com.aiite.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWordsInTheString {

	public static void main(String[] args) {

		//finding the total words in the string
		String sentence = "This is prajula and this is her boyfriend";
		String[] sentenceWords = sentence.split(" ");
		System.out.println("The number of words in the sentence is: "+ sentenceWords.length);
		
		//count of every word present in the string
		String value = sentence.toLowerCase();
		String[] valueWords = value.split(" ");
		
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		
		for(int i=0; i<valueWords.length; i++) {
			
			if(wordCount.containsKey(valueWords[i])) {
				int valueCount = wordCount.get(valueWords[i]);
				wordCount.put(sentenceWords[i], valueCount+1);
			}
			
			else {
				wordCount.put(valueWords[i], 1);
			}	
		}

System.out.println(wordCount);

//find out the number of characters in the string
String fullName = "Prajula Ravichandran";

for(int i=0;i<fullName.length(); i++) {
	
	
}





	}//main ends here

}
