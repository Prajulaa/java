package com.aiite.strings;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class StringVariable {

	public static void main(String[] args) {
	String actorName = "Tom Holland";
	int heroAge = 25;
	String heroName ="Tom Holland";
	heroName ="Chris Hemsworth";
	heroAge=40;
	methodToCheckString(heroAge, heroName);
	String spidermanRealName = new String("Tom Holland");
System.out.println(actorName == heroName);
System.out.println(spidermanRealName == heroName);

LocalDateTime time =  LocalDateTime.now();
System.out.println(time);
	}
	
	
static void methodToCheckString(int heroAge, String heroName ) {
	
	System.out.println(heroName + " is "+ heroAge + " years old.");
}
}
