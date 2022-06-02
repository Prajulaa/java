package com.aiite.evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomCollection {
	String name;
	String colour;
	String bio;
	
	CustomCollection(String name, String colour,String bio ){
		 this.name =name;
		 this.colour = colour;
		 this.bio = bio;	
	}
	
	 void evenNumberCheck(int num) {
		if(num%2!=0) {
		System.out.println("this is a odd numer");
		return;
		}
	    System.out.println("even number");
	   
	}
 
	 
	public static void main(String[] args) {
		
		CustomCollection prajula = new CustomCollection("Prajula","Yellow/Orange", "a nice person");
		CustomCollection gokul = new CustomCollection("Gokul", "Black", "a vera level youtuber");
		CustomCollection sambath = new CustomCollection("Mayuri", "Red", "a marana coder");
		
		prajula.evenNumberCheck(3);
		
		List<CustomCollection> batch1StudentsData = new ArrayList<CustomCollection>();
		batch1StudentsData.add(prajula);
		batch1StudentsData.add(gokul);
		batch1StudentsData.add(sambath);
	
		for(CustomCollection studentData:batch1StudentsData ) {
		 System.out.println("Hi my name is "+ studentData.name +"\nMy fav colour is "+studentData.colour+" and I am a "+studentData.bio);
		}
		
		
		
	}

}
