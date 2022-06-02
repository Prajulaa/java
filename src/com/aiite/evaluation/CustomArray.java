package com.aiite.evaluation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CustomArray {
	String name;
	String colour;
	String bio;
	
	CustomArray(String name, String colour,String bio ){
		 this.name =name;
		 this.colour = colour;
		 this.bio = bio;	
	}
	public static void main(String[] args) {
		int num=1;
		
		CustomArray prajula = new CustomArray("Prajula","Yellow/Orange", "a nice person");
		CustomArray gokul = new CustomArray("Gokul", "Black", "a vera level youtuber");
		CustomArray sambath = new CustomArray("Mayuri", "Red", "a marana coder");
		
		CustomArray[] Batch1StudentData = {prajula, gokul, sambath};
		
		List<CustomArray> arrayToList = new LinkedList<CustomArray>(Arrays.asList(Batch1StudentData));
		
		System.out.println(arrayToList);
		
		for(CustomArray studentData:Batch1StudentData ) {
			 System.out.println(num+". "+ "Hi my name is "+ studentData.name +". My fav colour is "+studentData.colour+" and I am a "+studentData.bio);
			 num++;
			}

}
}